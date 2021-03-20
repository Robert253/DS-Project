// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Light.proto

package org.DS.robertproject.SmartBuildingGRPC;

public final class LampServiceImpl {
  private LampServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_stringRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_stringRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_stringResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_stringResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_boolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_boolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_boolResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_boolResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_valRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_valRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_valResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_valResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SmartBuildingGRPC_lampResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_lampResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Light.proto\022\021SmartBuildingGRPC\"\007\n\005Empt" +
      "y\"\035\n\rstringRequest\022\014\n\004text\030\001 \001(\t\"\036\n\016stri" +
      "ngResponse\022\014\n\004text\030\001 \001(\t\"\032\n\013boolRequest\022" +
      "\013\n\003msg\030\002 \001(\010\"\033\n\014boolResponse\022\013\n\003msg\030\002 \001(" +
      "\010\"\034\n\nvalRequest\022\016\n\006length\030\003 \001(\005\"\035\n\013valRe" +
      "sponse\022\016\n\006length\030\003 \001(\005\"=\n\010lampResp\022\r\n\005an" +
      "ame\030\004 \001(\t\022\016\n\006status\030\005 \001(\t\022\022\n\nbrightness\030" +
      "\006 \001(\0052\325\002\n\013LampService\022H\n\rinitialDevice\022\030" +
      ".SmartBuildingGRPC.Empty\032\033.SmartBuilding" +
      "GRPC.lampResp\"\000\022U\n\020changeBrightness\022\035.Sm" +
      "artBuildingGRPC.valRequest\032\036.SmartBuildi" +
      "ngGRPC.valResponse\"\0000\001\022J\n\005onOff\022\036.SmartB" +
      "uildingGRPC.boolRequest\032\037.SmartBuildingG" +
      "RPC.boolResponse\"\000\022Y\n\020changeDeviceName\022 " +
      ".SmartBuildingGRPC.stringRequest\032!.Smart" +
      "BuildingGRPC.stringResponse\"\000B;\n&org.DS." +
      "robertproject.SmartBuildingGRPCB\017LampSer" +
      "viceImplP\001b\006proto3"
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
        }, assigner);
    internal_static_SmartBuildingGRPC_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SmartBuildingGRPC_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_SmartBuildingGRPC_stringRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SmartBuildingGRPC_stringRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_stringRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_SmartBuildingGRPC_stringResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SmartBuildingGRPC_stringResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_stringResponse_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_SmartBuildingGRPC_boolRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SmartBuildingGRPC_boolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_boolRequest_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_SmartBuildingGRPC_boolResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_SmartBuildingGRPC_boolResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_boolResponse_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_SmartBuildingGRPC_valRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SmartBuildingGRPC_valRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_valRequest_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_SmartBuildingGRPC_valResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SmartBuildingGRPC_valResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_valResponse_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_SmartBuildingGRPC_lampResp_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_SmartBuildingGRPC_lampResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_lampResp_descriptor,
        new java.lang.String[] { "Aname", "Status", "Brightness", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}