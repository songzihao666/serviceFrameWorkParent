/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.song.common.model;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-07-12")
public class Args implements org.apache.thrift.TBase<Args, Args._Fields>, java.io.Serializable, Cloneable, Comparable<Args> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Args");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JDATA_FIELD_DESC = new org.apache.thrift.protocol.TField("jdata", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CTX_FIELD_DESC = new org.apache.thrift.protocol.TField("ctx", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ArgsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ArgsTupleSchemeFactory();

  public int type; // required
  public java.lang.String jdata; // required
  public java.nio.ByteBuffer data; // required
  public ZipkinTraceContext ctx; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    JDATA((short)2, "jdata"),
    DATA((short)3, "data"),
    CTX((short)4, "ctx");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // JDATA
          return JDATA;
        case 3: // DATA
          return DATA;
        case 4: // CTX
          return CTX;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TYPE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.JDATA, new org.apache.thrift.meta_data.FieldMetaData("jdata", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.CTX, new org.apache.thrift.meta_data.FieldMetaData("ctx", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ZipkinTraceContext.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Args.class, metaDataMap);
  }

  public Args() {
  }

  public Args(
    int type,
    java.lang.String jdata,
    java.nio.ByteBuffer data,
    ZipkinTraceContext ctx)
  {
    this();
    this.type = type;
    setTypeIsSet(true);
    this.jdata = jdata;
    this.data = org.apache.thrift.TBaseHelper.copyBinary(data);
    this.ctx = ctx;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Args(Args other) {
    __isset_bitfield = other.__isset_bitfield;
    this.type = other.type;
    if (other.isSetJdata()) {
      this.jdata = other.jdata;
    }
    if (other.isSetData()) {
      this.data = org.apache.thrift.TBaseHelper.copyBinary(other.data);
    }
    if (other.isSetCtx()) {
      this.ctx = new ZipkinTraceContext(other.ctx);
    }
  }

  public Args deepCopy() {
    return new Args(this);
  }

  @Override
  public void clear() {
    setTypeIsSet(false);
    this.type = 0;
    this.jdata = null;
    this.data = null;
    this.ctx = null;
  }

  public int getType() {
    return this.type;
  }

  public Args setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TYPE_ISSET_ID, value);
  }

  public java.lang.String getJdata() {
    return this.jdata;
  }

  public Args setJdata(java.lang.String jdata) {
    this.jdata = jdata;
    return this;
  }

  public void unsetJdata() {
    this.jdata = null;
  }

  /** Returns true if field jdata is set (has been assigned a value) and false otherwise */
  public boolean isSetJdata() {
    return this.jdata != null;
  }

  public void setJdataIsSet(boolean value) {
    if (!value) {
      this.jdata = null;
    }
  }

  public byte[] getData() {
    setData(org.apache.thrift.TBaseHelper.rightSize(data));
    return data == null ? null : data.array();
  }

  public java.nio.ByteBuffer bufferForData() {
    return org.apache.thrift.TBaseHelper.copyBinary(data);
  }

  public Args setData(byte[] data) {
    this.data = data == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(data.clone());
    return this;
  }

  public Args setData(java.nio.ByteBuffer data) {
    this.data = org.apache.thrift.TBaseHelper.copyBinary(data);
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public ZipkinTraceContext getCtx() {
    return this.ctx;
  }

  public Args setCtx(ZipkinTraceContext ctx) {
    this.ctx = ctx;
    return this;
  }

  public void unsetCtx() {
    this.ctx = null;
  }

  /** Returns true if field ctx is set (has been assigned a value) and false otherwise */
  public boolean isSetCtx() {
    return this.ctx != null;
  }

  public void setCtxIsSet(boolean value) {
    if (!value) {
      this.ctx = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.Integer)value);
      }
      break;

    case JDATA:
      if (value == null) {
        unsetJdata();
      } else {
        setJdata((java.lang.String)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        if (value instanceof byte[]) {
          setData((byte[])value);
        } else {
          setData((java.nio.ByteBuffer)value);
        }
      }
      break;

    case CTX:
      if (value == null) {
        unsetCtx();
      } else {
        setCtx((ZipkinTraceContext)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case JDATA:
      return getJdata();

    case DATA:
      return getData();

    case CTX:
      return getCtx();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case JDATA:
      return isSetJdata();
    case DATA:
      return isSetData();
    case CTX:
      return isSetCtx();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Args)
      return this.equals((Args)that);
    return false;
  }

  public boolean equals(Args that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
        return false;
    }

    boolean this_present_jdata = true && this.isSetJdata();
    boolean that_present_jdata = true && that.isSetJdata();
    if (this_present_jdata || that_present_jdata) {
      if (!(this_present_jdata && that_present_jdata))
        return false;
      if (!this.jdata.equals(that.jdata))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_ctx = true && this.isSetCtx();
    boolean that_present_ctx = true && that.isSetCtx();
    if (this_present_ctx || that_present_ctx) {
      if (!(this_present_ctx && that_present_ctx))
        return false;
      if (!this.ctx.equals(that.ctx))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + type;

    hashCode = hashCode * 8191 + ((isSetJdata()) ? 131071 : 524287);
    if (isSetJdata())
      hashCode = hashCode * 8191 + jdata.hashCode();

    hashCode = hashCode * 8191 + ((isSetData()) ? 131071 : 524287);
    if (isSetData())
      hashCode = hashCode * 8191 + data.hashCode();

    hashCode = hashCode * 8191 + ((isSetCtx()) ? 131071 : 524287);
    if (isSetCtx())
      hashCode = hashCode * 8191 + ctx.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Args other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetJdata()).compareTo(other.isSetJdata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJdata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jdata, other.jdata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCtx()).compareTo(other.isSetCtx());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCtx()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ctx, other.ctx);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Args(");
    boolean first = true;

    sb.append("type:");
    sb.append(this.type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jdata:");
    if (this.jdata == null) {
      sb.append("null");
    } else {
      sb.append(this.jdata);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.data, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ctx:");
    if (this.ctx == null) {
      sb.append("null");
    } else {
      sb.append(this.ctx);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (ctx != null) {
      ctx.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ArgsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ArgsStandardScheme getScheme() {
      return new ArgsStandardScheme();
    }
  }

  private static class ArgsStandardScheme extends org.apache.thrift.scheme.StandardScheme<Args> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Args struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = iprot.readI32();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JDATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jdata = iprot.readString();
              struct.setJdataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.data = iprot.readBinary();
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CTX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ctx = new ZipkinTraceContext();
              struct.ctx.read(iprot);
              struct.setCtxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Args struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(struct.type);
      oprot.writeFieldEnd();
      if (struct.jdata != null) {
        oprot.writeFieldBegin(JDATA_FIELD_DESC);
        oprot.writeString(struct.jdata);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        oprot.writeBinary(struct.data);
        oprot.writeFieldEnd();
      }
      if (struct.ctx != null) {
        oprot.writeFieldBegin(CTX_FIELD_DESC);
        struct.ctx.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ArgsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ArgsTupleScheme getScheme() {
      return new ArgsTupleScheme();
    }
  }

  private static class ArgsTupleScheme extends org.apache.thrift.scheme.TupleScheme<Args> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Args struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetJdata()) {
        optionals.set(1);
      }
      if (struct.isSetData()) {
        optionals.set(2);
      }
      if (struct.isSetCtx()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type);
      }
      if (struct.isSetJdata()) {
        oprot.writeString(struct.jdata);
      }
      if (struct.isSetData()) {
        oprot.writeBinary(struct.data);
      }
      if (struct.isSetCtx()) {
        struct.ctx.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Args struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.type = iprot.readI32();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jdata = iprot.readString();
        struct.setJdataIsSet(true);
      }
      if (incoming.get(2)) {
        struct.data = iprot.readBinary();
        struct.setDataIsSet(true);
      }
      if (incoming.get(3)) {
        struct.ctx = new ZipkinTraceContext();
        struct.ctx.read(iprot);
        struct.setCtxIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

