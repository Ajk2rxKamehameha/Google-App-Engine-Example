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
 * on 2016-12-11 at 04:51:15 UTC 
 * Modify at your own risk.
 */

package com.example.backend.socialApi.model;

/**
 * Model definition for FacebookProfile.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the socialApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FacebookProfile extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AgeRange ageRange;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String birthday;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Device> devices;

  static {
    // hack to force ProGuard to consider Device used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Device.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gender;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Hometown hometown;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * @return value or {@code null} for none
   */
  public AgeRange getAgeRange() {
    return ageRange;
  }

  /**
   * @param ageRange ageRange or {@code null} for none
   */
  public FacebookProfile setAgeRange(AgeRange ageRange) {
    this.ageRange = ageRange;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBirthday() {
    return birthday;
  }

  /**
   * @param birthday birthday or {@code null} for none
   */
  public FacebookProfile setBirthday(java.lang.String birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Device> getDevices() {
    return devices;
  }

  /**
   * @param devices devices or {@code null} for none
   */
  public FacebookProfile setDevices(java.util.List<Device> devices) {
    this.devices = devices;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public FacebookProfile setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGender() {
    return gender;
  }

  /**
   * @param gender gender or {@code null} for none
   */
  public FacebookProfile setGender(java.lang.String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Hometown getHometown() {
    return hometown;
  }

  /**
   * @param hometown hometown or {@code null} for none
   */
  public FacebookProfile setHometown(Hometown hometown) {
    this.hometown = hometown;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public FacebookProfile setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public FacebookProfile setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public FacebookProfile set(String fieldName, Object value) {
    return (FacebookProfile) super.set(fieldName, value);
  }

  @Override
  public FacebookProfile clone() {
    return (FacebookProfile) super.clone();
  }

}