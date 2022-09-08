package com.zrf.picturebed.utils;

import lombok.Data;

public enum Sex {
    MAN("男"),
    WOMAN("女");

    private String value;

    private Sex(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
