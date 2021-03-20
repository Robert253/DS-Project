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
    comments = "Source: Heating.proto")
public final class HeatingServiceGrpc {

  private HeatingServiceGrpc() {}

  public static final String SERVICE_NAME = "SmartBuildingGRPC.HeatingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.Empty,
      org.DS.robertproject.SmartBuildingGRPC.heatingResponse> getInitialDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "initialDevice",
      requestType = org.DS.robertproject.SmartBuildingGRPC.Empty.class,
      responseType = org.DS.robertproject.SmartBuildingGRPC.heatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.Empty,
      org.DS.robertproject.SmartBuildingGRPC.heatingResponse> getInitialDeviceMethod() {
    io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.Empty, org.DS.robertproject.SmartBuildingGRPC.heatingResponse> getInitialDeviceMethod;
    if ((getInitialDeviceMethod = HeatingServiceGrpc.getInitialDeviceMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getInitialDeviceMethod = HeatingServiceGrpc.getInitialDeviceMethod) == null) {
          HeatingServiceGrpc.getInitialDeviceMethod = getInitialDeviceMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.Empty, org.DS.robertproject.SmartBuildingGRPC.heatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "initialDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.heatingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("initialDevice"))
                  .build();
          }
        }
     }
     return getInitialDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.valRequest,
      org.DS.robertproject.SmartBuildingGRPC.valResponse> getChangeTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeTemp",
      requestType = org.DS.robertproject.SmartBuildingGRPC.valRequest.class,
      responseType = org.DS.robertproject.SmartBuildingGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.valRequest,
      org.DS.robertproject.SmartBuildingGRPC.valResponse> getChangeTempMethod() {
    io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.valRequest, org.DS.robertproject.SmartBuildingGRPC.valResponse> getChangeTempMethod;
    if ((getChangeTempMethod = HeatingServiceGrpc.getChangeTempMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getChangeTempMethod = HeatingServiceGrpc.getChangeTempMethod) == null) {
          HeatingServiceGrpc.getChangeTempMethod = getChangeTempMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.valRequest, org.DS.robertproject.SmartBuildingGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "changeTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.valRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("changeTemp"))
                  .build();
          }
        }
     }
     return getChangeTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.valRequest,
      org.DS.robertproject.SmartBuildingGRPC.valResponse> getChangeFanSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeFanSpeed",
      requestType = org.DS.robertproject.SmartBuildingGRPC.valRequest.class,
      responseType = org.DS.robertproject.SmartBuildingGRPC.valResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.valRequest,
      org.DS.robertproject.SmartBuildingGRPC.valResponse> getChangeFanSpeedMethod() {
    io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.valRequest, org.DS.robertproject.SmartBuildingGRPC.valResponse> getChangeFanSpeedMethod;
    if ((getChangeFanSpeedMethod = HeatingServiceGrpc.getChangeFanSpeedMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getChangeFanSpeedMethod = HeatingServiceGrpc.getChangeFanSpeedMethod) == null) {
          HeatingServiceGrpc.getChangeFanSpeedMethod = getChangeFanSpeedMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.valRequest, org.DS.robertproject.SmartBuildingGRPC.valResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "changeFanSpeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.valRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.valResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("changeFanSpeed"))
                  .build();
          }
        }
     }
     return getChangeFanSpeedMethod;
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
    if ((getOnOffMethod = HeatingServiceGrpc.getOnOffMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getOnOffMethod = HeatingServiceGrpc.getOnOffMethod) == null) {
          HeatingServiceGrpc.getOnOffMethod = getOnOffMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.boolRequest, org.DS.robertproject.SmartBuildingGRPC.boolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "onOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.boolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.boolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("onOff"))
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
    if ((getChangeDeviceNameMethod = HeatingServiceGrpc.getChangeDeviceNameMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getChangeDeviceNameMethod = HeatingServiceGrpc.getChangeDeviceNameMethod) == null) {
          HeatingServiceGrpc.getChangeDeviceNameMethod = getChangeDeviceNameMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.stringRequest, org.DS.robertproject.SmartBuildingGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "changeDeviceName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("changeDeviceName"))
                  .build();
          }
        }
     }
     return getChangeDeviceNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.stringRequest,
      org.DS.robertproject.SmartBuildingGRPC.stringResponse> getChangeDeviceNameStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeDeviceNameStream",
      requestType = org.DS.robertproject.SmartBuildingGRPC.stringRequest.class,
      responseType = org.DS.robertproject.SmartBuildingGRPC.stringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.stringRequest,
      org.DS.robertproject.SmartBuildingGRPC.stringResponse> getChangeDeviceNameStreamMethod() {
    io.grpc.MethodDescriptor<org.DS.robertproject.SmartBuildingGRPC.stringRequest, org.DS.robertproject.SmartBuildingGRPC.stringResponse> getChangeDeviceNameStreamMethod;
    if ((getChangeDeviceNameStreamMethod = HeatingServiceGrpc.getChangeDeviceNameStreamMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getChangeDeviceNameStreamMethod = HeatingServiceGrpc.getChangeDeviceNameStreamMethod) == null) {
          HeatingServiceGrpc.getChangeDeviceNameStreamMethod = getChangeDeviceNameStreamMethod = 
              io.grpc.MethodDescriptor.<org.DS.robertproject.SmartBuildingGRPC.stringRequest, org.DS.robertproject.SmartBuildingGRPC.stringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartBuildingGRPC.HeatingService", "changeDeviceNameStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.stringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.DS.robertproject.SmartBuildingGRPC.stringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("changeDeviceNameStream"))
                  .build();
          }
        }
     }
     return getChangeDeviceNameStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeatingServiceStub newStub(io.grpc.Channel channel) {
    return new HeatingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeatingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeatingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeatingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeatingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HeatingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void initialDevice(org.DS.robertproject.SmartBuildingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.heatingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInitialDeviceMethod(), responseObserver);
    }

    /**
     */
    public void changeTemp(org.DS.robertproject.SmartBuildingGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeTempMethod(), responseObserver);
    }

    /**
     */
    public void changeFanSpeed(org.DS.robertproject.SmartBuildingGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeFanSpeedMethod(), responseObserver);
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

    /**
     */
    public io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.stringRequest> changeDeviceNameStream(
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.stringResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getChangeDeviceNameStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitialDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.DS.robertproject.SmartBuildingGRPC.Empty,
                org.DS.robertproject.SmartBuildingGRPC.heatingResponse>(
                  this, METHODID_INITIAL_DEVICE)))
          .addMethod(
            getChangeTempMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.robertproject.SmartBuildingGRPC.valRequest,
                org.DS.robertproject.SmartBuildingGRPC.valResponse>(
                  this, METHODID_CHANGE_TEMP)))
          .addMethod(
            getChangeFanSpeedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.DS.robertproject.SmartBuildingGRPC.valRequest,
                org.DS.robertproject.SmartBuildingGRPC.valResponse>(
                  this, METHODID_CHANGE_FAN_SPEED)))
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
          .addMethod(
            getChangeDeviceNameStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.DS.robertproject.SmartBuildingGRPC.stringRequest,
                org.DS.robertproject.SmartBuildingGRPC.stringResponse>(
                  this, METHODID_CHANGE_DEVICE_NAME_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class HeatingServiceStub extends io.grpc.stub.AbstractStub<HeatingServiceStub> {
    private HeatingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceStub(channel, callOptions);
    }

    /**
     */
    public void initialDevice(org.DS.robertproject.SmartBuildingGRPC.Empty request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.heatingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitialDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeTemp(org.DS.robertproject.SmartBuildingGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeFanSpeed(org.DS.robertproject.SmartBuildingGRPC.valRequest request,
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeFanSpeedMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.stringRequest> changeDeviceNameStream(
        io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.stringResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getChangeDeviceNameStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HeatingServiceBlockingStub extends io.grpc.stub.AbstractStub<HeatingServiceBlockingStub> {
    private HeatingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.DS.robertproject.SmartBuildingGRPC.heatingResponse initialDevice(org.DS.robertproject.SmartBuildingGRPC.Empty request) {
      return blockingUnaryCall(
          getChannel(), getInitialDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.robertproject.SmartBuildingGRPC.valResponse> changeTemp(
        org.DS.robertproject.SmartBuildingGRPC.valRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.DS.robertproject.SmartBuildingGRPC.valResponse> changeFanSpeed(
        org.DS.robertproject.SmartBuildingGRPC.valRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeFanSpeedMethod(), getCallOptions(), request);
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
  public static final class HeatingServiceFutureStub extends io.grpc.stub.AbstractStub<HeatingServiceFutureStub> {
    private HeatingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.DS.robertproject.SmartBuildingGRPC.heatingResponse> initialDevice(
        org.DS.robertproject.SmartBuildingGRPC.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getInitialDeviceMethod(), getCallOptions()), request);
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
  private static final int METHODID_CHANGE_TEMP = 1;
  private static final int METHODID_CHANGE_FAN_SPEED = 2;
  private static final int METHODID_ON_OFF = 3;
  private static final int METHODID_CHANGE_DEVICE_NAME = 4;
  private static final int METHODID_CHANGE_DEVICE_NAME_STREAM = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeatingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeatingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIAL_DEVICE:
          serviceImpl.initialDevice((org.DS.robertproject.SmartBuildingGRPC.Empty) request,
              (io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.heatingResponse>) responseObserver);
          break;
        case METHODID_CHANGE_TEMP:
          serviceImpl.changeTemp((org.DS.robertproject.SmartBuildingGRPC.valRequest) request,
              (io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.valResponse>) responseObserver);
          break;
        case METHODID_CHANGE_FAN_SPEED:
          serviceImpl.changeFanSpeed((org.DS.robertproject.SmartBuildingGRPC.valRequest) request,
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
        case METHODID_CHANGE_DEVICE_NAME_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.changeDeviceNameStream(
              (io.grpc.stub.StreamObserver<org.DS.robertproject.SmartBuildingGRPC.stringResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeatingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.DS.robertproject.SmartBuildingGRPC.HeatingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeatingService");
    }
  }

  private static final class HeatingServiceFileDescriptorSupplier
      extends HeatingServiceBaseDescriptorSupplier {
    HeatingServiceFileDescriptorSupplier() {}
  }

  private static final class HeatingServiceMethodDescriptorSupplier
      extends HeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeatingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeatingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeatingServiceFileDescriptorSupplier())
              .addMethod(getInitialDeviceMethod())
              .addMethod(getChangeTempMethod())
              .addMethod(getChangeFanSpeedMethod())
              .addMethod(getOnOffMethod())
              .addMethod(getChangeDeviceNameMethod())
              .addMethod(getChangeDeviceNameStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
