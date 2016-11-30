
package com.example.backend.ExtractApi.Models.NewsClassification;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TermList {

    private String form;
    private String absRelevance;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TermList() {
    }

    /**
     * 
     * @param form
     * @param absRelevance
     */
    public TermList(String form, String absRelevance) {
        this.form = form;
        this.absRelevance = absRelevance;
    }

    /**
     * 
     * @return
     *     The form
     */
    public String getForm() {
        return form;
    }

    /**
     * 
     * @param form
     *     The form
     */
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * 
     * @return
     *     The absRelevance
     */
    public String getAbsRelevance() {
        return absRelevance;
    }

    /**
     * 
     * @param absRelevance
     *     The abs_relevance
     */
    public void setAbsRelevance(String absRelevance) {
        this.absRelevance = absRelevance;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}