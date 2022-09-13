package com.zrf.picturebed.utils;

import lombok.Data;

public enum Sex {
    MAN("man"),
    WOMAN("woman");

    private String value;

    private Sex(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
