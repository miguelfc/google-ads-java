// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/feed_item_target.proto

package com.google.ads.googleads.v1.resources;

public final class FeedItemTargetProto {
  private FeedItemTargetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_FeedItemTarget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_FeedItemTarget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v1/resources/feed" +
      "_item_target.proto\022!google.ads.googleads" +
      ".v1.resources\032-google/ads/googleads/v1/c" +
      "ommon/criteria.proto\032;google/ads/googlea" +
      "ds/v1/enums/feed_item_target_device.prot" +
      "o\0329google/ads/googleads/v1/enums/feed_it" +
      "em_target_type.proto\032\036google/protobuf/wr" +
      "appers.proto\032\034google/api/annotations.pro" +
      "to\"\215\005\n\016FeedItemTarget\022\025\n\rresource_name\030\001" +
      " \001(\t\022/\n\tfeed_item\030\002 \001(\0132\034.google.protobu" +
      "f.StringValue\022g\n\025feed_item_target_type\030\003" +
      " \001(\0162H.google.ads.googleads.v1.enums.Fee" +
      "dItemTargetTypeEnum.FeedItemTargetType\0228" +
      "\n\023feed_item_target_id\030\006 \001(\0132\033.google.pro" +
      "tobuf.Int64Value\0220\n\010campaign\030\004 \001(\0132\034.goo" +
      "gle.protobuf.StringValueH\000\0220\n\010ad_group\030\005" +
      " \001(\0132\034.google.protobuf.StringValueH\000\022>\n\007" +
      "keyword\030\007 \001(\0132+.google.ads.googleads.v1." +
      "common.KeywordInfoH\000\022;\n\023geo_target_const" +
      "ant\030\010 \001(\0132\034.google.protobuf.StringValueH" +
      "\000\022^\n\006device\030\t \001(\0162L.google.ads.googleads" +
      ".v1.enums.FeedItemTargetDeviceEnum.FeedI" +
      "temTargetDeviceH\000\022E\n\013ad_schedule\030\n \001(\0132." +
      ".google.ads.googleads.v1.common.AdSchedu" +
      "leInfoH\000B\010\n\006targetB\200\002\n%com.google.ads.go" +
      "ogleads.v1.resourcesB\023FeedItemTargetProt" +
      "oP\001ZJgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v1/resources;resources\242" +
      "\002\003GAA\252\002!Google.Ads.GoogleAds.V1.Resource" +
      "s\312\002!Google\\Ads\\GoogleAds\\V1\\Resources\352\002%" +
      "Google::Ads::GoogleAds::V1::Resourcesb\006p" +
      "roto3"
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
          com.google.ads.googleads.v1.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemTargetDeviceProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemTargetTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_FeedItemTarget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_FeedItemTarget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_FeedItemTarget_descriptor,
        new java.lang.String[] { "ResourceName", "FeedItem", "FeedItemTargetType", "FeedItemTargetId", "Campaign", "AdGroup", "Keyword", "GeoTargetConstant", "Device", "AdSchedule", "Target", });
    com.google.ads.googleads.v1.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemTargetDeviceProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemTargetTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
