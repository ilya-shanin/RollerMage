package com.shanin.rollermage.Models;

import java.util.List;

public class Content implements IContent{

    private String content;
    private String videoURL;
    private List<Integer> images;

    public Content(String content, String videoURL, List<Integer> images) {
        this.content = content;
        this.videoURL = videoURL;
        this.images = images;
    }

    @Override
    public String getTutorialContent() {
        return content;
    }

    @Override
    public String tutorialVideoURL() {
        return videoURL;
    }

    @Override
    public List<Integer> getImageArray() {return  images;}
}
