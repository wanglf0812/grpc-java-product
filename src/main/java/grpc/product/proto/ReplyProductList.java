// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package grpc.product.proto;

/**
 * Protobuf type {@code product.ReplyProductList}
 */
public  final class ReplyProductList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:product.ReplyProductList)
    ReplyProductListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReplyProductList.newBuilder() to construct.
  private ReplyProductList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplyProductList() {
    replyProductList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReplyProductList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              replyProductList_ = new java.util.ArrayList<grpc.product.proto.ReplyProduct>();
              mutable_bitField0_ |= 0x00000001;
            }
            replyProductList_.add(
                input.readMessage(grpc.product.proto.ReplyProduct.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        replyProductList_ = java.util.Collections.unmodifiableList(replyProductList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.product.proto.ProductProto.internal_static_product_ReplyProductList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.product.proto.ProductProto.internal_static_product_ReplyProductList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.product.proto.ReplyProductList.class, grpc.product.proto.ReplyProductList.Builder.class);
  }

  public static final int REPLYPRODUCTLIST_FIELD_NUMBER = 1;
  private java.util.List<grpc.product.proto.ReplyProduct> replyProductList_;
  /**
   * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
   */
  public java.util.List<grpc.product.proto.ReplyProduct> getReplyProductListList() {
    return replyProductList_;
  }
  /**
   * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
   */
  public java.util.List<? extends grpc.product.proto.ReplyProductOrBuilder> 
      getReplyProductListOrBuilderList() {
    return replyProductList_;
  }
  /**
   * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
   */
  public int getReplyProductListCount() {
    return replyProductList_.size();
  }
  /**
   * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
   */
  public grpc.product.proto.ReplyProduct getReplyProductList(int index) {
    return replyProductList_.get(index);
  }
  /**
   * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
   */
  public grpc.product.proto.ReplyProductOrBuilder getReplyProductListOrBuilder(
      int index) {
    return replyProductList_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < replyProductList_.size(); i++) {
      output.writeMessage(1, replyProductList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < replyProductList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, replyProductList_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.product.proto.ReplyProductList)) {
      return super.equals(obj);
    }
    grpc.product.proto.ReplyProductList other = (grpc.product.proto.ReplyProductList) obj;

    boolean result = true;
    result = result && getReplyProductListList()
        .equals(other.getReplyProductListList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getReplyProductListCount() > 0) {
      hash = (37 * hash) + REPLYPRODUCTLIST_FIELD_NUMBER;
      hash = (53 * hash) + getReplyProductListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.product.proto.ReplyProductList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.product.proto.ReplyProductList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.product.proto.ReplyProductList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.product.proto.ReplyProductList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.product.proto.ReplyProductList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.product.proto.ReplyProductList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.product.proto.ReplyProductList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.product.proto.ReplyProductList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.product.proto.ReplyProductList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.product.proto.ReplyProductList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.product.proto.ReplyProductList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.product.proto.ReplyProductList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.product.proto.ReplyProductList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code product.ReplyProductList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:product.ReplyProductList)
      grpc.product.proto.ReplyProductListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.product.proto.ProductProto.internal_static_product_ReplyProductList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.product.proto.ProductProto.internal_static_product_ReplyProductList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.product.proto.ReplyProductList.class, grpc.product.proto.ReplyProductList.Builder.class);
    }

    // Construct using grpc.product.proto.ReplyProductList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getReplyProductListFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (replyProductListBuilder_ == null) {
        replyProductList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        replyProductListBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.product.proto.ProductProto.internal_static_product_ReplyProductList_descriptor;
    }

    public grpc.product.proto.ReplyProductList getDefaultInstanceForType() {
      return grpc.product.proto.ReplyProductList.getDefaultInstance();
    }

    public grpc.product.proto.ReplyProductList build() {
      grpc.product.proto.ReplyProductList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public grpc.product.proto.ReplyProductList buildPartial() {
      grpc.product.proto.ReplyProductList result = new grpc.product.proto.ReplyProductList(this);
      int from_bitField0_ = bitField0_;
      if (replyProductListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          replyProductList_ = java.util.Collections.unmodifiableList(replyProductList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.replyProductList_ = replyProductList_;
      } else {
        result.replyProductList_ = replyProductListBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.product.proto.ReplyProductList) {
        return mergeFrom((grpc.product.proto.ReplyProductList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.product.proto.ReplyProductList other) {
      if (other == grpc.product.proto.ReplyProductList.getDefaultInstance()) return this;
      if (replyProductListBuilder_ == null) {
        if (!other.replyProductList_.isEmpty()) {
          if (replyProductList_.isEmpty()) {
            replyProductList_ = other.replyProductList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReplyProductListIsMutable();
            replyProductList_.addAll(other.replyProductList_);
          }
          onChanged();
        }
      } else {
        if (!other.replyProductList_.isEmpty()) {
          if (replyProductListBuilder_.isEmpty()) {
            replyProductListBuilder_.dispose();
            replyProductListBuilder_ = null;
            replyProductList_ = other.replyProductList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            replyProductListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReplyProductListFieldBuilder() : null;
          } else {
            replyProductListBuilder_.addAllMessages(other.replyProductList_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.product.proto.ReplyProductList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.product.proto.ReplyProductList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<grpc.product.proto.ReplyProduct> replyProductList_ =
      java.util.Collections.emptyList();
    private void ensureReplyProductListIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        replyProductList_ = new java.util.ArrayList<grpc.product.proto.ReplyProduct>(replyProductList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.product.proto.ReplyProduct, grpc.product.proto.ReplyProduct.Builder, grpc.product.proto.ReplyProductOrBuilder> replyProductListBuilder_;

    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public java.util.List<grpc.product.proto.ReplyProduct> getReplyProductListList() {
      if (replyProductListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(replyProductList_);
      } else {
        return replyProductListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public int getReplyProductListCount() {
      if (replyProductListBuilder_ == null) {
        return replyProductList_.size();
      } else {
        return replyProductListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public grpc.product.proto.ReplyProduct getReplyProductList(int index) {
      if (replyProductListBuilder_ == null) {
        return replyProductList_.get(index);
      } else {
        return replyProductListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public Builder setReplyProductList(
        int index, grpc.product.proto.ReplyProduct value) {
      if (replyProductListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReplyProductListIsMutable();
        replyProductList_.set(index, value);
        onChanged();
      } else {
        replyProductListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public Builder setReplyProductList(
        int index, grpc.product.proto.ReplyProduct.Builder builderForValue) {
      if (replyProductListBuilder_ == null) {
        ensureReplyProductListIsMutable();
        replyProductList_.set(index, builderForValue.build());
        onChanged();
      } else {
        replyProductListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public Builder addReplyProductList(grpc.product.proto.ReplyProduct value) {
      if (replyProductListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReplyProductListIsMutable();
        replyProductList_.add(value);
        onChanged();
      } else {
        replyProductListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public Builder addReplyProductList(
        int index, grpc.product.proto.ReplyProduct value) {
      if (replyProductListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReplyProductListIsMutable();
        replyProductList_.add(index, value);
        onChanged();
      } else {
        replyProductListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public Builder addReplyProductList(
        grpc.product.proto.ReplyProduct.Builder builderForValue) {
      if (replyProductListBuilder_ == null) {
        ensureReplyProductListIsMutable();
        replyProductList_.add(builderForValue.build());
        onChanged();
      } else {
        replyProductListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public Builder addReplyProductList(
        int index, grpc.product.proto.ReplyProduct.Builder builderForValue) {
      if (replyProductListBuilder_ == null) {
        ensureReplyProductListIsMutable();
        replyProductList_.add(index, builderForValue.build());
        onChanged();
      } else {
        replyProductListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public Builder addAllReplyProductList(
        java.lang.Iterable<? extends grpc.product.proto.ReplyProduct> values) {
      if (replyProductListBuilder_ == null) {
        ensureReplyProductListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, replyProductList_);
        onChanged();
      } else {
        replyProductListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public Builder clearReplyProductList() {
      if (replyProductListBuilder_ == null) {
        replyProductList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        replyProductListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public Builder removeReplyProductList(int index) {
      if (replyProductListBuilder_ == null) {
        ensureReplyProductListIsMutable();
        replyProductList_.remove(index);
        onChanged();
      } else {
        replyProductListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public grpc.product.proto.ReplyProduct.Builder getReplyProductListBuilder(
        int index) {
      return getReplyProductListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public grpc.product.proto.ReplyProductOrBuilder getReplyProductListOrBuilder(
        int index) {
      if (replyProductListBuilder_ == null) {
        return replyProductList_.get(index);  } else {
        return replyProductListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public java.util.List<? extends grpc.product.proto.ReplyProductOrBuilder> 
         getReplyProductListOrBuilderList() {
      if (replyProductListBuilder_ != null) {
        return replyProductListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(replyProductList_);
      }
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public grpc.product.proto.ReplyProduct.Builder addReplyProductListBuilder() {
      return getReplyProductListFieldBuilder().addBuilder(
          grpc.product.proto.ReplyProduct.getDefaultInstance());
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public grpc.product.proto.ReplyProduct.Builder addReplyProductListBuilder(
        int index) {
      return getReplyProductListFieldBuilder().addBuilder(
          index, grpc.product.proto.ReplyProduct.getDefaultInstance());
    }
    /**
     * <code>repeated .product.ReplyProduct replyProductList = 1;</code>
     */
    public java.util.List<grpc.product.proto.ReplyProduct.Builder> 
         getReplyProductListBuilderList() {
      return getReplyProductListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        grpc.product.proto.ReplyProduct, grpc.product.proto.ReplyProduct.Builder, grpc.product.proto.ReplyProductOrBuilder> 
        getReplyProductListFieldBuilder() {
      if (replyProductListBuilder_ == null) {
        replyProductListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            grpc.product.proto.ReplyProduct, grpc.product.proto.ReplyProduct.Builder, grpc.product.proto.ReplyProductOrBuilder>(
                replyProductList_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        replyProductList_ = null;
      }
      return replyProductListBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:product.ReplyProductList)
  }

  // @@protoc_insertion_point(class_scope:product.ReplyProductList)
  private static final grpc.product.proto.ReplyProductList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.product.proto.ReplyProductList();
  }

  public static grpc.product.proto.ReplyProductList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplyProductList>
      PARSER = new com.google.protobuf.AbstractParser<ReplyProductList>() {
    public ReplyProductList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReplyProductList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReplyProductList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplyProductList> getParserForType() {
    return PARSER;
  }

  public grpc.product.proto.ReplyProductList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

