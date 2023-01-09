package com.kkatia.myroomapplication.entities.relations;


import androidx.room.Embedded;
import androidx.room.Relation;

import com.kkatia.myroomapplication.entities.Director;
import com.kkatia.myroomapplication.entities.School;

public class SchoolAndDirector {
@Embedded
    private  School school;
@Relation(parentColumn = "schoolName",entityColumn = "schoolName")
    private  Director director;

    public SchoolAndDirector(School school, Director director) {
        this.school =school;
        this.director =director;
    }
}
