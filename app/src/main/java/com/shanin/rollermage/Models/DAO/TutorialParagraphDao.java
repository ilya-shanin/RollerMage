package com.shanin.rollermage.Models.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Transaction;

import com.shanin.rollermage.Models.Entities.Paragraph;
import com.shanin.rollermage.Models.Entities.Tutorial;

import java.util.List;

@Dao
public abstract class TutorialParagraphDao {

    @Insert
    public abstract void insertTutorial(Tutorial tutorial);

    @Insert
    public abstract void insertParagraph(List<Paragraph> paragraphs);

    @Transaction
    public void insertTutorialAndParagraphs(Tutorial tutorial, List<Paragraph> paragraphs) {
        insertTutorial(tutorial);
        insertParagraph(paragraphs);
    }
}
