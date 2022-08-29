package com.shanin.rollermage.Models;

import java.util.ArrayList;
import java.util.List;

public interface IParagraph {

    public String getParagraphText();

    public List<Integer> getParagraphImages();

    public void setParagraphText(String text);

    public void setParagraphImages(List<Integer> images);
}
