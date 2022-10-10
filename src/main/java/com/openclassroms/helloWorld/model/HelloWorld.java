package com.openclassroms.helloWorld.model;

public class HelloWorld {

    private String value = "Hello World";

    public HelloWorld() {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
