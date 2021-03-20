package org.DS.robertproject.SmartBuildingGRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Speakers.proto")
public final class SpeakerServiceGrpc {

  private SpeakerServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartBuildingGRPC.SpeakerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.Empty,
      org.DS.robertproject.SmartBuildingGRPC.speakerResp> getInitialDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialDevice",
      requestType = org.DS.robertproject.SmartBuildingGRPC.Empty.class,
      responseType = org.DS.robertproject.SmartBuildingGRPC.speakerResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.Empty,
      org.DS.robertproject.SmartBuildingGRPC.speakerResp> getInitialDeviceMethod() {
    io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.Empty, org.DS.robertproject.SmartBuildingGRPC.speakerResp> getInitialDeviceMethod;
    if ((getInitialDeviceMethod = SpeakerServiceGrpc.getInitialDeviceMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getInitialDeviceMethod = SpeakerServiceGrpc.getInitialDeviceMethod) == null) {
          SpeakerServiceGrpc.getInitialDeviceMethod = getInitialDeviceMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.Empty, org.DS.robertproject.SmartBuildingGRPC.speakerResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.SpeakerService", "initialDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.speakerResp.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("initialDevice"))
                  .build();
          }
        }
     }
     return getInitialDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.valRequest,
      org.DS.robertproject.SmartBuildingGRPC.valResponse> getChangeVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeVolume",
      requestType = org.DS.robertproject.SmartBuildingGRPC.valRequest.class,
      responseType = org.DS.robertproject.SmartBuildingGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.valRequest,
      org.DS.robertproject.SmartBuildingGRPC.valResponse> getChangeVolumeMethod() {
    io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.valRequest, org.DS.robertproject.SmartBuildingGRPC.valResponse> getChangeVolumeMethod;
    if ((getChangeVolumeMethod = SpeakerServiceGrpc.getChangeVolumeMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getChangeVolumeMethod = SpeakerServiceGrpc.getChangeVolumeMethod) == null) {
          SpeakerServiceGrpc.getChangeVolumeMethod = getChangeVolumeMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.valRequest, org.DS.robertproject.SmartBuildingGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.SpeakerService", "changeVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.valRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("changeVolume"))
                  .build();
          }
        }
     }
     return getChangeVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.boolRequest,
      org.DS.robertproject.SmartBuildingGRPC.valResponse> getMuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "mute",
      requestType = org.DS.robertproject.SmartBuildingGRPC.boolRequest.class,
      responseType = org.DS.robertproject.SmartBuildingGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.boolRequest,
      org.DS.robertproject.SmartBuildingGRPC.valResponse> getMuteMethod() {
    io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.boolRequest, org.DS.robertproject.SmartBuildingGRPC.valResponse> getMuteMethod;
    if ((getMuteMethod = SpeakerServiceGrpc.getMuteMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getMuteMethod = SpeakerServiceGrpc.getMuteMethod) == null) {
          SpeakerServiceGrpc.getMuteMethod = getMuteMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.boolRequest, org.DS.robertproject.SmartBuildingGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.SpeakerService", "mute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.boolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("mute"))
                  .build();
          }
        }
     }
     return getMuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.boolRequest,
      org.DS.robertproject.SmartBuildingGRPC.boolResponse> getOnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "onOff",
      requestType = org.DS.robertproject.SmartBuildingGRPC.boolRequest.class,
      responseType = org.DS.robertproject.SmartBuildingGRPC.boolResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.boolRequest,
      org.DS.robertproject.SmartBuildingGRPC.boolResponse> getOnOffMethod() {
    io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.boolRequest, org.DS.robertproject.SmartBuildingGRPC.boolResponse> getOnOffMethod;
    if ((getOnOffMethod = SpeakerServiceGrpc.getOnOffMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getOnOffMethod = SpeakerServiceGrpc.getOnOffMethod) == null) {
          SpeakerServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.boolRequest, org.DS.robertproject.SmartBuildingGRPC.boolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.SpeakerService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.boolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.boolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("onOff"))
                  .build();
          }
        }
     }
     return getOnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.stringRequest,
      org.DS.robertproject.SmartBuildingGRPC.stringResponse> getChangeDeviceNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeDeviceName",
      requestType = org.DS.robertproject.SmartBuildingGRPC.stringRequest.class,
      responseType = org.DS.robertproject.SmartBuildingGRPC.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.stringRequest,
      org.DS.robertproject.SmartBuildingGRPC.stringResponse> getChangeDeviceNameMethod() {
    io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.stringRequest, org.DS.robertproject.SmartBuildingGRPC.stringResponse> getChangeDeviceNameMethod;
    if ((getChangeDeviceNameMethod = SpeakerServiceGrpc.getChangeDeviceNameMethod) == null) {
      synchronized (SpeakerServiceGrpc.class) {
        if ((getChangeDeviceNameMethod = SpeakerServiceGrpc.getChangeDeviceNameMethod) == null) {
          SpeakerServiceGrpc.getChangeDeviceNameMethod = getChangeDeviceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.stringRequest, org.DS.robertproject.SmartBuildingGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.SpeakerService", "changeDeviceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SpeakerServiceMethodDescriptorSupplier("changeDeviceName"))
                  .build();
          }
        }
     }
     return getChangeDeviceNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpeakerServiceStub newStub(io.grpc.Channel channel) {
    return new SpeakerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeakerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpeakerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeakerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpeakerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SpeakerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialDevice(org.DS.robertproject.SmartBuildingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.speakerResp> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialDeviceMethod(), responseObserver);
    }

    /**
     */
    public void changeVolume(org.DS.robertproject.SmartBuildingGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeVolumeMethod(), responseObserver);
    }

    /**
     */
    public void mute(org.DS.robertproject.SmartBuildingGRPC.boolRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMuteMethod(), responseObserver);
    }

    /**
     */
    public void onOff(org.DS.robertproject.SmartBuildingGRPC.boolRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.boolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOnOffMethod(), responseObserver);
    }

    /**
     */
    public void changeDeviceName(org.DS.robertproject.SmartBuildingGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.stringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeDeviceNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.robertproject.SmartBuildingGRPC.Empty,
                org.DS.robertproject.SmartBuildingGRPC.speakerResp>(
                  this, METHODID_INITIAL_DEVICE)))
          .addMethod(
            getChangeVolumeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.robertproject.SmartBuildingGRPC.valRequest,
                org.DS.robertproject.SmartBuildingGRPC.valResponse>(
                  this, METHODID_CHANGE_VOLUME)))
          .addMethod(
            getMuteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.robertproject.SmartBuildingGRPC.boolRequest,
                org.DS.robertproject.SmartBuildingGRPC.valResponse>(
                  this, METHODID_MUTE)))
          .addMethod(
            getOnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.robertproject.SmartBuildingGRPC.boolRequest,
                org.DS.robertproject.SmartBuildingGRPC.boolResponse>(
                  this, METHODID_ON_OFF)))
          .addMethod(
            getChangeDeviceNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.robertproject.SmartBuildingGRPC.stringRequest,
                org.DS.robertproject.SmartBuildingGRPC.stringResponse>(
                  this, METHODID_CHANGE_DEVICE_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class SpeakerServiceStub extends io.grpc.stub.AbstractStub<SpeakerServiceStub> {
    private SpeakerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialDevice(org.DS.robertproject.SmartBuildingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.speakerResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeVolume(org.DS.robertproject.SmartBuildingGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mute(org.DS.robertproject.SmartBuildingGRPC.boolRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onOff(org.DS.robertproject.SmartBuildingGRPC.boolRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.boolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeDeviceName(org.DS.robertproject.SmartBuildingGRPC.stringRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.stringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeDeviceNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpeakerServiceBlockingStub extends io.grpc.stub.AbstractStub<SpeakerServiceBlockingStub> {
    private SpeakerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.robertproject.SmartBuildingGRPC.speakerResp initialDevice(org.DS.robertproject.SmartBuildingGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.robertproject.SmartBuildingGRPC.valResponse> changeVolume(
        org.DS.robertproject.SmartBuildingGRPC.valRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.robertproject.SmartBuildingGRPC.valResponse mute(org.DS.robertproject.SmartBuildingGRPC.boolRequest request) {
      return blockingUnaryCall(
          getChannel(), getMuteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.robertproject.SmartBuildingGRPC.boolResponse onOff(org.DS.robertproject.SmartBuildingGRPC.boolRequest request) {
      return blockingUnaryCall(
          getChannel(), getOnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.DS.robertproject.SmartBuildingGRPC.stringResponse changeDeviceName(org.DS.robertproject.SmartBuildingGRPC.stringRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeDeviceNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpeakerServiceFutureStub extends io.grpc.stub.AbstractStub<SpeakerServiceFutureStub> {
    private SpeakerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeakerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpeakerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeakerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.robertproject.SmartBuildingGRPC.speakerResp> initialDevice(
        org.DS.robertproject.SmartBuildingGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.robertproject.SmartBuildingGRPC.valResponse> mute(
        org.DS.robertproject.SmartBuildingGRPC.boolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMuteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.robertproject.SmartBuildingGRPC.boolResponse> onOff(
        org.DS.robertproject.SmartBuildingGRPC.boolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.robertproject.SmartBuildingGRPC.stringResponse> changeDeviceName(
        org.DS.robertproject.SmartBuildingGRPC.stringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeDeviceNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIAL_DEVICE = 0;
  private static final int METHODID_CHANGE_VOLUME = 1;
  private static final int METHODID_MUTE = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_DEVICE_NAME = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpeakerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpeakerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_DEVICE:
          serviceImpl.initialDevice((org.DS.robertproject.SmartBuildingGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.speakerResp>) responseObserver);
          break;
        case METHODID_CHANGE_VOLUME:
          serviceImpl.changeVolume((org.DS.robertproject.SmartBuildingGRPC.valRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse>) responseObserver);
          break;
        case METHODID_MUTE:
          serviceImpl.mute((org.DS.robertproject.SmartBuildingGRPC.boolRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse>) responseObserver);
          break;
        case METHODID_ON_OFF:
          serviceImpl.onOff((org.DS.robertproject.SmartBuildingGRPC.boolRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.boolResponse>) responseObserver);
          break;
        case METHODID_CHANGE_DEVICE_NAME:
          serviceImpl.changeDeviceName((org.DS.robertproject.SmartBuildingGRPC.stringRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.stringResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SpeakerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpeakerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.robertproject.SmartBuildingGRPC.SpeakerServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpeakerService");
    }
  }

  private static final class SpeakerServiceFileDescriptorSupplier
      extends SpeakerServiceBaseDescriptorSupplier {
    SpeakerServiceFileDescriptorSupplier() {}
  }

  private static final class SpeakerServiceMethodDescriptorSupplier
      extends SpeakerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpeakerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SpeakerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpeakerServiceFileDescriptorSupplier())
              .addMethod(getInitialDeviceMethod())
              .addMethod(getChangeVolumeMethod())
              .addMethod(getMuteMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeDeviceNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
