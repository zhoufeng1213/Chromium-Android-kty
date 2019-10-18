// Copyright 2018 The Feed Authors.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.android.libraries.feed.api.modelprovider;

import com.google.search.now.feed.client.StreamDataProto.StreamToken;

/** Defines the behavior of a Continuation Token. */
public interface ModelToken {
  /** Returns the {@link StreamToken} proto instance. */
  StreamToken getStreamToken();

  /** Returns {@code true} if token was generated on-device and can complete quickly. */
  boolean isSynthetic();

  /** Register a {@link TokenCompletedObserver} for completion of this continuation token. */
  void registerObserver(TokenCompletedObserver observer);

  /** Remove a registered observer */
  void unregisterObserver(TokenCompletedObserver observer);
}
