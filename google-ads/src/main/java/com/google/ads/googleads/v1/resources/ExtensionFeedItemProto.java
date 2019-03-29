// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/extension_feed_item.proto

package com.google.ads.googleads.v1.resources;

public final class ExtensionFeedItemProto {
  private ExtensionFeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_ExtensionFeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_ExtensionFeedItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v1/resources/exte" +
      "nsion_feed_item.proto\022!google.ads.google" +
      "ads.v1.resources\032/google/ads/googleads/v" +
      "1/common/extensions.proto\0322google/ads/go" +
      "ogleads/v1/enums/extension_type.proto\0324g" +
      "oogle/ads/googleads/v1/enums/feed_item_s" +
      "tatus.proto\032\036google/protobuf/wrappers.pr" +
      "oto\032\034google/api/annotations.proto\"\317\007\n\021Ex" +
      "tensionFeedItem\022\025\n\rresource_name\030\001 \001(\t\022V" +
      "\n\016extension_type\030\r \001(\0162>.google.ads.goog" +
      "leads.v1.enums.ExtensionTypeEnum.Extensi" +
      "onType\0225\n\017start_date_time\030\005 \001(\0132\034.google" +
      ".protobuf.StringValue\0223\n\rend_date_time\030\006" +
      " \001(\0132\034.google.protobuf.StringValue\022P\n\006st" +
      "atus\030\004 \001(\0162@.google.ads.googleads.v1.enu" +
      "ms.FeedItemStatusEnum.FeedItemStatus\022N\n\022" +
      "sitelink_feed_item\030\002 \001(\01320.google.ads.go" +
      "ogleads.v1.common.SitelinkFeedItemH\000\022a\n\034" +
      "structured_snippet_feed_item\030\003 \001(\01329.goo" +
      "gle.ads.googleads.v1.common.StructuredSn" +
      "ippetFeedItemH\000\022D\n\rapp_feed_item\030\007 \001(\0132+" +
      ".google.ads.googleads.v1.common.AppFeedI" +
      "temH\000\022F\n\016call_feed_item\030\010 \001(\0132,.google.a" +
      "ds.googleads.v1.common.CallFeedItemH\000\022L\n" +
      "\021callout_feed_item\030\t \001(\0132/.google.ads.go" +
      "ogleads.v1.common.CalloutFeedItemH\000\022U\n\026t" +
      "ext_message_feed_item\030\n \001(\01323.google.ads" +
      ".googleads.v1.common.TextMessageFeedItem" +
      "H\000\022H\n\017price_feed_item\030\013 \001(\0132-.google.ads" +
      ".googleads.v1.common.PriceFeedItemH\000\022P\n\023" +
      "promotion_feed_item\030\014 \001(\01321.google.ads.g" +
      "oogleads.v1.common.PromotionFeedItemH\000B\013" +
      "\n\textensionB\203\002\n%com.google.ads.googleads" +
      ".v1.resourcesB\026ExtensionFeedItemProtoP\001Z" +
      "Jgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v1/resources;resources\242\002\003GA" +
      "A\252\002!Google.Ads.GoogleAds.V1.Resources\312\002!" +
      "Google\\Ads\\GoogleAds\\V1\\Resources\352\002%Goog" +
      "le::Ads::GoogleAds::V1::Resourcesb\006proto" +
      "3"
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
          com.google.ads.googleads.v1.common.ExtensionsProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.ExtensionTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.FeedItemStatusProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_ExtensionFeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_ExtensionFeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_ExtensionFeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "ExtensionType", "StartDateTime", "EndDateTime", "Status", "SitelinkFeedItem", "StructuredSnippetFeedItem", "AppFeedItem", "CallFeedItem", "CalloutFeedItem", "TextMessageFeedItem", "PriceFeedItem", "PromotionFeedItem", "Extension", });
    com.google.ads.googleads.v1.common.ExtensionsProto.getDescriptor();
    com.google.ads.googleads.v1.enums.ExtensionTypeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.FeedItemStatusProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}