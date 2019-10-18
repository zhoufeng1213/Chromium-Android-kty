
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/media_session/public/mojom/audio_focus.mojom
//

package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class AudioFocusType {


    public static final int GAIN = 0;

    public static final int GAIN_TRANSIENT_MAY_DUCK = GAIN + 1;

    public static final int GAIN_TRANSIENT = GAIN_TRANSIENT_MAY_DUCK + 1;

    public static final int MIN_VALUE = (int) (0);
    public static final int MAX_VALUE = (int) (2);

    private static final boolean IS_EXTENSIBLE = true;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private AudioFocusType() {}

}