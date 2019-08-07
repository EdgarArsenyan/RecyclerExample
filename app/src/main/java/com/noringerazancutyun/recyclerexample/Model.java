package com.noringerazancutyun.recyclerexample;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private String text;
    private int photoId;

    public Model(String text, int photoId) {
        this.text = text;
        this.photoId = photoId;
    }

    public String getText() {
        return text;
    }

    public int getPhotoId() {
        return photoId;
    }

}
