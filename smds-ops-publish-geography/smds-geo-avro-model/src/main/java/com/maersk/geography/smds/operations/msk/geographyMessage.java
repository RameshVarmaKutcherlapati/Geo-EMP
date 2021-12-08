/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.maersk.geography.smds.operations.msk;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class geographyMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -776941696132021421L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"geographyMessage\",\"namespace\":\"com.maersk.geography.smds.operations.msk\",\"fields\":[{\"name\":\"geography\",\"type\":{\"type\":\"record\",\"name\":\"geography\",\"doc\":\"Geography Entity Information Which includes subcity,city,state,country,continent and their respective Alternate name and Code Information\",\"fields\":[{\"name\":\"geoId\",\"type\":\"string\"},{\"name\":\"geoType\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"validFrom\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"validTo\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}},{\"name\":\"longitude\",\"type\":[\"null\",\"string\"]},{\"name\":\"latitude\",\"type\":[\"null\",\"string\"]},{\"name\":\"timeZone\",\"type\":[\"null\",\"string\"]},{\"name\":\"daylightSavingTime\",\"type\":[\"null\",\"string\"]},{\"name\":\"utcOffsetMinutes\",\"type\":[\"null\",\"string\"]},{\"name\":\"daylightSavingStart\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"}],\"default\":null},{\"name\":\"daylightSavingEnd\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"}],\"default\":null},{\"name\":\"daylightSavingShiftMinutes\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"workaroundReason\",\"type\":[\"null\",\"string\"]},{\"name\":\"restricted\",\"type\":[\"null\",\"string\"]},{\"name\":\"postalCodeMandatory\",\"type\":[\"null\",\"string\"]},{\"name\":\"stateProvienceMandatory\",\"type\":[\"null\",\"string\"]},{\"name\":\"dialingCode\",\"type\":[\"null\",\"string\"]},{\"name\":\"dialingCodeDescription\",\"type\":[\"null\",\"string\"]},{\"name\":\"portFlag\",\"type\":\"boolean\",\"default\":false},{\"name\":\"olsonTimezone\",\"type\":[\"null\",\"string\"]},{\"name\":\"bdaType\",\"type\":[\"null\",\"string\"]},{\"name\":\"hsudName\",\"type\":[\"null\",\"string\"]},{\"name\":\"alternateNames\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"alternateName\",\"doc\":\"AlternateNames Details\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"status\",\"type\":\"string\"}]}}]},{\"name\":\"alternateCodes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"alternateCode\",\"doc\":\"AlternateCodes Details\",\"fields\":[{\"name\":\"codeType\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"}]}}},{\"name\":\"countries\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"country\",\"doc\":\"Country Details\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"alternateCodes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"countryAlternateCode\",\"doc\":\"Country AlternateCode Details\",\"fields\":[{\"name\":\"codeType\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"}]}}]}]}}]},{\"name\":\"parent\",\"type\":{\"type\":\"record\",\"name\":\"parent\",\"doc\":\"Display Parent Information.For city Copenghagen  the parent is country Denmark\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"bdaType\",\"type\":[\"null\",\"string\"]},{\"name\":\"alternateCodes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"parentAlternateCode\",\"doc\":\"Parent AlternateCode details\",\"fields\":[{\"name\":\"codeType\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"}]}}]}]}},{\"name\":\"subCityParents\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"subCityParent\",\"doc\":\"Display Sub City Parent Information.For city Pune the sub cities are like viman nagar and so on\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"bdaType\",\"type\":[\"null\",\"string\"]},{\"name\":\"alternateCodes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"subCityParentAlternateCode\",\"doc\":\"SubCityParent AlternateCode details\",\"fields\":[{\"name\":\"codeType\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"}]}}]}]}}]},{\"name\":\"bdas\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"bda\",\"doc\":\"Display business defined area information. Example : North India,West & Central Asia and so on\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"bdaType\",\"type\":\"string\"},{\"name\":\"alternateCodes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"bdaAlternateCode\",\"doc\":\"BDA AlternateCode details\",\"fields\":[{\"name\":\"codeType\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"}]}}]}]}}]},{\"name\":\"bdaLocations\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"bdaLocation\",\"doc\":\"Display business defined area location and status information. Example : Liberty city\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"alternateCodes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"bdaLocationAlternateCode\",\"doc\":\"BDALocation AlternateCode Details\",\"fields\":[{\"name\":\"codeType\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"}]}}]}]}}]}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<geographyMessage> ENCODER =
      new BinaryMessageEncoder<geographyMessage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<geographyMessage> DECODER =
      new BinaryMessageDecoder<geographyMessage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<geographyMessage> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<geographyMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<geographyMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<geographyMessage>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this geographyMessage to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a geographyMessage from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a geographyMessage instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static geographyMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.maersk.geography.smds.operations.msk.geography geography;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public geographyMessage() {}

  /**
   * All-args constructor.
   * @param geography The new value for geography
   */
  public geographyMessage(com.maersk.geography.smds.operations.msk.geography geography) {
    this.geography = geography;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return geography;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: geography = (com.maersk.geography.smds.operations.msk.geography)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'geography' field.
   * @return The value of the 'geography' field.
   */
  public com.maersk.geography.smds.operations.msk.geography getGeography() {
    return geography;
  }


  /**
   * Sets the value of the 'geography' field.
   * @param value the value to set.
   */
  public void setGeography(com.maersk.geography.smds.operations.msk.geography value) {
    this.geography = value;
  }

  /**
   * Creates a new geographyMessage RecordBuilder.
   * @return A new geographyMessage RecordBuilder
   */
  public static com.maersk.geography.smds.operations.msk.geographyMessage.Builder newBuilder() {
    return new com.maersk.geography.smds.operations.msk.geographyMessage.Builder();
  }

  /**
   * Creates a new geographyMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new geographyMessage RecordBuilder
   */
  public static com.maersk.geography.smds.operations.msk.geographyMessage.Builder newBuilder(com.maersk.geography.smds.operations.msk.geographyMessage.Builder other) {
    if (other == null) {
      return new com.maersk.geography.smds.operations.msk.geographyMessage.Builder();
    } else {
      return new com.maersk.geography.smds.operations.msk.geographyMessage.Builder(other);
    }
  }

  /**
   * Creates a new geographyMessage RecordBuilder by copying an existing geographyMessage instance.
   * @param other The existing instance to copy.
   * @return A new geographyMessage RecordBuilder
   */
  public static com.maersk.geography.smds.operations.msk.geographyMessage.Builder newBuilder(com.maersk.geography.smds.operations.msk.geographyMessage other) {
    if (other == null) {
      return new com.maersk.geography.smds.operations.msk.geographyMessage.Builder();
    } else {
      return new com.maersk.geography.smds.operations.msk.geographyMessage.Builder(other);
    }
  }

  /**
   * RecordBuilder for geographyMessage instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<geographyMessage>
    implements org.apache.avro.data.RecordBuilder<geographyMessage> {

    private com.maersk.geography.smds.operations.msk.geography geography;
    private com.maersk.geography.smds.operations.msk.geography.Builder geographyBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.maersk.geography.smds.operations.msk.geographyMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.geography)) {
        this.geography = data().deepCopy(fields()[0].schema(), other.geography);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasGeographyBuilder()) {
        this.geographyBuilder = com.maersk.geography.smds.operations.msk.geography.newBuilder(other.getGeographyBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing geographyMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(com.maersk.geography.smds.operations.msk.geographyMessage other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.geography)) {
        this.geography = data().deepCopy(fields()[0].schema(), other.geography);
        fieldSetFlags()[0] = true;
      }
      this.geographyBuilder = null;
    }

    /**
      * Gets the value of the 'geography' field.
      * @return The value.
      */
    public com.maersk.geography.smds.operations.msk.geography getGeography() {
      return geography;
    }


    /**
      * Sets the value of the 'geography' field.
      * @param value The value of 'geography'.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.geographyMessage.Builder setGeography(com.maersk.geography.smds.operations.msk.geography value) {
      validate(fields()[0], value);
      this.geographyBuilder = null;
      this.geography = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'geography' field has been set.
      * @return True if the 'geography' field has been set, false otherwise.
      */
    public boolean hasGeography() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'geography' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.maersk.geography.smds.operations.msk.geography.Builder getGeographyBuilder() {
      if (geographyBuilder == null) {
        if (hasGeography()) {
          setGeographyBuilder(com.maersk.geography.smds.operations.msk.geography.newBuilder(geography));
        } else {
          setGeographyBuilder(com.maersk.geography.smds.operations.msk.geography.newBuilder());
        }
      }
      return geographyBuilder;
    }

    /**
     * Sets the Builder instance for the 'geography' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.maersk.geography.smds.operations.msk.geographyMessage.Builder setGeographyBuilder(com.maersk.geography.smds.operations.msk.geography.Builder value) {
      clearGeography();
      geographyBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'geography' field has an active Builder instance
     * @return True if the 'geography' field has an active Builder instance
     */
    public boolean hasGeographyBuilder() {
      return geographyBuilder != null;
    }

    /**
      * Clears the value of the 'geography' field.
      * @return This builder.
      */
    public com.maersk.geography.smds.operations.msk.geographyMessage.Builder clearGeography() {
      geography = null;
      geographyBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public geographyMessage build() {
      try {
        geographyMessage record = new geographyMessage();
        if (geographyBuilder != null) {
          try {
            record.geography = this.geographyBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("geography"));
            throw e;
          }
        } else {
          record.geography = fieldSetFlags()[0] ? this.geography : (com.maersk.geography.smds.operations.msk.geography) defaultValue(fields()[0]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<geographyMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<geographyMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<geographyMessage>
    READER$ = (org.apache.avro.io.DatumReader<geographyMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










