package com.example.cs50.arduino;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import static  com.example.cs50.arduino.StrollDB.SQL_CREATE_ENTRIES;
import static  com.example.cs50.arduino.StrollDB.SQL_DELETE_ENTRIES;

public class MyHelper extends SQLiteOpenHelper {

    public static  final int DB_VERSION = 1;
    public static final String DB_NAME = "Stroll.db";

    public MyHelper(@Nullable Context context) {
        super(context,DB_NAME,null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
}
