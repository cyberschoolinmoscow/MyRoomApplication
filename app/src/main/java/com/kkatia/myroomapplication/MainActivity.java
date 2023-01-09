package com.kkatia.myroomapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import com.kkatia.myroomapplication.entities.Director;
import com.kkatia.myroomapplication.entities.School;
import com.kkatia.myroomapplication.entities.Student;
import com.kkatia.myroomapplication.entities.Subject;
import com.kkatia.myroomapplication.entities.relations.StudentSubjectCrossRef;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


SchoolDatabase schoolDatabase= Room.databaseBuilder(this,SchoolDatabase.class,"school_db").allowMainThreadQueries().build();
        SchoolDao schoolDao =schoolDatabase.schoolDao();

        List<Director> directors = new ArrayList<>();
        List<School> schools = new ArrayList<>();
        List<Subject> subjects = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<StudentSubjectCrossRef> studentSubjectRelations = new ArrayList<>();

        directors.add(new Director("Mike Litoris", "Jake Wharton School"));
        directors.add(new Director("Jack Goff", "Kotlin School"));
        directors.add(new Director("Chris P. Chicken", "JetBrains School"));

        schools.add(new School("Jake Wharton School"));
        schools.add(new School("Kotlin School"));
        schools.add(new School("JetBrains School"));

        subjects.add(new Subject("Dating for programmers"));
        subjects.add(new Subject("Avoiding depression"));
        subjects.add(new Subject("Bug Fix Meditation"));
        subjects.add(new Subject("Logcat for Newbies"));
        subjects.add(new Subject("How to use Google"));

        students.add(new Student("Beff Jezos", 2, "Kotlin School"));
        students.add(new Student("Mark Suckerberg", 5, "Jake Wharton School"));
        students.add(new Student("Gill Bates", 8, "Kotlin School"));
        students.add(new Student("Donny Jepp", 1, "Kotlin School"));
        students.add(new Student("Hom Tanks", 2, "JetBrains School"));

        studentSubjectRelations.add(new StudentSubjectCrossRef("Beff Jezos", "Dating for programmers"));
        studentSubjectRelations.add(new StudentSubjectCrossRef("Beff Jezos", "Avoiding depression"));
        studentSubjectRelations.add(new StudentSubjectCrossRef("Beff Jezos", "Bug Fix Meditation"));
        studentSubjectRelations.add(new StudentSubjectCrossRef("Beff Jezos", "Logcat for Newbies"));
        studentSubjectRelations.add(new StudentSubjectCrossRef("Mark Suckerberg", "Dating for programmers"));
        studentSubjectRelations.add(new StudentSubjectCrossRef("Gill Bates", "How to use Google"));
        studentSubjectRelations.add(new StudentSubjectCrossRef("Donny Jepp", "Logcat for Newbies"));
        studentSubjectRelations.add(new StudentSubjectCrossRef("Hom Tanks", "Avoiding depression"));
        studentSubjectRelations.add(new StudentSubjectCrossRef("Hom Tanks", "Dating for programmers"));

        for (Director director : directors) {

            schoolDao.insertDirector(director);
        }
        for (School school : schools) {
            schoolDao.insertSchool(school);
        }

        for (Subject subject : subjects) {
            schoolDao.insertSubject(subject);
        }
        for (Student student : students) {
            schoolDao.insertStudent(student);
        }
        for (StudentSubjectCrossRef studentSubjectCrossRef : studentSubjectRelations) {
            schoolDao.insertStudentSubjectCrossRef(studentSubjectCrossRef);
        }

//        try {
//            withContext();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

//    final ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//    public final void withContext() throws ExecutionException, InterruptedException {
//        final Future<?> futureMethod = this.executorService.submit(this::withContextMethod);
//        final Future<?> futureBounding = this.executorService.submit(this::withContextBoundingBoxes);
//        futureMethod.get();
//        futureBounding.get();
//
//    }
//
//    private final void withContextMethod() {
//        //perform face recognition
//        Log.i("QQQ", "T");
//    }
//
//    private final void withContextBoundingBoxes() {
////            boundingBoxOverlay.faceBoundingBoxes = predictions;
////            boundingBoxOverlay.invalidate();
////            isProcessing.set(false);
//        Log.i("bounding", "Text");
//
//    }
}