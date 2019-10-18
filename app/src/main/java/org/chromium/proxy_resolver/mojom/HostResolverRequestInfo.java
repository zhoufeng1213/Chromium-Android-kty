
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/proxy_resolver/public/mojom/proxy_resolver.mojom
//

package org.chromium.proxy_resolver.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class HostResolverRequestInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String host;
    public short port;
    public int addressFamily;
    public boolean isMyIpAddress;

    private HostResolverRequestInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public HostResolverRequestInfo() {
        this(0);
    }

    public static HostResolverRequestInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static HostResolverRequestInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static HostResolverRequestInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        HostResolverRequestInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new HostResolverRequestInfo(elementsOrVersion);
                {
                    
                result.host = decoder0.readString(8, false);
                }
                {
                    
                result.port = decoder0.readShort(16);
                }
                {
                    
                result.isMyIpAddress = decoder0.readBoolean(18, 0);
                }
                {
                    
                result.addressFamily = decoder0.readInt(20);
                    org.chromium.network.mojom.AddressFamily.validate(result.addressFamily);
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
        
        encoder0.encode(this.host, 8, false);
        
        encoder0.encode(this.port, 16);
        
        encoder0.encode(this.isMyIpAddress, 18, 0);
        
        encoder0.encode(this.addressFamily, 20);
    }
}