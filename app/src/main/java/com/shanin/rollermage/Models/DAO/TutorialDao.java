package com.shanin.rollermage.Models.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.shanin.rollermage.Models.Entities.Tutorial;
import java.util.List;

@Dao
public interface TutorialDao {

    @Query("SELECT * FROM tutorials WHERE tutorial_level = :level")
    List<Tutorial> getAllByLevel(int level);

    @Query("SELECT * FROM tutorials WHERE id = :id")
    Tutorial getById(long id);

    @Query("SELECT * FROM tutorials")
    List<Tutorial> getAll();

    @Query("DELETE from tutorials WHERE id IN (:idList)")
    int deleteByIdList(List<Long> idList);

    @Insert
    void insert(Tutorial tutorial);

    @Insert
    void insert(List<Tutorial> tutorials);

    @Update
    void update(Tutorial tutorial);

    @Update
    void update(List<Tutorial> tutorials);

    @Delete
    void delete(Tutorial tutorial);

    @Delete
    void delete(List<Tutorial> tutorial);

}
