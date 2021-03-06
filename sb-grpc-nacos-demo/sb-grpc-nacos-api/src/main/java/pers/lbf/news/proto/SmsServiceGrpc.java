package pers.lbf.news.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.2)",
    comments = "Source: sms/smsService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmsServiceGrpc {

  private SmsServiceGrpc() {}

  public static final String SERVICE_NAME = "sms.SmsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pers.lbf.news.proto.SmsProtoMessage.SmsSendReq,
      pers.lbf.news.proto.SmsProtoMessage.SmsSendResp> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = pers.lbf.news.proto.SmsProtoMessage.SmsSendReq.class,
      responseType = pers.lbf.news.proto.SmsProtoMessage.SmsSendResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<pers.lbf.news.proto.SmsProtoMessage.SmsSendReq,
      pers.lbf.news.proto.SmsProtoMessage.SmsSendResp> getSendMethod() {
    io.grpc.MethodDescriptor<pers.lbf.news.proto.SmsProtoMessage.SmsSendReq, pers.lbf.news.proto.SmsProtoMessage.SmsSendResp> getSendMethod;
    if ((getSendMethod = SmsServiceGrpc.getSendMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getSendMethod = SmsServiceGrpc.getSendMethod) == null) {
          SmsServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<pers.lbf.news.proto.SmsProtoMessage.SmsSendReq, pers.lbf.news.proto.SmsProtoMessage.SmsSendResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pers.lbf.news.proto.SmsProtoMessage.SmsSendReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pers.lbf.news.proto.SmsProtoMessage.SmsSendResp.getDefaultInstance()))
              .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("Send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pers.lbf.news.proto.SmsProtoMessage.CreatePhoneReq,
      pers.lbf.news.proto.SmsProtoMessage.CreatePhoneResp> getCreatePhoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePhone",
      requestType = pers.lbf.news.proto.SmsProtoMessage.CreatePhoneReq.class,
      responseType = pers.lbf.news.proto.SmsProtoMessage.CreatePhoneResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<pers.lbf.news.proto.SmsProtoMessage.CreatePhoneReq,
      pers.lbf.news.proto.SmsProtoMessage.CreatePhoneResp> getCreatePhoneMethod() {
    io.grpc.MethodDescriptor<pers.lbf.news.proto.SmsProtoMessage.CreatePhoneReq, pers.lbf.news.proto.SmsProtoMessage.CreatePhoneResp> getCreatePhoneMethod;
    if ((getCreatePhoneMethod = SmsServiceGrpc.getCreatePhoneMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getCreatePhoneMethod = SmsServiceGrpc.getCreatePhoneMethod) == null) {
          SmsServiceGrpc.getCreatePhoneMethod = getCreatePhoneMethod =
              io.grpc.MethodDescriptor.<pers.lbf.news.proto.SmsProtoMessage.CreatePhoneReq, pers.lbf.news.proto.SmsProtoMessage.CreatePhoneResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePhone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pers.lbf.news.proto.SmsProtoMessage.CreatePhoneReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pers.lbf.news.proto.SmsProtoMessage.CreatePhoneResp.getDefaultInstance()))
              .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("CreatePhone"))
              .build();
        }
      }
    }
    return getCreatePhoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pers.lbf.news.proto.SmsProtoMessage.PhoneReq,
      pers.lbf.news.proto.SmsProtoMessage.CreateAndSendResp> getCreateWith2StreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWith2Stream",
      requestType = pers.lbf.news.proto.SmsProtoMessage.PhoneReq.class,
      responseType = pers.lbf.news.proto.SmsProtoMessage.CreateAndSendResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<pers.lbf.news.proto.SmsProtoMessage.PhoneReq,
      pers.lbf.news.proto.SmsProtoMessage.CreateAndSendResp> getCreateWith2StreamMethod() {
    io.grpc.MethodDescriptor<pers.lbf.news.proto.SmsProtoMessage.PhoneReq, pers.lbf.news.proto.SmsProtoMessage.CreateAndSendResp> getCreateWith2StreamMethod;
    if ((getCreateWith2StreamMethod = SmsServiceGrpc.getCreateWith2StreamMethod) == null) {
      synchronized (SmsServiceGrpc.class) {
        if ((getCreateWith2StreamMethod = SmsServiceGrpc.getCreateWith2StreamMethod) == null) {
          SmsServiceGrpc.getCreateWith2StreamMethod = getCreateWith2StreamMethod =
              io.grpc.MethodDescriptor.<pers.lbf.news.proto.SmsProtoMessage.PhoneReq, pers.lbf.news.proto.SmsProtoMessage.CreateAndSendResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWith2Stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pers.lbf.news.proto.SmsProtoMessage.PhoneReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pers.lbf.news.proto.SmsProtoMessage.CreateAndSendResp.getDefaultInstance()))
              .setSchemaDescriptor(new SmsServiceMethodDescriptorSupplier("CreateWith2Stream"))
              .build();
        }
      }
    }
    return getCreateWith2StreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsServiceStub>() {
        @java.lang.Override
        public SmsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsServiceStub(channel, callOptions);
        }
      };
    return SmsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsServiceBlockingStub>() {
        @java.lang.Override
        public SmsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsServiceBlockingStub(channel, callOptions);
        }
      };
    return SmsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmsServiceFutureStub>() {
        @java.lang.Override
        public SmsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmsServiceFutureStub(channel, callOptions);
        }
      };
    return SmsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SmsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ????????????
     * </pre>
     */
    public void send(pers.lbf.news.proto.SmsProtoMessage.SmsSendReq request,
        io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.SmsSendResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     * <pre>
     * ????????????
     * </pre>
     */
    public io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.CreatePhoneReq> createPhone(
        io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.CreatePhoneResp> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreatePhoneMethod(), responseObserver);
    }

    /**
     * <pre>
     * ?????????
     * </pre>
     */
    public io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.PhoneReq> createWith2Stream(
        io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.CreateAndSendResp> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateWith2StreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                pers.lbf.news.proto.SmsProtoMessage.SmsSendReq,
                pers.lbf.news.proto.SmsProtoMessage.SmsSendResp>(
                  this, METHODID_SEND)))
          .addMethod(
            getCreatePhoneMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                pers.lbf.news.proto.SmsProtoMessage.CreatePhoneReq,
                pers.lbf.news.proto.SmsProtoMessage.CreatePhoneResp>(
                  this, METHODID_CREATE_PHONE)))
          .addMethod(
            getCreateWith2StreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                pers.lbf.news.proto.SmsProtoMessage.PhoneReq,
                pers.lbf.news.proto.SmsProtoMessage.CreateAndSendResp>(
                  this, METHODID_CREATE_WITH2STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class SmsServiceStub extends io.grpc.stub.AbstractAsyncStub<SmsServiceStub> {
    private SmsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ????????????
     * </pre>
     */
    public void send(pers.lbf.news.proto.SmsProtoMessage.SmsSendReq request,
        io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.SmsSendResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ????????????
     * </pre>
     */
    public io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.CreatePhoneReq> createPhone(
        io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.CreatePhoneResp> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreatePhoneMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * ?????????
     * </pre>
     */
    public io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.PhoneReq> createWith2Stream(
        io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.CreateAndSendResp> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCreateWith2StreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SmsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SmsServiceBlockingStub> {
    private SmsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ????????????
     * </pre>
     */
    public java.util.Iterator<pers.lbf.news.proto.SmsProtoMessage.SmsSendResp> send(
        pers.lbf.news.proto.SmsProtoMessage.SmsSendReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SmsServiceFutureStub> {
    private SmsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmsServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_CREATE_PHONE = 1;
  private static final int METHODID_CREATE_WITH2STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((pers.lbf.news.proto.SmsProtoMessage.SmsSendReq) request,
              (io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.SmsSendResp>) responseObserver);
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
        case METHODID_CREATE_PHONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createPhone(
              (io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.CreatePhoneResp>) responseObserver);
        case METHODID_CREATE_WITH2STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createWith2Stream(
              (io.grpc.stub.StreamObserver<pers.lbf.news.proto.SmsProtoMessage.CreateAndSendResp>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pers.lbf.news.proto.SmsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmsService");
    }
  }

  private static final class SmsServiceFileDescriptorSupplier
      extends SmsServiceBaseDescriptorSupplier {
    SmsServiceFileDescriptorSupplier() {}
  }

  private static final class SmsServiceMethodDescriptorSupplier
      extends SmsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmsServiceFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .addMethod(getCreatePhoneMethod())
              .addMethod(getCreateWith2StreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
