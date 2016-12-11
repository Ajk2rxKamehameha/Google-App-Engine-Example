/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-10-17 16:43:55 UTC)
 * on 2016-12-11 at 04:51:17 UTC 
 * Modify at your own risk.
 */

package com.example.backend.extractApi.model;

/**
 * Model definition for Status.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the extractApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Status extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String credits;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String msg;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String remainingCredits;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * @param code code or {@code null} for none
   */
  public Status setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCredits() {
    return credits;
  }

  /**
   * @param credits credits or {@code null} for none
   */
  public Status setCredits(java.lang.String credits) {
    this.credits = credits;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMsg() {
    return msg;
  }

  /**
   * @param msg msg or {@code null} for none
   */
  public Status setMsg(java.lang.String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRemainingCredits() {
    return remainingCredits;
  }

  /**
   * @param remainingCredits remainingCredits or {@code null} for none
   */
  public Status setRemainingCredits(java.lang.String remainingCredits) {
    this.remainingCredits = remainingCredits;
    return this;
  }

  @Override
  public Status set(String fieldName, Object value) {
    return (Status) super.set(fieldName, value);
  }

  @Override
  public Status clone() {
    return (Status) super.clone();
  }

}
