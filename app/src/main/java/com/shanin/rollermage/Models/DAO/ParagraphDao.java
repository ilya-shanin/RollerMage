package com.shanin.rollermage.Models.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.shanin.rollermage.Models.Entities.Paragraph;
import java.util.List;

@Dao
public interface ParagraphDao {

    @Query("SELECT * FROM paragraphs")
    List<Paragraph> getAll();

    @Query("SELECT * FROM paragraphs WHERE id = :id")
    Paragraph getById(long id);

    @Query("SELECT * FROM paragraphs WHERE tutorial_id = :tutorialId")
    List<Paragraph> getAllByTutorialId(long tutorialId);

    @Query("DELETE from paragraphs WHERE id IN (:idList)")
    int deleteByIdList(List<Long> idList);

    @Insert
    void insert(Paragraph paragraph);

    @Insert
    void insert(List<Paragraph> paragraphs);

    @Update
    void update(Paragraph paragraph);

    @Update
    void update(List<Paragraph> paragraphs);

    @Delete
    void delete(Paragraph paragraph);

    @Delete
    void delete(List<Paragraph> paragraphs);
}
