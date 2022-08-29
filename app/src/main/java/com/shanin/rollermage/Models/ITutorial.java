package com.shanin.rollermage.Models;

import java.util.List;

public interface ITutorial {

    String getName();


    int getDifficulty();

    int getTitleImage();

    int getTutorialLevel();

    List<Paragraph> getContent();

}
