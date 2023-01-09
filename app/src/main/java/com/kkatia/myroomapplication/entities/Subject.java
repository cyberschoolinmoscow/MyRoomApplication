package com.kkatia.myroomapplication.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Subject {
    @NonNull
    @PrimaryKey(autoGenerate = false)
    public  String subjectName;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }
}
