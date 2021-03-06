/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.maersk.geography.smds.operations.msk;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** AlternateCodes Details */
@org.apache.avro.specific.AvroGenerated
public class alternateCodes extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 494517462597028088L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"alternateCodes\",\"namespace\":\"com.maersk.geography.smds.operations.msk\",\"doc\":\"AlternateCodes Details\",\"fields\":[{\"name\":\"codeType\",\"type\":[\"null\",\"string\"]},{\"name\":\"code\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<alternateCodes> ENCODER =
      new BinaryMessageEncoder<alternateCodes>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<alternateCodes> DECODER =
      new BinaryMessageDecoder<alternateCodes>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<alternateCodes> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<alternateCodes> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<alternateCodes>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this alternateCodes to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a alternateCodes from a ByteBuffer. */
  public static alternateCodes fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence codeType;
  @Deprecated public java.lang.CharSequence code;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public alternateCodes() {}

  /**
   * All-args constructor.
   * @param codeType The new value for codeType
   * @param code The new value for code
   */
  public alternateCodes(java.lang.CharSequence codeType, java.lang.CharSequence code) {
    this.codeType = codeType;
    this.code = code;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return codeType;
    case 1: return code;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: codeType = (java.lang.CharSequence)value$; break;
    case 1: code = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'codeType' field.
   * @return The value of the 'codeType' field.
   */
  public java.lang.CharSequence getCodeType() {
    return codeType;
  }

  /**
   * Sets the value of the 'codeType' field.
   * @param value the value to set.
   */
  public void setCodeType(java.lang.CharSequence value) {
    this.codeType = value;
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }

  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Creates a new alternateCodes RecordBuilder.
   * @return A new alternateCodes RecordBuilder
   */
  public static com.maersk.geography.smds.operations.msk.alternateCodes.Builder newBuilder() {
    return new com.maersk.geography.smds.operations.msk.alternateCodes.Builder();
  }

  /**
   * Creates a new alternateCodes RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new alternateCodes RecordBuilder
   */
  public static com.maersk.geography.smds.operations.msk.alternateCodes.Builder newBuilder(com.maersk.geography.smds.operations.msk.alternateCodes.Builder other) {
    return new com.maersk.geography.smds.operations.msk.alternateCodes.Builder(other);
  }

  /**
   * Creates a new alternateCodes RecordBuilder by copying an existing alternateCodes instance.
   * @param other The existing instance to copy.
   * @return A new alternateCodes RecordBuilder
   */
  public static com.maersk.geography.smds.operations.msk.alternateCodes.Builder newBuilder(com.maersk.geography.smds.operations.msk.alternateCodes other) {
    return new com.maersk.geography.smds.operations.msk.alternateCodes.Builder(other);
  }

  /**
   * RecordBuilder for alternateCodes instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<alternateCodes>
    implements org.apache.avro.data.RecordBuilder<alternateCodes> {

    private java.lang.CharSequence codeType;
    private java.lang.CharSequence code;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.maersk.geography.smds.operations.msk.alternateCodes.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.codeType)) {
        this.codeType = data().deepCopy(fields()[0].schema(), other.codeType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing alternateCodes instance
     * @param other The existing instance to copy.
     */
    private Builder(com.maersk.geography.smds.operations.msk.alternateCodes other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.codeType)) {
        this.codeType = data().deepCopy(fields()[0].schema(), other.codeType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'codeType' field.
      * @return The value.
      */
    public java.lang.CharSequence getCodeType() {
      return codeType;
    }

    /**
      * Sets the value of the 'codeType' field.
      * @param value The value of 'codeType'.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.alternateCodes.Builder setCodeType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.codeType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'codeType' field has been set.
      * @return True if the 'codeType' field has been set, false otherwise.
      */
    public boolean hasCodeType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'codeType' field.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.alternateCodes.Builder clearCodeType() {
      codeType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public java.lang.CharSequence getCode() {
      return code;
    }

    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.alternateCodes.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.code = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.alternateCodes.Builder clearCode() {
      code = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public alternateCodes build() {
      try {
        alternateCodes record = new alternateCodes();
        record.codeType = fieldSetFlags()[0] ? this.codeType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.code = fieldSetFlags()[1] ? this.code : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<alternateCodes>
    WRITER$ = (org.apache.avro.io.DatumWriter<alternateCodes>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<alternateCodes>
    READER$ = (org.apache.avro.io.DatumReader<alternateCodes>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
