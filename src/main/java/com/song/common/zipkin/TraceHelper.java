package com.song.common.zipkin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.song.common.model.ZipkinTraceContext;

import brave.Span;
import brave.Tracer;
import brave.Tracing;
import brave.internal.Platform;
import brave.propagation.TraceContext;
import brave.sampler.Sampler;
import zipkin2.reporter.AsyncReporter;
import zipkin2.reporter.Sender;
import zipkin2.reporter.kafka11.KafkaSender;
@Component
public class TraceHelper {
	@Value("${kafkaServer}")
	private String kafkaServer;
	
	@Value("${serviceName}")
	private String serviceName;
	
	@Value("${rate}")
	private float rate;
	
	private static Tracer tracer;
	
	@PostConstruct
	public void init() {
		Sender sender = KafkaSender.create(kafkaServer);
		AsyncReporter spanReporter = AsyncReporter.create(sender);
		Tracing tracing = Tracing.newBuilder().sampler(Sampler.create(rate))
	            .localServiceName(serviceName)
	            .spanReporter(spanReporter)
	            .build();
		TraceHelper.tracer = tracing.tracer();
	}

	
	public static Span getSpan() {
		Span span = TraceContextHelper.getSpan();
		if (span == null) {
			span = TraceHelper.tracer.newTrace();
		}else {
			span = TraceHelper.tracer.joinSpan(TraceContext.newBuilder().traceId(span.context().traceId())
				.parentId(span.context().spanId()).sampled(span.context().sampled()).spanId(Platform.get().randomLong())
				.debug(span.context().debug())
				.build());
		}
		return span;
	}
	
	public static void csStart(Span span) {
		span.annotate("cs").start();
	}
	
	public static void crFinish(Span span) {
		span.annotate("cr").finish();	
	}
	
	public static void srStart(ZipkinTraceContext context, String name, String method) {
		Span span = TraceHelper.tracer.joinSpan(TraceContext.newBuilder().traceId(context.getTraceId())
				.parentId(context.getParentId()).sampled(context.isSampled()).spanId(context.getSpanId())
				.debug(context.isDebug())
				.build()).name(name).annotate("sr").tag("method", method).start();
		TraceContextHelper.setSpan(span);
	}
	
	public static void addInfo(String tag, String msg) {
		TraceContextHelper.getSpan().tag(tag, msg);
	}
	
	public static void ssFinish() {
		TraceContextHelper.getSpan().annotate("ss").finish();
		TraceContextHelper.remove();
	}

}
