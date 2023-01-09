package com.kkatia.myroomapplication.entities.relations;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.kkatia.myroomapplication.entities.Student;
import com.kkatia.myroomapplication.entities.Subject;

import java.util.List;

public class StudentWithSubject {
    @Embedded
    public   Student student;
    @Relation(parentColumn = "studentName",entityColumn = "subjectName",
            associateBy = @Junction(StudentSubjectCrossRef.class))
    public  List<Subject> subjects;
}