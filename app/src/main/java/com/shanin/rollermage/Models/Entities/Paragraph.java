package com.shanin.rollermage.Models.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Paragraph{

    @PrimaryKey
    private long id;
    private int readableOrder;
    private String paragraphText;
    private List<Integer> paragraphImages;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getReadableOrder() {
        return readableOrder;
    }

    public void setReadableOrder(int readableOrder) {
        this.readableOrder = readableOrder;
    }

    public String getParagraphText() {
        return paragraphText;
    }

    public void setParagraphText(String paragraphText) {
        this.paragraphText = paragraphText;
    }

    public List<Integer> getParagraphImages() {
        return paragraphImages;
    }

    public void setParagraphImages(List<Integer> paragraphImages) {
        this.paragraphImages = paragraphImages;
    }
}
