package com.booleanuk.api.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Language {
    private String name;

    public Language() {

    }
    public Language(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
