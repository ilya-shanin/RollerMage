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

    @Query("SELECT * FROM tutorial WHERE tutorialLevel = :level")
    List<Tutorial> getAllByLevel(int level);

    @Query("SELECT * FROM tutorial WHERE id = :id")
    Tutorial getById(long id);

    @Query("SELECT * FROM tutorial")
    List<Tutorial> getAll();

    @Insert
    void insert(Tutorial tutorial);

    @Update
    void update(Tutorial tutorial);

    @Delete
    void delete(Tutorial tutorial);

}
