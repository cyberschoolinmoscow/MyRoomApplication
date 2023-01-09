package com.kkatia.myroomapplication.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;



@Entity
public class Student {
    @NonNull
    @PrimaryKey(autoGenerate = false)
    public  String studentName;
    public    Integer semester;
    public    String schoolName;


    public Student(String studentName, Integer semester, String schoolName) {
        this.studentName = studentName;
        this.semester = semester;
        this.schoolName = schoolName;
    }
}
