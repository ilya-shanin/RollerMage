package com.shanin.rollermage;

import android.app.Application;
import androidx.room.Room;
import com.shanin.rollermage.Models.Database.AppDatabase;

public class GlobalState extends Application {

    public static GlobalState instance;
    private AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = Room.databaseBuilder(this, AppDatabase.class, "rm_database")
                .build();
    }

    public static GlobalState getInstance() {
        return instance;
    }

    public AppDatabase getDatabase() {
        return database;
    }
}
