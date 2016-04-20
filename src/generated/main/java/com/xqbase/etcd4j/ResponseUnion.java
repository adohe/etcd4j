// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: etcd.proto

package com.xqbase.etcd4j;

/**
 * Protobuf type {@code etcd4j.ResponseUnion}
 */
public  final class ResponseUnion extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:etcd4j.ResponseUnion)
    ResponseUnionOrBuilder {
  // Use ResponseUnion.newBuilder() to construct.
  private ResponseUnion(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ResponseUnion() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ResponseUnion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.xqbase.etcd4j.RangeResponse.Builder subBuilder = null;
            if (responseCase_ == 1) {
              subBuilder = ((com.xqbase.etcd4j.RangeResponse) response_).toBuilder();
            }
            response_ =
                input.readMessage(com.xqbase.etcd4j.RangeResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.xqbase.etcd4j.RangeResponse) response_);
              response_ = subBuilder.buildPartial();
            }
            responseCase_ = 1;
            break;
          }
          case 18: {
            com.xqbase.etcd4j.PutResponse.Builder subBuilder = null;
            if (responseCase_ == 2) {
              subBuilder = ((com.xqbase.etcd4j.PutResponse) response_).toBuilder();
            }
            response_ =
                input.readMessage(com.xqbase.etcd4j.PutResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.xqbase.etcd4j.PutResponse) response_);
              response_ = subBuilder.buildPartial();
            }
            responseCase_ = 2;
            break;
          }
          case 26: {
            com.xqbase.etcd4j.DeleteRangeResponse.Builder subBuilder = null;
            if (responseCase_ == 3) {
              subBuilder = ((com.xqbase.etcd4j.DeleteRangeResponse) response_).toBuilder();
            }
            response_ =
                input.readMessage(com.xqbase.etcd4j.DeleteRangeResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.xqbase.etcd4j.DeleteRangeResponse) response_);
              response_ = subBuilder.buildPartial();
            }
            responseCase_ = 3;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_ResponseUnion_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_ResponseUnion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xqbase.etcd4j.ResponseUnion.class, com.xqbase.etcd4j.ResponseUnion.Builder.class);
  }

  private int responseCase_ = 0;
  private java.lang.Object response_;
  public enum ResponseCase
      implements com.google.protobuf.Internal.EnumLite {
    RESPONSE_RANGE(1),
    RESPONSE_PUT(2),
    RESPONSE_DELETE_RANGE(3),
    RESPONSE_NOT_SET(0);
    private int value = 0;
    private ResponseCase(int value) {
      this.value = value;
    }
    public static ResponseCase valueOf(int value) {
      switch (value) {
        case 1: return RESPONSE_RANGE;
        case 2: return RESPONSE_PUT;
        case 3: return RESPONSE_DELETE_RANGE;
        case 0: return RESPONSE_NOT_SET;
        default: throw new java.lang.IllegalArgumentException(
          "Value is undefined for this oneof enum.");
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ResponseCase
  getResponseCase() {
    return ResponseCase.valueOf(
        responseCase_);
  }

  public static final int RESPONSE_RANGE_FIELD_NUMBER = 1;
  /**
   * <code>optional .etcd4j.RangeResponse response_range = 1;</code>
   */
  public com.xqbase.etcd4j.RangeResponse getResponseRange() {
    if (responseCase_ == 1) {
       return (com.xqbase.etcd4j.RangeResponse) response_;
    }
    return com.xqbase.etcd4j.RangeResponse.getDefaultInstance();
  }
  /**
   * <code>optional .etcd4j.RangeResponse response_range = 1;</code>
   */
  public com.xqbase.etcd4j.RangeResponseOrBuilder getResponseRangeOrBuilder() {
    if (responseCase_ == 1) {
       return (com.xqbase.etcd4j.RangeResponse) response_;
    }
    return com.xqbase.etcd4j.RangeResponse.getDefaultInstance();
  }

  public static final int RESPONSE_PUT_FIELD_NUMBER = 2;
  /**
   * <code>optional .etcd4j.PutResponse response_put = 2;</code>
   */
  public com.xqbase.etcd4j.PutResponse getResponsePut() {
    if (responseCase_ == 2) {
       return (com.xqbase.etcd4j.PutResponse) response_;
    }
    return com.xqbase.etcd4j.PutResponse.getDefaultInstance();
  }
  /**
   * <code>optional .etcd4j.PutResponse response_put = 2;</code>
   */
  public com.xqbase.etcd4j.PutResponseOrBuilder getResponsePutOrBuilder() {
    if (responseCase_ == 2) {
       return (com.xqbase.etcd4j.PutResponse) response_;
    }
    return com.xqbase.etcd4j.PutResponse.getDefaultInstance();
  }

  public static final int RESPONSE_DELETE_RANGE_FIELD_NUMBER = 3;
  /**
   * <code>optional .etcd4j.DeleteRangeResponse response_delete_range = 3;</code>
   */
  public com.xqbase.etcd4j.DeleteRangeResponse getResponseDeleteRange() {
    if (responseCase_ == 3) {
       return (com.xqbase.etcd4j.DeleteRangeResponse) response_;
    }
    return com.xqbase.etcd4j.DeleteRangeResponse.getDefaultInstance();
  }
  /**
   * <code>optional .etcd4j.DeleteRangeResponse response_delete_range = 3;</code>
   */
  public com.xqbase.etcd4j.DeleteRangeResponseOrBuilder getResponseDeleteRangeOrBuilder() {
    if (responseCase_ == 3) {
       return (com.xqbase.etcd4j.DeleteRangeResponse) response_;
    }
    return com.xqbase.etcd4j.DeleteRangeResponse.getDefaultInstance();
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
    if (responseCase_ == 1) {
      output.writeMessage(1, (com.xqbase.etcd4j.RangeResponse) response_);
    }
    if (responseCase_ == 2) {
      output.writeMessage(2, (com.xqbase.etcd4j.PutResponse) response_);
    }
    if (responseCase_ == 3) {
      output.writeMessage(3, (com.xqbase.etcd4j.DeleteRangeResponse) response_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.xqbase.etcd4j.RangeResponse) response_);
    }
    if (responseCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.xqbase.etcd4j.PutResponse) response_);
    }
    if (responseCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.xqbase.etcd4j.DeleteRangeResponse) response_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.xqbase.etcd4j.ResponseUnion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xqbase.etcd4j.ResponseUnion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xqbase.etcd4j.ResponseUnion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xqbase.etcd4j.ResponseUnion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xqbase.etcd4j.ResponseUnion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.xqbase.etcd4j.ResponseUnion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.xqbase.etcd4j.ResponseUnion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.xqbase.etcd4j.ResponseUnion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.xqbase.etcd4j.ResponseUnion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.xqbase.etcd4j.ResponseUnion parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xqbase.etcd4j.ResponseUnion prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code etcd4j.ResponseUnion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcd4j.ResponseUnion)
      com.xqbase.etcd4j.ResponseUnionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_ResponseUnion_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_ResponseUnion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xqbase.etcd4j.ResponseUnion.class, com.xqbase.etcd4j.ResponseUnion.Builder.class);
    }

    // Construct using com.xqbase.etcd4j.ResponseUnion.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      responseCase_ = 0;
      response_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xqbase.etcd4j.EtcdJavaProto.internal_static_etcd4j_ResponseUnion_descriptor;
    }

    public com.xqbase.etcd4j.ResponseUnion getDefaultInstanceForType() {
      return com.xqbase.etcd4j.ResponseUnion.getDefaultInstance();
    }

    public com.xqbase.etcd4j.ResponseUnion build() {
      com.xqbase.etcd4j.ResponseUnion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.xqbase.etcd4j.ResponseUnion buildPartial() {
      com.xqbase.etcd4j.ResponseUnion result = new com.xqbase.etcd4j.ResponseUnion(this);
      if (responseCase_ == 1) {
        if (responseRangeBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseRangeBuilder_.build();
        }
      }
      if (responseCase_ == 2) {
        if (responsePutBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responsePutBuilder_.build();
        }
      }
      if (responseCase_ == 3) {
        if (responseDeleteRangeBuilder_ == null) {
          result.response_ = response_;
        } else {
          result.response_ = responseDeleteRangeBuilder_.build();
        }
      }
      result.responseCase_ = responseCase_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xqbase.etcd4j.ResponseUnion) {
        return mergeFrom((com.xqbase.etcd4j.ResponseUnion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xqbase.etcd4j.ResponseUnion other) {
      if (other == com.xqbase.etcd4j.ResponseUnion.getDefaultInstance()) return this;
      switch (other.getResponseCase()) {
        case RESPONSE_RANGE: {
          mergeResponseRange(other.getResponseRange());
          break;
        }
        case RESPONSE_PUT: {
          mergeResponsePut(other.getResponsePut());
          break;
        }
        case RESPONSE_DELETE_RANGE: {
          mergeResponseDeleteRange(other.getResponseDeleteRange());
          break;
        }
        case RESPONSE_NOT_SET: {
          break;
        }
      }
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
      com.xqbase.etcd4j.ResponseUnion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xqbase.etcd4j.ResponseUnion) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int responseCase_ = 0;
    private java.lang.Object response_;
    public ResponseCase
        getResponseCase() {
      return ResponseCase.valueOf(
          responseCase_);
    }

    public Builder clearResponse() {
      responseCase_ = 0;
      response_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilder<
        com.xqbase.etcd4j.RangeResponse, com.xqbase.etcd4j.RangeResponse.Builder, com.xqbase.etcd4j.RangeResponseOrBuilder> responseRangeBuilder_;
    /**
     * <code>optional .etcd4j.RangeResponse response_range = 1;</code>
     */
    public com.xqbase.etcd4j.RangeResponse getResponseRange() {
      if (responseRangeBuilder_ == null) {
        if (responseCase_ == 1) {
          return (com.xqbase.etcd4j.RangeResponse) response_;
        }
        return com.xqbase.etcd4j.RangeResponse.getDefaultInstance();
      } else {
        if (responseCase_ == 1) {
          return responseRangeBuilder_.getMessage();
        }
        return com.xqbase.etcd4j.RangeResponse.getDefaultInstance();
      }
    }
    /**
     * <code>optional .etcd4j.RangeResponse response_range = 1;</code>
     */
    public Builder setResponseRange(com.xqbase.etcd4j.RangeResponse value) {
      if (responseRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        responseRangeBuilder_.setMessage(value);
      }
      responseCase_ = 1;
      return this;
    }
    /**
     * <code>optional .etcd4j.RangeResponse response_range = 1;</code>
     */
    public Builder setResponseRange(
        com.xqbase.etcd4j.RangeResponse.Builder builderForValue) {
      if (responseRangeBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        responseRangeBuilder_.setMessage(builderForValue.build());
      }
      responseCase_ = 1;
      return this;
    }
    /**
     * <code>optional .etcd4j.RangeResponse response_range = 1;</code>
     */
    public Builder mergeResponseRange(com.xqbase.etcd4j.RangeResponse value) {
      if (responseRangeBuilder_ == null) {
        if (responseCase_ == 1 &&
            response_ != com.xqbase.etcd4j.RangeResponse.getDefaultInstance()) {
          response_ = com.xqbase.etcd4j.RangeResponse.newBuilder((com.xqbase.etcd4j.RangeResponse) response_)
              .mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        if (responseCase_ == 1) {
          responseRangeBuilder_.mergeFrom(value);
        }
        responseRangeBuilder_.setMessage(value);
      }
      responseCase_ = 1;
      return this;
    }
    /**
     * <code>optional .etcd4j.RangeResponse response_range = 1;</code>
     */
    public Builder clearResponseRange() {
      if (responseRangeBuilder_ == null) {
        if (responseCase_ == 1) {
          responseCase_ = 0;
          response_ = null;
          onChanged();
        }
      } else {
        if (responseCase_ == 1) {
          responseCase_ = 0;
          response_ = null;
        }
        responseRangeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .etcd4j.RangeResponse response_range = 1;</code>
     */
    public com.xqbase.etcd4j.RangeResponse.Builder getResponseRangeBuilder() {
      return getResponseRangeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .etcd4j.RangeResponse response_range = 1;</code>
     */
    public com.xqbase.etcd4j.RangeResponseOrBuilder getResponseRangeOrBuilder() {
      if ((responseCase_ == 1) && (responseRangeBuilder_ != null)) {
        return responseRangeBuilder_.getMessageOrBuilder();
      } else {
        if (responseCase_ == 1) {
          return (com.xqbase.etcd4j.RangeResponse) response_;
        }
        return com.xqbase.etcd4j.RangeResponse.getDefaultInstance();
      }
    }
    /**
     * <code>optional .etcd4j.RangeResponse response_range = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.xqbase.etcd4j.RangeResponse, com.xqbase.etcd4j.RangeResponse.Builder, com.xqbase.etcd4j.RangeResponseOrBuilder> 
        getResponseRangeFieldBuilder() {
      if (responseRangeBuilder_ == null) {
        if (!(responseCase_ == 1)) {
          response_ = com.xqbase.etcd4j.RangeResponse.getDefaultInstance();
        }
        responseRangeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.xqbase.etcd4j.RangeResponse, com.xqbase.etcd4j.RangeResponse.Builder, com.xqbase.etcd4j.RangeResponseOrBuilder>(
                (com.xqbase.etcd4j.RangeResponse) response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      responseCase_ = 1;
      onChanged();;
      return responseRangeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.xqbase.etcd4j.PutResponse, com.xqbase.etcd4j.PutResponse.Builder, com.xqbase.etcd4j.PutResponseOrBuilder> responsePutBuilder_;
    /**
     * <code>optional .etcd4j.PutResponse response_put = 2;</code>
     */
    public com.xqbase.etcd4j.PutResponse getResponsePut() {
      if (responsePutBuilder_ == null) {
        if (responseCase_ == 2) {
          return (com.xqbase.etcd4j.PutResponse) response_;
        }
        return com.xqbase.etcd4j.PutResponse.getDefaultInstance();
      } else {
        if (responseCase_ == 2) {
          return responsePutBuilder_.getMessage();
        }
        return com.xqbase.etcd4j.PutResponse.getDefaultInstance();
      }
    }
    /**
     * <code>optional .etcd4j.PutResponse response_put = 2;</code>
     */
    public Builder setResponsePut(com.xqbase.etcd4j.PutResponse value) {
      if (responsePutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        responsePutBuilder_.setMessage(value);
      }
      responseCase_ = 2;
      return this;
    }
    /**
     * <code>optional .etcd4j.PutResponse response_put = 2;</code>
     */
    public Builder setResponsePut(
        com.xqbase.etcd4j.PutResponse.Builder builderForValue) {
      if (responsePutBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        responsePutBuilder_.setMessage(builderForValue.build());
      }
      responseCase_ = 2;
      return this;
    }
    /**
     * <code>optional .etcd4j.PutResponse response_put = 2;</code>
     */
    public Builder mergeResponsePut(com.xqbase.etcd4j.PutResponse value) {
      if (responsePutBuilder_ == null) {
        if (responseCase_ == 2 &&
            response_ != com.xqbase.etcd4j.PutResponse.getDefaultInstance()) {
          response_ = com.xqbase.etcd4j.PutResponse.newBuilder((com.xqbase.etcd4j.PutResponse) response_)
              .mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        if (responseCase_ == 2) {
          responsePutBuilder_.mergeFrom(value);
        }
        responsePutBuilder_.setMessage(value);
      }
      responseCase_ = 2;
      return this;
    }
    /**
     * <code>optional .etcd4j.PutResponse response_put = 2;</code>
     */
    public Builder clearResponsePut() {
      if (responsePutBuilder_ == null) {
        if (responseCase_ == 2) {
          responseCase_ = 0;
          response_ = null;
          onChanged();
        }
      } else {
        if (responseCase_ == 2) {
          responseCase_ = 0;
          response_ = null;
        }
        responsePutBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .etcd4j.PutResponse response_put = 2;</code>
     */
    public com.xqbase.etcd4j.PutResponse.Builder getResponsePutBuilder() {
      return getResponsePutFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .etcd4j.PutResponse response_put = 2;</code>
     */
    public com.xqbase.etcd4j.PutResponseOrBuilder getResponsePutOrBuilder() {
      if ((responseCase_ == 2) && (responsePutBuilder_ != null)) {
        return responsePutBuilder_.getMessageOrBuilder();
      } else {
        if (responseCase_ == 2) {
          return (com.xqbase.etcd4j.PutResponse) response_;
        }
        return com.xqbase.etcd4j.PutResponse.getDefaultInstance();
      }
    }
    /**
     * <code>optional .etcd4j.PutResponse response_put = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.xqbase.etcd4j.PutResponse, com.xqbase.etcd4j.PutResponse.Builder, com.xqbase.etcd4j.PutResponseOrBuilder> 
        getResponsePutFieldBuilder() {
      if (responsePutBuilder_ == null) {
        if (!(responseCase_ == 2)) {
          response_ = com.xqbase.etcd4j.PutResponse.getDefaultInstance();
        }
        responsePutBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.xqbase.etcd4j.PutResponse, com.xqbase.etcd4j.PutResponse.Builder, com.xqbase.etcd4j.PutResponseOrBuilder>(
                (com.xqbase.etcd4j.PutResponse) response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      responseCase_ = 2;
      onChanged();;
      return responsePutBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.xqbase.etcd4j.DeleteRangeResponse, com.xqbase.etcd4j.DeleteRangeResponse.Builder, com.xqbase.etcd4j.DeleteRangeResponseOrBuilder> responseDeleteRangeBuilder_;
    /**
     * <code>optional .etcd4j.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public com.xqbase.etcd4j.DeleteRangeResponse getResponseDeleteRange() {
      if (responseDeleteRangeBuilder_ == null) {
        if (responseCase_ == 3) {
          return (com.xqbase.etcd4j.DeleteRangeResponse) response_;
        }
        return com.xqbase.etcd4j.DeleteRangeResponse.getDefaultInstance();
      } else {
        if (responseCase_ == 3) {
          return responseDeleteRangeBuilder_.getMessage();
        }
        return com.xqbase.etcd4j.DeleteRangeResponse.getDefaultInstance();
      }
    }
    /**
     * <code>optional .etcd4j.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public Builder setResponseDeleteRange(com.xqbase.etcd4j.DeleteRangeResponse value) {
      if (responseDeleteRangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        responseDeleteRangeBuilder_.setMessage(value);
      }
      responseCase_ = 3;
      return this;
    }
    /**
     * <code>optional .etcd4j.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public Builder setResponseDeleteRange(
        com.xqbase.etcd4j.DeleteRangeResponse.Builder builderForValue) {
      if (responseDeleteRangeBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        responseDeleteRangeBuilder_.setMessage(builderForValue.build());
      }
      responseCase_ = 3;
      return this;
    }
    /**
     * <code>optional .etcd4j.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public Builder mergeResponseDeleteRange(com.xqbase.etcd4j.DeleteRangeResponse value) {
      if (responseDeleteRangeBuilder_ == null) {
        if (responseCase_ == 3 &&
            response_ != com.xqbase.etcd4j.DeleteRangeResponse.getDefaultInstance()) {
          response_ = com.xqbase.etcd4j.DeleteRangeResponse.newBuilder((com.xqbase.etcd4j.DeleteRangeResponse) response_)
              .mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        if (responseCase_ == 3) {
          responseDeleteRangeBuilder_.mergeFrom(value);
        }
        responseDeleteRangeBuilder_.setMessage(value);
      }
      responseCase_ = 3;
      return this;
    }
    /**
     * <code>optional .etcd4j.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public Builder clearResponseDeleteRange() {
      if (responseDeleteRangeBuilder_ == null) {
        if (responseCase_ == 3) {
          responseCase_ = 0;
          response_ = null;
          onChanged();
        }
      } else {
        if (responseCase_ == 3) {
          responseCase_ = 0;
          response_ = null;
        }
        responseDeleteRangeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .etcd4j.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public com.xqbase.etcd4j.DeleteRangeResponse.Builder getResponseDeleteRangeBuilder() {
      return getResponseDeleteRangeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .etcd4j.DeleteRangeResponse response_delete_range = 3;</code>
     */
    public com.xqbase.etcd4j.DeleteRangeResponseOrBuilder getResponseDeleteRangeOrBuilder() {
      if ((responseCase_ == 3) && (responseDeleteRangeBuilder_ != null)) {
        return responseDeleteRangeBuilder_.getMessageOrBuilder();
      } else {
        if (responseCase_ == 3) {
          return (com.xqbase.etcd4j.DeleteRangeResponse) response_;
        }
        return com.xqbase.etcd4j.DeleteRangeResponse.getDefaultInstance();
      }
    }
    /**
     * <code>optional .etcd4j.DeleteRangeResponse response_delete_range = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.xqbase.etcd4j.DeleteRangeResponse, com.xqbase.etcd4j.DeleteRangeResponse.Builder, com.xqbase.etcd4j.DeleteRangeResponseOrBuilder> 
        getResponseDeleteRangeFieldBuilder() {
      if (responseDeleteRangeBuilder_ == null) {
        if (!(responseCase_ == 3)) {
          response_ = com.xqbase.etcd4j.DeleteRangeResponse.getDefaultInstance();
        }
        responseDeleteRangeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.xqbase.etcd4j.DeleteRangeResponse, com.xqbase.etcd4j.DeleteRangeResponse.Builder, com.xqbase.etcd4j.DeleteRangeResponseOrBuilder>(
                (com.xqbase.etcd4j.DeleteRangeResponse) response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      responseCase_ = 3;
      onChanged();;
      return responseDeleteRangeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:etcd4j.ResponseUnion)
  }

  // @@protoc_insertion_point(class_scope:etcd4j.ResponseUnion)
  private static final com.xqbase.etcd4j.ResponseUnion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xqbase.etcd4j.ResponseUnion();
  }

  public static com.xqbase.etcd4j.ResponseUnion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseUnion>
      PARSER = new com.google.protobuf.AbstractParser<ResponseUnion>() {
    public ResponseUnion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ResponseUnion(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<ResponseUnion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseUnion> getParserForType() {
    return PARSER;
  }

  public com.xqbase.etcd4j.ResponseUnion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
