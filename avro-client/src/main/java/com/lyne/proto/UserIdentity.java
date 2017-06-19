/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.lyne.proto;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserIdentity extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7091527872152712138L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserIdentity\",\"namespace\":\"com.lyne.proto\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserIdentity> ENCODER =
      new BinaryMessageEncoder<UserIdentity>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserIdentity> DECODER =
      new BinaryMessageDecoder<UserIdentity>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<UserIdentity> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<UserIdentity> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserIdentity>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this UserIdentity to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a UserIdentity from a ByteBuffer. */
  public static UserIdentity fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserIdentity() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   */
  public UserIdentity(java.lang.Integer id) {
    this.id = id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Creates a new UserIdentity RecordBuilder.
   * @return A new UserIdentity RecordBuilder
   */
  public static com.lyne.proto.UserIdentity.Builder newBuilder() {
    return new com.lyne.proto.UserIdentity.Builder();
  }

  /**
   * Creates a new UserIdentity RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserIdentity RecordBuilder
   */
  public static com.lyne.proto.UserIdentity.Builder newBuilder(com.lyne.proto.UserIdentity.Builder other) {
    return new com.lyne.proto.UserIdentity.Builder(other);
  }

  /**
   * Creates a new UserIdentity RecordBuilder by copying an existing UserIdentity instance.
   * @param other The existing instance to copy.
   * @return A new UserIdentity RecordBuilder
   */
  public static com.lyne.proto.UserIdentity.Builder newBuilder(com.lyne.proto.UserIdentity other) {
    return new com.lyne.proto.UserIdentity.Builder(other);
  }

  /**
   * RecordBuilder for UserIdentity instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserIdentity>
    implements org.apache.avro.data.RecordBuilder<UserIdentity> {

    private int id;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.lyne.proto.UserIdentity.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserIdentity instance
     * @param other The existing instance to copy.
     */
    private Builder(com.lyne.proto.UserIdentity other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.lyne.proto.UserIdentity.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.lyne.proto.UserIdentity.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserIdentity build() {
      try {
        UserIdentity record = new UserIdentity();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserIdentity>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserIdentity>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserIdentity>
    READER$ = (org.apache.avro.io.DatumReader<UserIdentity>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}