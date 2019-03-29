// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/recommendation_service.proto

package com.google.ads.googleads.v1.services;

public final class RecommendationServiceProto {
  private RecommendationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetRecommendationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetRecommendationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_CampaignBudgetParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_CampaignBudgetParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_TextAdParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_TextAdParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_KeywordParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_KeywordParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_TargetCpaOptInParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_TargetCpaOptInParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_MoveUnusedBudgetParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_MoveUnusedBudgetParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_DismissRecommendationOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_DismissRecommendationOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_DismissRecommendationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_DismissRecommendationResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v1/services/recom" +
      "mendation_service.proto\022 google.ads.goog" +
      "leads.v1.services\0326google/ads/googleads/" +
      "v1/enums/keyword_match_type.proto\032*googl" +
      "e/ads/googleads/v1/resources/ad.proto\0326g" +
      "oogle/ads/googleads/v1/resources/recomme" +
      "ndation.proto\032\034google/api/annotations.pr" +
      "oto\032\036google/protobuf/wrappers.proto\032\027goo" +
      "gle/rpc/status.proto\"1\n\030GetRecommendatio" +
      "nRequest\022\025\n\rresource_name\030\001 \001(\t\"\236\001\n\032Appl" +
      "yRecommendationRequest\022\023\n\013customer_id\030\001 " +
      "\001(\t\022R\n\noperations\030\002 \003(\0132>.google.ads.goo" +
      "gleads.v1.services.ApplyRecommendationOp" +
      "eration\022\027\n\017partial_failure\030\003 \001(\010\"\343\t\n\034App" +
      "lyRecommendationOperation\022\025\n\rresource_na" +
      "me\030\001 \001(\t\022r\n\017campaign_budget\030\002 \001(\0132W.goog" +
      "le.ads.googleads.v1.services.ApplyRecomm" +
      "endationOperation.CampaignBudgetParamete" +
      "rsH\000\022b\n\007text_ad\030\003 \001(\0132O.google.ads.googl" +
      "eads.v1.services.ApplyRecommendationOper" +
      "ation.TextAdParametersH\000\022c\n\007keyword\030\004 \001(" +
      "\0132P.google.ads.googleads.v1.services.App" +
      "lyRecommendationOperation.KeywordParamet" +
      "ersH\000\022t\n\021target_cpa_opt_in\030\005 \001(\0132W.googl" +
      "e.ads.googleads.v1.services.ApplyRecomme" +
      "ndationOperation.TargetCpaOptInParameter" +
      "sH\000\022w\n\022move_unused_budget\030\t \001(\0132Y.google" +
      ".ads.googleads.v1.services.ApplyRecommen" +
      "dationOperation.MoveUnusedBudgetParamete" +
      "rsH\000\032Y\n\030CampaignBudgetParameters\022=\n\030new_" +
      "budget_amount_micros\030\001 \001(\0132\033.google.prot" +
      "obuf.Int64Value\032E\n\020TextAdParameters\0221\n\002a" +
      "d\030\001 \001(\0132%.google.ads.googleads.v1.resour" +
      "ces.Ad\032\322\001\n\021KeywordParameters\022.\n\010ad_group" +
      "\030\001 \001(\0132\034.google.protobuf.StringValue\022X\n\n" +
      "match_type\030\002 \001(\0162D.google.ads.googleads." +
      "v1.enums.KeywordMatchTypeEnum.KeywordMat" +
      "chType\0223\n\016cpc_bid_micros\030\003 \001(\0132\033.google." +
      "protobuf.Int64Value\032\232\001\n\030TargetCpaOptInPa" +
      "rameters\0226\n\021target_cpa_micros\030\001 \001(\0132\033.go" +
      "ogle.protobuf.Int64Value\022F\n!new_campaign" +
      "_budget_amount_micros\030\002 \001(\0132\033.google.pro" +
      "tobuf.Int64Value\032X\n\032MoveUnusedBudgetPara" +
      "meters\022:\n\025budget_micros_to_move\030\001 \001(\0132\033." +
      "google.protobuf.Int64ValueB\022\n\020apply_para" +
      "meters\"\236\001\n\033ApplyRecommendationResponse\022L" +
      "\n\007results\030\001 \003(\0132;.google.ads.googleads.v" +
      "1.services.ApplyRecommendationResult\0221\n\025" +
      "partial_failure_error\030\002 \001(\0132\022.google.rpc" +
      ".Status\"2\n\031ApplyRecommendationResult\022\025\n\r" +
      "resource_name\030\001 \001(\t\"\370\001\n\034DismissRecommend" +
      "ationRequest\022\023\n\013customer_id\030\001 \001(\t\022q\n\nope" +
      "rations\030\003 \003(\0132].google.ads.googleads.v1." +
      "services.DismissRecommendationRequest.Di" +
      "smissRecommendationOperation\022\027\n\017partial_" +
      "failure\030\002 \001(\010\0327\n\036DismissRecommendationOp" +
      "eration\022\025\n\rresource_name\030\001 \001(\t\"\366\001\n\035Dismi" +
      "ssRecommendationResponse\022l\n\007results\030\001 \003(" +
      "\0132[.google.ads.googleads.v1.services.Dis" +
      "missRecommendationResponse.DismissRecomm" +
      "endationResult\0221\n\025partial_failure_error\030" +
      "\002 \001(\0132\022.google.rpc.Status\0324\n\033DismissReco" +
      "mmendationResult\022\025\n\rresource_name\030\001 \001(\t2" +
      "\211\005\n\025RecommendationService\022\275\001\n\021GetRecomme" +
      "ndation\022:.google.ads.googleads.v1.servic" +
      "es.GetRecommendationRequest\0321.google.ads" +
      ".googleads.v1.resources.Recommendation\"9" +
      "\202\323\344\223\0023\0221/v1/{resource_name=customers/*/r" +
      "ecommendations/*}\022\322\001\n\023ApplyRecommendatio" +
      "n\022<.google.ads.googleads.v1.services.App" +
      "lyRecommendationRequest\032=.google.ads.goo" +
      "gleads.v1.services.ApplyRecommendationRe" +
      "sponse\">\202\323\344\223\0028\"3/v1/customers/{customer_" +
      "id=*}/recommendations:apply:\001*\022\332\001\n\025Dismi" +
      "ssRecommendation\022>.google.ads.googleads." +
      "v1.services.DismissRecommendationRequest" +
      "\032?.google.ads.googleads.v1.services.Dism" +
      "issRecommendationResponse\"@\202\323\344\223\002:\"5/v1/c" +
      "ustomers/{customer_id=*}/recommendations" +
      ":dismiss:\001*B\201\002\n$com.google.ads.googleads" +
      ".v1.servicesB\032RecommendationServiceProto" +
      "P\001ZHgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v1/services;services\242\002\003G" +
      "AA\252\002 Google.Ads.GoogleAds.V1.Services\312\002 " +
      "Google\\Ads\\GoogleAds\\V1\\Services\352\002$Googl" +
      "e::Ads::GoogleAds::V1::Servicesb\006proto3"
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
          com.google.ads.googleads.v1.enums.KeywordMatchTypeProto.getDescriptor(),
          com.google.ads.googleads.v1.resources.AdProto.getDescriptor(),
          com.google.ads.googleads.v1.resources.RecommendationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetRecommendationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetRecommendationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetRecommendationRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ApplyRecommendationRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", });
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignBudget", "TextAd", "Keyword", "TargetCpaOptIn", "MoveUnusedBudget", "ApplyParameters", });
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_CampaignBudgetParameters_descriptor =
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_CampaignBudgetParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_CampaignBudgetParameters_descriptor,
        new java.lang.String[] { "NewBudgetAmountMicros", });
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_TextAdParameters_descriptor =
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_TextAdParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_TextAdParameters_descriptor,
        new java.lang.String[] { "Ad", });
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_KeywordParameters_descriptor =
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_KeywordParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_KeywordParameters_descriptor,
        new java.lang.String[] { "AdGroup", "MatchType", "CpcBidMicros", });
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_TargetCpaOptInParameters_descriptor =
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_TargetCpaOptInParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_TargetCpaOptInParameters_descriptor,
        new java.lang.String[] { "TargetCpaMicros", "NewCampaignBudgetAmountMicros", });
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_MoveUnusedBudgetParameters_descriptor =
      internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_descriptor.getNestedTypes().get(4);
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_MoveUnusedBudgetParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ApplyRecommendationOperation_MoveUnusedBudgetParameters_descriptor,
        new java.lang.String[] { "BudgetMicrosToMove", });
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ApplyRecommendationResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_ApplyRecommendationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ApplyRecommendationResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", });
    internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_DismissRecommendationOperation_descriptor =
      internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_DismissRecommendationOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_DismissRecommendationRequest_DismissRecommendationOperation_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_DismissRecommendationResult_descriptor =
      internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_DismissRecommendationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_DismissRecommendationResponse_DismissRecommendationResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.enums.KeywordMatchTypeProto.getDescriptor();
    com.google.ads.googleads.v1.resources.AdProto.getDescriptor();
    com.google.ads.googleads.v1.resources.RecommendationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}