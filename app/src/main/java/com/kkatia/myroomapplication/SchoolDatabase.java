package com.kkatia.myroomapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.kkatia.myroomapplication.entities.Director;
import com.kkatia.myroomapplication.entities.School;
import com.kkatia.myroomapplication.entities.Student;
import com.kkatia.myroomapplication.entities.Subject;
import com.kkatia.myroomapplication.entities.relations.SchoolAndDirector;
import com.kkatia.myroomapplication.entities.relations.SchoolWithStudents;
import com.kkatia.myroomapplication.entities.relations.StudentSubjectCrossRef;
import com.kkatia.myroomapplication.entities.relations.StudentWithSubject;
import com.kkatia.myroomapplication.entities.relations.SubjectWithStudent;

import java.util.List;

import kotlin.jvm.Volatile;

@Database(
        entities = {School.class, Student.class, Director.class, Subject.class, StudentSubjectCrossRef.class},
        version = 1
)
public abstract class SchoolDatabase extends RoomDatabase {
    public abstract SchoolDao schoolDao();
}