package com.kkatia.myroomapplication.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class School{
    @NonNull
    @PrimaryKey(autoGenerate = false)

  public   String schoolName;

    public School( String schoolName) {
        this.schoolName=schoolName;
    }
}