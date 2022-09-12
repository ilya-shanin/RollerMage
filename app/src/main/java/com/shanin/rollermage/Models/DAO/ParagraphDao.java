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

    @Query("SELECT * FROM paragraph")
    List<Paragraph> getAll();

    @Query("SELECT * FROM paragraph WHERE id = :id")
    Paragraph getById(long id);

    @Insert
    void insert(Paragraph paragraph);

    @Update
    void update(Paragraph paragraph);

    @Delete
    void delete(Paragraph paragraph);
}
