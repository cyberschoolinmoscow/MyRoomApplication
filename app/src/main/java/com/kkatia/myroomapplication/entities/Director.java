package com.kkatia.myroomapplication.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Director{
    @NonNull
    @PrimaryKey(autoGenerate = false)
  public   String directorName;
    public  String schoolName;

    public Director(String directorName, String schoolName) {
        this.directorName = directorName;
        this.schoolName = schoolName;
    }
}