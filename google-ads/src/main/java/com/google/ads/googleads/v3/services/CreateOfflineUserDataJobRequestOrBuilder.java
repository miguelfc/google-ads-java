// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/offline_user_data_job_service.proto

package com.google.ads.googleads.v3.services;

public interface CreateOfflineUserDataJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.CreateOfflineUserDataJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer for which to create an offline user data job.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer for which to create an offline user data job.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The offline user data job to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasJob();
  /**
   * <pre>
   * Required. The offline user data job to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v3.resources.OfflineUserDataJob getJob();
  /**
   * <pre>
   * Required. The offline user data job to be created.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.resources.OfflineUserDataJob job = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v3.resources.OfflineUserDataJobOrBuilder getJobOrBuilder();
}
