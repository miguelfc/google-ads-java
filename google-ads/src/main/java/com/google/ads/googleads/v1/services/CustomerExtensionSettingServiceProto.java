// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/customer_extension_setting_service.proto

package com.google.ads.googleads.v1.services;

public final class CustomerExtensionSettingServiceProto {
  private CustomerExtensionSettingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetCustomerExtensionSettingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetCustomerExtensionSettingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_CustomerExtensionSettingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_CustomerExtensionSettingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v1/services/custo" +
      "mer_extension_setting_service.proto\022 goo" +
      "gle.ads.googleads.v1.services\032Bgoogle/ad" +
      "s/googleads/v1/resources/customer_extens" +
      "ion_setting.proto\032\034google/api/annotation" +
      "s.proto\032 google/protobuf/field_mask.prot" +
      "o\032\036google/protobuf/wrappers.proto\032\027googl" +
      "e/rpc/status.proto\";\n\"GetCustomerExtensi" +
      "onSettingRequest\022\025\n\rresource_name\030\001 \001(\t\"" +
      "\306\001\n&MutateCustomerExtensionSettingsReque" +
      "st\022\023\n\013customer_id\030\001 \001(\t\022W\n\noperations\030\002 " +
      "\003(\0132C.google.ads.googleads.v1.services.C" +
      "ustomerExtensionSettingOperation\022\027\n\017part" +
      "ial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010" +
      "\"\221\002\n!CustomerExtensionSettingOperation\022/" +
      "\n\013update_mask\030\004 \001(\0132\032.google.protobuf.Fi" +
      "eldMask\022M\n\006create\030\001 \001(\0132;.google.ads.goo" +
      "gleads.v1.resources.CustomerExtensionSet" +
      "tingH\000\022M\n\006update\030\002 \001(\0132;.google.ads.goog" +
      "leads.v1.resources.CustomerExtensionSett" +
      "ingH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\265\001\n" +
      "\'MutateCustomerExtensionSettingsResponse" +
      "\0221\n\025partial_failure_error\030\003 \001(\0132\022.google" +
      ".rpc.Status\022W\n\007results\030\002 \003(\0132F.google.ad" +
      "s.googleads.v1.services.MutateCustomerEx" +
      "tensionSettingResult\"=\n$MutateCustomerEx" +
      "tensionSettingResult\022\025\n\rresource_name\030\001 " +
      "\001(\t2\215\004\n\037CustomerExtensionSettingService\022" +
      "\345\001\n\033GetCustomerExtensionSetting\022D.google" +
      ".ads.googleads.v1.services.GetCustomerEx" +
      "tensionSettingRequest\032;.google.ads.googl" +
      "eads.v1.resources.CustomerExtensionSetti" +
      "ng\"C\202\323\344\223\002=\022;/v1/{resource_name=customers" +
      "/*/customerExtensionSettings/*}\022\201\002\n\037Muta" +
      "teCustomerExtensionSettings\022H.google.ads" +
      ".googleads.v1.services.MutateCustomerExt" +
      "ensionSettingsRequest\032I.google.ads.googl" +
      "eads.v1.services.MutateCustomerExtension" +
      "SettingsResponse\"I\202\323\344\223\002C\">/v1/customers/" +
      "{customer_id=*}/customerExtensionSetting" +
      "s:mutate:\001*B\213\002\n$com.google.ads.googleads" +
      ".v1.servicesB$CustomerExtensionSettingSe" +
      "rviceProtoP\001ZHgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v1/services;se" +
      "rvices\242\002\003GAA\252\002 Google.Ads.GoogleAds.V1.S" +
      "ervices\312\002 Google\\Ads\\GoogleAds\\V1\\Servic" +
      "es\352\002$Google::Ads::GoogleAds::V1::Service" +
      "sb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.CustomerExtensionSettingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetCustomerExtensionSettingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetCustomerExtensionSettingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetCustomerExtensionSettingRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_CustomerExtensionSettingOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_CustomerExtensionSettingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_CustomerExtensionSettingOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateCustomerExtensionSettingResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.CustomerExtensionSettingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}