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
 * Model definition for ExtractedNewsObject.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the extractApi. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExtractedNewsObject extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppLink> appLinks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Author> authors;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer cacheAge;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> embeds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Entity> entities;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FaviconColor> faviconColors;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String faviconUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Image> images;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Keyword> keywords;

  static {
    // hack to force ProGuard to consider Keyword used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Keyword.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object lead;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Media media;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NewsClassification newsClassification;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object offset;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String providerDisplay;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String providerName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String providerUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object published;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> related;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean safe;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AppLink> getAppLinks() {
    return appLinks;
  }

  /**
   * @param appLinks appLinks or {@code null} for none
   */
  public ExtractedNewsObject setAppLinks(java.util.List<AppLink> appLinks) {
    this.appLinks = appLinks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Author> getAuthors() {
    return authors;
  }

  /**
   * @param authors authors or {@code null} for none
   */
  public ExtractedNewsObject setAuthors(java.util.List<Author> authors) {
    this.authors = authors;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCacheAge() {
    return cacheAge;
  }

  /**
   * @param cacheAge cacheAge or {@code null} for none
   */
  public ExtractedNewsObject setCacheAge(java.lang.Integer cacheAge) {
    this.cacheAge = cacheAge;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * @param content content or {@code null} for none
   */
  public ExtractedNewsObject setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public ExtractedNewsObject setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getEmbeds() {
    return embeds;
  }

  /**
   * @param embeds embeds or {@code null} for none
   */
  public ExtractedNewsObject setEmbeds(java.util.List<java.lang.Object> embeds) {
    this.embeds = embeds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Entity> getEntities() {
    return entities;
  }

  /**
   * @param entities entities or {@code null} for none
   */
  public ExtractedNewsObject setEntities(java.util.List<Entity> entities) {
    this.entities = entities;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<FaviconColor> getFaviconColors() {
    return faviconColors;
  }

  /**
   * @param faviconColors faviconColors or {@code null} for none
   */
  public ExtractedNewsObject setFaviconColors(java.util.List<FaviconColor> faviconColors) {
    this.faviconColors = faviconColors;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFaviconUrl() {
    return faviconUrl;
  }

  /**
   * @param faviconUrl faviconUrl or {@code null} for none
   */
  public ExtractedNewsObject setFaviconUrl(java.lang.String faviconUrl) {
    this.faviconUrl = faviconUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Image> getImages() {
    return images;
  }

  /**
   * @param images images or {@code null} for none
   */
  public ExtractedNewsObject setImages(java.util.List<Image> images) {
    this.images = images;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Keyword> getKeywords() {
    return keywords;
  }

  /**
   * @param keywords keywords or {@code null} for none
   */
  public ExtractedNewsObject setKeywords(java.util.List<Keyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * @param language language or {@code null} for none
   */
  public ExtractedNewsObject setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getLead() {
    return lead;
  }

  /**
   * @param lead lead or {@code null} for none
   */
  public ExtractedNewsObject setLead(java.lang.Object lead) {
    this.lead = lead;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Media getMedia() {
    return media;
  }

  /**
   * @param media media or {@code null} for none
   */
  public ExtractedNewsObject setMedia(Media media) {
    this.media = media;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NewsClassification getNewsClassification() {
    return newsClassification;
  }

  /**
   * @param newsClassification newsClassification or {@code null} for none
   */
  public ExtractedNewsObject setNewsClassification(NewsClassification newsClassification) {
    this.newsClassification = newsClassification;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getOffset() {
    return offset;
  }

  /**
   * @param offset offset or {@code null} for none
   */
  public ExtractedNewsObject setOffset(java.lang.Object offset) {
    this.offset = offset;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalUrl() {
    return originalUrl;
  }

  /**
   * @param originalUrl originalUrl or {@code null} for none
   */
  public ExtractedNewsObject setOriginalUrl(java.lang.String originalUrl) {
    this.originalUrl = originalUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProviderDisplay() {
    return providerDisplay;
  }

  /**
   * @param providerDisplay providerDisplay or {@code null} for none
   */
  public ExtractedNewsObject setProviderDisplay(java.lang.String providerDisplay) {
    this.providerDisplay = providerDisplay;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProviderName() {
    return providerName;
  }

  /**
   * @param providerName providerName or {@code null} for none
   */
  public ExtractedNewsObject setProviderName(java.lang.String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProviderUrl() {
    return providerUrl;
  }

  /**
   * @param providerUrl providerUrl or {@code null} for none
   */
  public ExtractedNewsObject setProviderUrl(java.lang.String providerUrl) {
    this.providerUrl = providerUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Object getPublished() {
    return published;
  }

  /**
   * @param published published or {@code null} for none
   */
  public ExtractedNewsObject setPublished(java.lang.Object published) {
    this.published = published;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getRelated() {
    return related;
  }

  /**
   * @param related related or {@code null} for none
   */
  public ExtractedNewsObject setRelated(java.util.List<java.lang.Object> related) {
    this.related = related;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSafe() {
    return safe;
  }

  /**
   * @param safe safe or {@code null} for none
   */
  public ExtractedNewsObject setSafe(java.lang.Boolean safe) {
    this.safe = safe;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public ExtractedNewsObject setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public ExtractedNewsObject setType(java.lang.String type) {
    this.type = type;
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
  public ExtractedNewsObject setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public ExtractedNewsObject set(String fieldName, Object value) {
    return (ExtractedNewsObject) super.set(fieldName, value);
  }

  @Override
  public ExtractedNewsObject clone() {
    return (ExtractedNewsObject) super.clone();
  }

}
