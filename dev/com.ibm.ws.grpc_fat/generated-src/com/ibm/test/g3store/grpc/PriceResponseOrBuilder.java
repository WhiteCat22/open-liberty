// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConsumerStore.proto

package com.ibm.test.g3store.grpc;

public interface PriceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:test.g3store.grpc.PriceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .Price prices = 2;</code>
   */
  java.util.List<com.ibm.test.g3store.grpc.Price> 
      getPricesList();
  /**
   * <code>repeated .Price prices = 2;</code>
   */
  com.ibm.test.g3store.grpc.Price getPrices(int index);
  /**
   * <code>repeated .Price prices = 2;</code>
   */
  int getPricesCount();
  /**
   * <code>repeated .Price prices = 2;</code>
   */
  java.util.List<? extends com.ibm.test.g3store.grpc.PriceOrBuilder> 
      getPricesOrBuilderList();
  /**
   * <code>repeated .Price prices = 2;</code>
   */
  com.ibm.test.g3store.grpc.PriceOrBuilder getPricesOrBuilder(
      int index);
}