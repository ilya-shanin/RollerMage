package com.shanin.rollermage.Models.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tutorials")
public class Tutorial{

    @PrimaryKey(autoGenerate = true)
    private long id;

    private String name;

    private int difficulty;

    @ColumnInfo(name = "title_image")
    private int titleImage;

    @ColumnInfo(name = "tutorial_level")
    private int tutorialLevel;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getTitleImage() {
        return titleImage;
    }

    public int getTutorialLevel() {
        return tutorialLevel;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setTitleImage(int titleImage) {
        this.titleImage = titleImage;
    }

    public void setTutorialLevel(int tutorialLevel) {
        this.tutorialLevel = tutorialLevel;
    }

}
