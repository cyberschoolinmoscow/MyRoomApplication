package com.kkatia.myroomapplication.entities.relations;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.kkatia.myroomapplication.entities.School;
import com.kkatia.myroomapplication.entities.Student;

import java.util.List;

public class SchoolWithStudents {

    @Embedded
    public  School school;

    @Relation(parentColumn = "schoolName",entityColumn = "schoolName")
    public   List<Student> students;
}
