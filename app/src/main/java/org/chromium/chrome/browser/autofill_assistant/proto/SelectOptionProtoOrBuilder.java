// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

public interface SelectOptionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:autofill_assistant.SelectOptionProto)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The drop down element on which to select an option.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 2;</code>
   */
  boolean hasElement();
  /**
   * <pre>
   * The drop down element on which to select an option.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto element = 2;</code>
   */
  org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getElement();

  /**
   * <pre>
   * Value of the option to use.
   * </pre>
   *
   * <code>optional string selected_option = 3;</code>
   */
  boolean hasSelectedOption();
  /**
   * <pre>
   * Value of the option to use.
   * </pre>
   *
   * <code>optional string selected_option = 3;</code>
   */
  java.lang.String getSelectedOption();
  /**
   * <pre>
   * Value of the option to use.
   * </pre>
   *
   * <code>optional string selected_option = 3;</code>
   */
  com.google.protobuf.ByteString
      getSelectedOptionBytes();
}
