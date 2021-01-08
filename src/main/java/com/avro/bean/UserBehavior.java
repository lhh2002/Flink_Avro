/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.avro.bean;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserBehavior extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9166710419514072157L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserBehavior\",\"namespace\":\"com.avro.bean\",\"fields\":[{\"name\":\"userId\",\"type\":\"long\"},{\"name\":\"itemId\",\"type\":\"long\"},{\"name\":\"categoryId\",\"type\":\"int\"},{\"name\":\"behavior\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserBehavior> ENCODER =
      new BinaryMessageEncoder<UserBehavior>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserBehavior> DECODER =
      new BinaryMessageDecoder<UserBehavior>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<UserBehavior> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<UserBehavior> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserBehavior>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this UserBehavior to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a UserBehavior from a ByteBuffer. */
  public static UserBehavior fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long userId;
  @Deprecated public long itemId;
  @Deprecated public int categoryId;
  @Deprecated public java.lang.CharSequence behavior;
  @Deprecated public long timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserBehavior() {}

  /**
   * All-args constructor.
   * @param userId The new value for userId
   * @param itemId The new value for itemId
   * @param categoryId The new value for categoryId
   * @param behavior The new value for behavior
   * @param timestamp The new value for timestamp
   */
  public UserBehavior(java.lang.Long userId, java.lang.Long itemId, java.lang.Integer categoryId, java.lang.CharSequence behavior, java.lang.Long timestamp) {
    this.userId = userId;
    this.itemId = itemId;
    this.categoryId = categoryId;
    this.behavior = behavior;
    this.timestamp = timestamp;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userId;
    case 1: return itemId;
    case 2: return categoryId;
    case 3: return behavior;
    case 4: return timestamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userId = (java.lang.Long)value$; break;
    case 1: itemId = (java.lang.Long)value$; break;
    case 2: categoryId = (java.lang.Integer)value$; break;
    case 3: behavior = (java.lang.CharSequence)value$; break;
    case 4: timestamp = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.Long getUserId() {
    return userId;
  }

  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.Long value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'itemId' field.
   * @return The value of the 'itemId' field.
   */
  public java.lang.Long getItemId() {
    return itemId;
  }

  /**
   * Sets the value of the 'itemId' field.
   * @param value the value to set.
   */
  public void setItemId(java.lang.Long value) {
    this.itemId = value;
  }

  /**
   * Gets the value of the 'categoryId' field.
   * @return The value of the 'categoryId' field.
   */
  public java.lang.Integer getCategoryId() {
    return categoryId;
  }

  /**
   * Sets the value of the 'categoryId' field.
   * @param value the value to set.
   */
  public void setCategoryId(java.lang.Integer value) {
    this.categoryId = value;
  }

  /**
   * Gets the value of the 'behavior' field.
   * @return The value of the 'behavior' field.
   */
  public java.lang.CharSequence getBehavior() {
    return behavior;
  }

  /**
   * Sets the value of the 'behavior' field.
   * @param value the value to set.
   */
  public void setBehavior(java.lang.CharSequence value) {
    this.behavior = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Creates a new UserBehavior RecordBuilder.
   * @return A new UserBehavior RecordBuilder
   */
  public static com.avro.bean.UserBehavior.Builder newBuilder() {
    return new com.avro.bean.UserBehavior.Builder();
  }

  /**
   * Creates a new UserBehavior RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserBehavior RecordBuilder
   */
  public static com.avro.bean.UserBehavior.Builder newBuilder(com.avro.bean.UserBehavior.Builder other) {
    return new com.avro.bean.UserBehavior.Builder(other);
  }

  /**
   * Creates a new UserBehavior RecordBuilder by copying an existing UserBehavior instance.
   * @param other The existing instance to copy.
   * @return A new UserBehavior RecordBuilder
   */
  public static com.avro.bean.UserBehavior.Builder newBuilder(com.avro.bean.UserBehavior other) {
    return new com.avro.bean.UserBehavior.Builder(other);
  }

  /**
   * RecordBuilder for UserBehavior instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserBehavior>
    implements org.apache.avro.data.RecordBuilder<UserBehavior> {

    private long userId;
    private long itemId;
    private int categoryId;
    private java.lang.CharSequence behavior;
    private long timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.avro.bean.UserBehavior.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.itemId)) {
        this.itemId = data().deepCopy(fields()[1].schema(), other.itemId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.categoryId)) {
        this.categoryId = data().deepCopy(fields()[2].schema(), other.categoryId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.behavior)) {
        this.behavior = data().deepCopy(fields()[3].schema(), other.behavior);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[4].schema(), other.timestamp);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserBehavior instance
     * @param other The existing instance to copy.
     */
    private Builder(com.avro.bean.UserBehavior other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.userId)) {
        this.userId = data().deepCopy(fields()[0].schema(), other.userId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.itemId)) {
        this.itemId = data().deepCopy(fields()[1].schema(), other.itemId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.categoryId)) {
        this.categoryId = data().deepCopy(fields()[2].schema(), other.categoryId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.behavior)) {
        this.behavior = data().deepCopy(fields()[3].schema(), other.behavior);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[4].schema(), other.timestamp);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.Long getUserId() {
      return userId;
    }

    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public com.avro.bean.UserBehavior.Builder setUserId(long value) {
      validate(fields()[0], value);
      this.userId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.avro.bean.UserBehavior.Builder clearUserId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'itemId' field.
      * @return The value.
      */
    public java.lang.Long getItemId() {
      return itemId;
    }

    /**
      * Sets the value of the 'itemId' field.
      * @param value The value of 'itemId'.
      * @return This builder.
      */
    public com.avro.bean.UserBehavior.Builder setItemId(long value) {
      validate(fields()[1], value);
      this.itemId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'itemId' field has been set.
      * @return True if the 'itemId' field has been set, false otherwise.
      */
    public boolean hasItemId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'itemId' field.
      * @return This builder.
      */
    public com.avro.bean.UserBehavior.Builder clearItemId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'categoryId' field.
      * @return The value.
      */
    public java.lang.Integer getCategoryId() {
      return categoryId;
    }

    /**
      * Sets the value of the 'categoryId' field.
      * @param value The value of 'categoryId'.
      * @return This builder.
      */
    public com.avro.bean.UserBehavior.Builder setCategoryId(int value) {
      validate(fields()[2], value);
      this.categoryId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'categoryId' field has been set.
      * @return True if the 'categoryId' field has been set, false otherwise.
      */
    public boolean hasCategoryId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'categoryId' field.
      * @return This builder.
      */
    public com.avro.bean.UserBehavior.Builder clearCategoryId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'behavior' field.
      * @return The value.
      */
    public java.lang.CharSequence getBehavior() {
      return behavior;
    }

    /**
      * Sets the value of the 'behavior' field.
      * @param value The value of 'behavior'.
      * @return This builder.
      */
    public com.avro.bean.UserBehavior.Builder setBehavior(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.behavior = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'behavior' field has been set.
      * @return True if the 'behavior' field has been set, false otherwise.
      */
    public boolean hasBehavior() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'behavior' field.
      * @return This builder.
      */
    public com.avro.bean.UserBehavior.Builder clearBehavior() {
      behavior = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.avro.bean.UserBehavior.Builder setTimestamp(long value) {
      validate(fields()[4], value);
      this.timestamp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.avro.bean.UserBehavior.Builder clearTimestamp() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserBehavior build() {
      try {
        UserBehavior record = new UserBehavior();
        record.userId = fieldSetFlags()[0] ? this.userId : (java.lang.Long) defaultValue(fields()[0]);
        record.itemId = fieldSetFlags()[1] ? this.itemId : (java.lang.Long) defaultValue(fields()[1]);
        record.categoryId = fieldSetFlags()[2] ? this.categoryId : (java.lang.Integer) defaultValue(fields()[2]);
        record.behavior = fieldSetFlags()[3] ? this.behavior : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.timestamp = fieldSetFlags()[4] ? this.timestamp : (java.lang.Long) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserBehavior>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserBehavior>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserBehavior>
    READER$ = (org.apache.avro.io.DatumReader<UserBehavior>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
