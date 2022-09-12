package com.shanin.rollermage.Models.Entities;

import static androidx.room.ForeignKey.CASCADE;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "paragraphs", foreignKeys = @ForeignKey(entity = Tutorial.class, parentColumns = "id", childColumns = "tutorialId", onDelete = CASCADE, onUpdate = CASCADE))
public class Paragraph{

    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "tutorial_id")
    private long tutorialId; // foreign key

    @ColumnInfo(name = "readable_order")
    private int readableOrder;

    @ColumnInfo(name = "paragraph_text")
    private String paragraphText;

    @ColumnInfo(name = "paragraph_images")
    private List<Integer> paragraphImages;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTutorialId() {
        return tutorialId;
    }

    public void setTutorialId(long tutorialId) {
        this.tutorialId = tutorialId;
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
