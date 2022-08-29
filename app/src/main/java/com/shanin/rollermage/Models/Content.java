package com.shanin.rollermage.Models;

import java.util.List;

public class Content implements IContent{

    private List<Paragraph> content;

    public Content(List<Paragraph> content) {
        this.content = content;
    }

    @Override
    public List<Paragraph> getTutorialContent() {
        return content;
    }

}
