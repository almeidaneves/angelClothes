package com.ecommerce.angelClothes.model;

import com.sun.source.doctree.SerialDataTree;

import java.io.Serializable;

public class AngelClothesResponse implements Serializable {
    private int responseCode;
    private String description;

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
