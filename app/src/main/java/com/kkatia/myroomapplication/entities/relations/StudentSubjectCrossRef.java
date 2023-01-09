package com.kkatia.myroomapplication.entities.relations;

import androidx.annotation.NonNull;
import androidx.room.Entity;

@Entity(primaryKeys = {"studentName","subjectName"})
public class StudentSubjectCrossRef {
    @NonNull
    public  String studentName;
    @NonNull
    public   String subjectName;

    public StudentSubjectCrossRef(String studentName, String subjectName) {
        this.studentName = studentName;
        this.subjectName = subjectName;
    }
}
