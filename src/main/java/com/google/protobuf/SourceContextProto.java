// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/source_context.proto

// Protobuf Java Version: 3.25.5
package com.google.protobuf;

public final class SourceContextProto {
  private SourceContextProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_SourceContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_SourceContext_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/protobuf/source_context.proto\022\017" +
      "google.protobuf\"\"\n\rSourceContext\022\021\n\tfile" +
      "_name\030\001 \001(\tB\212\001\n\023com.google.protobufB\022Sou" +
      "rceContextProtoP\001Z6google.golang.org/pro" +
      "tobuf/types/known/sourcecontextpb\242\002\003GPB\252" +
      "\002\036Google.Protobuf.WellKnownTypesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_protobuf_SourceContext_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_protobuf_SourceContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_SourceContext_descriptor,
        new java.lang.String[] { "FileName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}