package com.shanin.rollermage.Models;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements IParagraph{

    private String paragraphText;
    private List<Integer> paragraphImages;

    public Paragraph (String text, List<Integer> images){
        this.paragraphText = text;
        this.paragraphImages = images;
    }

    public Paragraph (String text){
        this.paragraphText = text;
        this.paragraphImages = new ArrayList<>();
    }

    public Paragraph (List<Integer> images){
        this.paragraphImages = images;
        this.paragraphText = "";
    }

    @Override
    public String getParagraphText() {
        return paragraphText;
    }

    @Override
    public List<Integer> getParagraphImages() {
        return paragraphImages;
    }

    @Override
    public void setParagraphText(String paragraphText) {
        this.paragraphText = paragraphText;
    }

    @Override
    public void setParagraphImages(List<Integer> paragraphImages) {
        this.paragraphImages = paragraphImages;
    }
}
