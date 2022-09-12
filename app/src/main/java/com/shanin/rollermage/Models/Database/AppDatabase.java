package com.shanin.rollermage.Models.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.shanin.rollermage.Models.DAO.TutorialDao;
import com.shanin.rollermage.Models.Entities.Paragraph;
import com.shanin.rollermage.Models.Entities.Tutorial;

@Database(entities = {Tutorial.class, Paragraph.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract TutorialDao tutorialDao();
}
