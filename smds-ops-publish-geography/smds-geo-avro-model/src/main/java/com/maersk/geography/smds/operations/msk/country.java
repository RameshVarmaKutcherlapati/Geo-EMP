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
/** Country Details */
@org.apache.avro.specific.AvroGenerated
public class country extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4520874202996413566L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"country\",\"namespace\":\"com.maersk.geography.smds.operations.msk\",\"doc\":\"Country Details\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"alternateCodes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"countryAlternateCodes\",\"doc\":\"Country AlternateCode Details\",\"fields\":[{\"name\":\"codeType\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"}]}}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<country> ENCODER =
      new BinaryMessageEncoder<country>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<country> DECODER =
      new BinaryMessageDecoder<country>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<country> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<country> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<country>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this country to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a country from a ByteBuffer. */
  public static country fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence type;
  @Deprecated public java.util.List<com.maersk.geography.smds.operations.msk.countryAlternateCodes> alternateCodes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public country() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param type The new value for type
   * @param alternateCodes The new value for alternateCodes
   */
  public country(java.lang.CharSequence name, java.lang.CharSequence type, java.util.List<com.maersk.geography.smds.operations.msk.countryAlternateCodes> alternateCodes) {
    this.name = name;
    this.type = type;
    this.alternateCodes = alternateCodes;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return type;
    case 2: return alternateCodes;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: type = (java.lang.CharSequence)value$; break;
    case 2: alternateCodes = (java.util.List<com.maersk.geography.smds.operations.msk.countryAlternateCodes>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'alternateCodes' field.
   * @return The value of the 'alternateCodes' field.
   */
  public java.util.List<com.maersk.geography.smds.operations.msk.countryAlternateCodes> getAlternateCodes() {
    return alternateCodes;
  }

  /**
   * Sets the value of the 'alternateCodes' field.
   * @param value the value to set.
   */
  public void setAlternateCodes(java.util.List<com.maersk.geography.smds.operations.msk.countryAlternateCodes> value) {
    this.alternateCodes = value;
  }

  /**
   * Creates a new country RecordBuilder.
   * @return A new country RecordBuilder
   */
  public static com.maersk.geography.smds.operations.msk.country.Builder newBuilder() {
    return new com.maersk.geography.smds.operations.msk.country.Builder();
  }

  /**
   * Creates a new country RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new country RecordBuilder
   */
  public static com.maersk.geography.smds.operations.msk.country.Builder newBuilder(com.maersk.geography.smds.operations.msk.country.Builder other) {
    return new com.maersk.geography.smds.operations.msk.country.Builder(other);
  }

  /**
   * Creates a new country RecordBuilder by copying an existing country instance.
   * @param other The existing instance to copy.
   * @return A new country RecordBuilder
   */
  public static com.maersk.geography.smds.operations.msk.country.Builder newBuilder(com.maersk.geography.smds.operations.msk.country other) {
    return new com.maersk.geography.smds.operations.msk.country.Builder(other);
  }

  /**
   * RecordBuilder for country instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<country>
    implements org.apache.avro.data.RecordBuilder<country> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence type;
    private java.util.List<com.maersk.geography.smds.operations.msk.countryAlternateCodes> alternateCodes;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.maersk.geography.smds.operations.msk.country.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.alternateCodes)) {
        this.alternateCodes = data().deepCopy(fields()[2].schema(), other.alternateCodes);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing country instance
     * @param other The existing instance to copy.
     */
    private Builder(com.maersk.geography.smds.operations.msk.country other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.alternateCodes)) {
        this.alternateCodes = data().deepCopy(fields()[2].schema(), other.alternateCodes);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.country.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.country.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.country.Builder setType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.country.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'alternateCodes' field.
      * @return The value.
      */
    public java.util.List<com.maersk.geography.smds.operations.msk.countryAlternateCodes> getAlternateCodes() {
      return alternateCodes;
    }

    /**
      * Sets the value of the 'alternateCodes' field.
      * @param value The value of 'alternateCodes'.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.country.Builder setAlternateCodes(java.util.List<com.maersk.geography.smds.operations.msk.countryAlternateCodes> value) {
      validate(fields()[2], value);
      this.alternateCodes = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'alternateCodes' field has been set.
      * @return True if the 'alternateCodes' field has been set, false otherwise.
      */
    public boolean hasAlternateCodes() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'alternateCodes' field.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.country.Builder clearAlternateCodes() {
      alternateCodes = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public country build() {
      try {
        country record = new country();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.alternateCodes = fieldSetFlags()[2] ? this.alternateCodes : (java.util.List<com.maersk.geography.smds.operations.msk.countryAlternateCodes>) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<country>
    WRITER$ = (org.apache.avro.io.DatumWriter<country>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<country>
    READER$ = (org.apache.avro.io.DatumReader<country>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
