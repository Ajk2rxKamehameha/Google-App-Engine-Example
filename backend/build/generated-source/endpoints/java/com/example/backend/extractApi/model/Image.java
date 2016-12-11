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
 * Model definition for Image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the extractApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Image extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object caption;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Color> colors;

  static {
    // hack to force ProGuard to consider Color used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Color.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float entropy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer size;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getCaption() {
    return caption;
  }

  /**
   * @param caption caption or {@code null} for none
   */
  public Image setCaption(java.lang.Object caption) {
    this.caption = caption;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Color> getColors() {
    return colors;
  }

  /**
   * @param colors colors or {@code null} for none
   */
  public Image setColors(java.util.List<Color> colors) {
    this.colors = colors;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getEntropy() {
    return entropy;
  }

  /**
   * @param entropy entropy or {@code null} for none
   */
  public Image setEntropy(java.lang.Float entropy) {
    this.entropy = entropy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * @param height height or {@code null} for none
   */
  public Image setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSize() {
    return size;
  }

  /**
   * @param size size or {@code null} for none
   */
  public Image setSize(java.lang.Integer size) {
    this.size = size;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * @param url url or {@code null} for none
   */
  public Image setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * @param width width or {@code null} for none
   */
  public Image setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public Image set(String fieldName, Object value) {
    return (Image) super.set(fieldName, value);
  }

  @Override
  public Image clone() {
    return (Image) super.clone();
  }

}
