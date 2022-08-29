package com.shanin.rollermage.Models;

import java.util.List;

public class Tutorial implements ITutorial{

    private final String name;
    private final int difficulty;
    private final int titleImage;
    private final int tutorialLevel;
    private final List<Paragraph> content;

    public Tutorial(String name, int difficulty, int titleImage, int tutorialLevel, List<Paragraph> content) {
        this.name = name;
        this.difficulty = difficulty;
        this.titleImage = titleImage;
        this.tutorialLevel = tutorialLevel;
        this.content = content;
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
    public List<Paragraph> getContent() {
        return content;
    }

}
