package com.shanin.rollermage.Models;

import android.media.Image;

public class Tutorial implements ITutorial{

    private final String name;
    private final int difficulty;
    private final int titleImage;
    private final int tutorialLevel;
    private final Content content;
    private final String overview;

    public Tutorial(String name, int difficulty, int titleImage, int tutorialLevel, Content content, String overview) {
        this.name = name;
        this.difficulty = difficulty;
        this.titleImage = titleImage;
        this.tutorialLevel = tutorialLevel;
        this.content = content;
        this.overview = overview;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDifficulty() {
        return difficulty;
    }

    @Override
    public int getTitleImage() {
        return titleImage;
    }

    @Override
    public int getTutorialLevel() {
        return tutorialLevel;
    }

    @Override
    public Content getContent() {
        return content;
    }

    @Override
    public String getOverview(){
        return overview;
    }

}
