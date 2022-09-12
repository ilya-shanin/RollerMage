package com.shanin.rollermage.Models.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity
public class Tutorial{

    @PrimaryKey
    private long id;
    private String name;
    private int difficulty;
    private int titleImage;
    private int tutorialLevel;
    private List<Paragraph> content;

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

    public List<Paragraph> getContent() {
        return content;
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

    public void setContent(List<Paragraph> content) {
        this.content = content;
    }

}
