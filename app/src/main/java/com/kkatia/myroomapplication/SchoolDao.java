package com.kkatia.myroomapplication;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

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

@Dao
public interface SchoolDao {


    //todo: replace with method executor service
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertSchool(School school);

    //todo: replace with method executor service
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertDirector(Director director);

  //todo: replace with method executor service
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertStudent(Student student);


  //todo: replace with method executor service
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertSubject(Subject subject);

  //todo: replace with method executor service
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertStudentSubjectCrossRef(StudentSubjectCrossRef studentSubjectCrossRef);

    //todo: replace with method executor service
    @Transaction
    @Query("SELECT * FROM school WHERE schoolName=:schoolName")
    List<SchoolAndDirector> getSchoolAndDirectorWithSchoolName(String schoolName);

    //todo: replace with method executor service
    @Transaction
    @Query("SELECT * FROM school WHERE schoolName=:schoolName")
    List<SchoolWithStudents> getSchoolWithStudents(String schoolName);

    //todo: replace with method executor service
    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName=:subjectName")
    List<SubjectWithStudent> getStudentOfSubject(String subjectName);

    //todo: replace with method executor service
    @Transaction
    @Query("SELECT * FROM student WHERE studentName=:studentName")
    List<StudentWithSubject> getSubjectOfStudent(String studentName);
}
