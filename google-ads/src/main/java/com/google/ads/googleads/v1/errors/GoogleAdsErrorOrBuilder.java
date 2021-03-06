// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/errors.proto

package com.google.ads.googleads.v1.errors;

public interface GoogleAdsErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.errors.GoogleAdsError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An enum value that indicates which error occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.errors.ErrorCode error_code = 1;</code>
   */
  boolean hasErrorCode();
  /**
   * <pre>
   * An enum value that indicates which error occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.errors.ErrorCode error_code = 1;</code>
   */
  com.google.ads.googleads.v1.errors.ErrorCode getErrorCode();
  /**
   * <pre>
   * An enum value that indicates which error occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.errors.ErrorCode error_code = 1;</code>
   */
  com.google.ads.googleads.v1.errors.ErrorCodeOrBuilder getErrorCodeOrBuilder();

  /**
   * <pre>
   * A human-readable description of the error.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * A human-readable description of the error.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * The value that triggered the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.Value trigger = 3;</code>
   */
  boolean hasTrigger();
  /**
   * <pre>
   * The value that triggered the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.Value trigger = 3;</code>
   */
  com.google.ads.googleads.v1.common.Value getTrigger();
  /**
   * <pre>
   * The value that triggered the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.Value trigger = 3;</code>
   */
  com.google.ads.googleads.v1.common.ValueOrBuilder getTriggerOrBuilder();

  /**
   * <pre>
   * Describes the part of the request proto that caused the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.errors.ErrorLocation location = 4;</code>
   */
  boolean hasLocation();
  /**
   * <pre>
   * Describes the part of the request proto that caused the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.errors.ErrorLocation location = 4;</code>
   */
  com.google.ads.googleads.v1.errors.ErrorLocation getLocation();
  /**
   * <pre>
   * Describes the part of the request proto that caused the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.errors.ErrorLocation location = 4;</code>
   */
  com.google.ads.googleads.v1.errors.ErrorLocationOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Additional error details, which are returned by certain error codes. Most
   * error codes do not include details.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.errors.ErrorDetails details = 5;</code>
   */
  boolean hasDetails();
  /**
   * <pre>
   * Additional error details, which are returned by certain error codes. Most
   * error codes do not include details.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.errors.ErrorDetails details = 5;</code>
   */
  com.google.ads.googleads.v1.errors.ErrorDetails getDetails();
  /**
   * <pre>
   * Additional error details, which are returned by certain error codes. Most
   * error codes do not include details.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.errors.ErrorDetails details = 5;</code>
   */
  com.google.ads.googleads.v1.errors.ErrorDetailsOrBuilder getDetailsOrBuilder();
}
