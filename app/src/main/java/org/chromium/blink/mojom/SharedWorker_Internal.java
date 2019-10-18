
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/shared_worker.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class SharedWorker_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<SharedWorker, SharedWorker.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<SharedWorker, SharedWorker.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.SharedWorker";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, SharedWorker impl) {
            return new Stub(core, impl);
        }

        @Override
        public SharedWorker[] buildArray(int size) {
          return new SharedWorker[size];
        }
    };


    private static final int CONNECT_ORDINAL = 0;

    private static final int TERMINATE_ORDINAL = 1;

    private static final int BIND_DEV_TOOLS_AGENT_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements SharedWorker.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void connect(
int connectionId, org.chromium.mojo.system.MessagePipeHandle messagePort) {

            SharedWorkerConnectParams _message = new SharedWorkerConnectParams();

            _message.connectionId = connectionId;

            _message.messagePort = messagePort;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CONNECT_ORDINAL)));

        }


        @Override
        public void terminate(
) {

            SharedWorkerTerminateParams _message = new SharedWorkerTerminateParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(TERMINATE_ORDINAL)));

        }


        @Override
        public void bindDevToolsAgent(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported agentHost, org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported agent) {

            SharedWorkerBindDevToolsAgentParams _message = new SharedWorkerBindDevToolsAgentParams();

            _message.agentHost = agentHost;

            _message.agent = agent;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(BIND_DEV_TOOLS_AGENT_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<SharedWorker> {

        Stub(org.chromium.mojo.system.Core core, SharedWorker impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                SharedWorker_Internal.MANAGER, messageWithHeader);





                    case CONNECT_ORDINAL: {

                        SharedWorkerConnectParams data =
                                SharedWorkerConnectParams.deserialize(messageWithHeader.getPayload());

                        getImpl().connect(data.connectionId, data.messagePort);
                        return true;
                    }





                    case TERMINATE_ORDINAL: {

                        SharedWorkerTerminateParams.deserialize(messageWithHeader.getPayload());

                        getImpl().terminate();
                        return true;
                    }





                    case BIND_DEV_TOOLS_AGENT_ORDINAL: {

                        SharedWorkerBindDevToolsAgentParams data =
                                SharedWorkerBindDevToolsAgentParams.deserialize(messageWithHeader.getPayload());

                        getImpl().bindDevToolsAgent(data.agentHost, data.agent);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), SharedWorker_Internal.MANAGER, messageWithHeader, receiver);








                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class SharedWorkerConnectParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int connectionId;
        public org.chromium.mojo.system.MessagePipeHandle messagePort;

        private SharedWorkerConnectParams(int version) {
            super(STRUCT_SIZE, version);
            this.messagePort = org.chromium.mojo.system.InvalidHandle.INSTANCE;
        }

        public SharedWorkerConnectParams() {
            this(0);
        }

        public static SharedWorkerConnectParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SharedWorkerConnectParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SharedWorkerConnectParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SharedWorkerConnectParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SharedWorkerConnectParams(elementsOrVersion);
                    {
                        
                    result.connectionId = decoder0.readInt(8);
                    }
                    {
                        
                    result.messagePort = decoder0.readMessagePipeHandle(12, false);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.connectionId, 8);
            
            encoder0.encode(this.messagePort, 12, false);
        }
    }



    
    static final class SharedWorkerTerminateParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private SharedWorkerTerminateParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SharedWorkerTerminateParams() {
            this(0);
        }

        public static SharedWorkerTerminateParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SharedWorkerTerminateParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SharedWorkerTerminateParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SharedWorkerTerminateParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SharedWorkerTerminateParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class SharedWorkerBindDevToolsAgentParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.AssociatedInterfaceNotSupported agentHost;
        public org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported agent;

        private SharedWorkerBindDevToolsAgentParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SharedWorkerBindDevToolsAgentParams() {
            this(0);
        }

        public static SharedWorkerBindDevToolsAgentParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SharedWorkerBindDevToolsAgentParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SharedWorkerBindDevToolsAgentParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SharedWorkerBindDevToolsAgentParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SharedWorkerBindDevToolsAgentParams(elementsOrVersion);
                    {
                        
                    result.agentHost = decoder0.readAssociatedServiceInterfaceNotSupported(8, false);
                    }
                    {
                        
                    result.agent = decoder0.readAssociatedInterfaceRequestNotSupported(16, false);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.agentHost, 8, false);
            
            encoder0.encode(this.agent, 16, false);
        }
    }



}