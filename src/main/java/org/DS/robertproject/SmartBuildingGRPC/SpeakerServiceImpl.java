// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Speakers.proto

package org.DS.robertproject.SmartBuildingGRPC;

public final class SpeakerServiceImpl {
  private SpeakerServiceImpl() {}
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
    internal_static_SmartBuildingGRPC_speakerResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SmartBuildingGRPC_speakerResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Speakers.proto\022\021SmartBuildingGRPC\"\007\n\005E" +
      "mpty\"\035\n\rstringRequest\022\014\n\004text\030\001 \001(\t\"\036\n\016s" +
      "tringResponse\022\014\n\004text\030\001 \001(\t\"\032\n\013boolReque" +
      "st\022\013\n\003msg\030\002 \001(\010\"\033\n\014boolResponse\022\013\n\003msg\030\002" +
      " \001(\010\"\034\n\nvalRequest\022\016\n\006length\030\003 \001(\005\"\035\n\013va" +
      "lResponse\022\016\n\006length\030\003 \001(\005\"K\n\013speakerResp" +
      "\022\r\n\005aname\030\004 \001(\t\022\016\n\006status\030\005 \001(\t\022\016\n\006volum" +
      "e\030\006 \001(\005\022\r\n\005muted\030\007 \001(\0102\241\003\n\016SpeakerServic" +
      "e\022K\n\rinitialDevice\022\030.SmartBuildingGRPC.E" +
      "mpty\032\036.SmartBuildingGRPC.speakerResp\"\000\022Q" +
      "\n\014changeVolume\022\035.SmartBuildingGRPC.valRe" +
      "quest\032\036.SmartBuildingGRPC.valResponse\"\0000" +
      "\001\022H\n\004mute\022\036.SmartBuildingGRPC.boolReques" +
      "t\032\036.SmartBuildingGRPC.valResponse\"\000\022J\n\005o" +
      "nOff\022\036.SmartBuildingGRPC.boolRequest\032\037.S" +
      "martBuildingGRPC.boolResponse\"\000\022Y\n\020chang" +
      "eDeviceName\022 .SmartBuildingGRPC.stringRe" +
      "quest\032!.SmartBuildingGRPC.stringResponse" +
      "\"\000B>\n&org.DS.robertproject.SmartBuilding" +
      "GRPCB\022SpeakerServiceImplP\001b\006proto3"
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
    internal_static_SmartBuildingGRPC_speakerResp_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_SmartBuildingGRPC_speakerResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SmartBuildingGRPC_speakerResp_descriptor,
        new java.lang.String[] { "Aname", "Status", "Volume", "Muted", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
