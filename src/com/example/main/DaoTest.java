package com.example.main;

import com.example.dao.Dao;
import com.example.dao.DaoImpl;
import com.example.model.Student;

public class DaoTest {
    public static void main(String[] args) {
        Dao dao= new DaoImpl();
        Student s1= new Student(123,"sudheer","MBA");
        Student s2= new Student(456,"suresh","MCA");
        Student s3= new Student(768,"chotu","Btech");
        Student s4= new Student(957,"modi","BE");
        dao.addStudent(s1);
        dao.addStudent(s2);
        dao.addStudent(s3);
        dao.addStudent(s4);
        System.out.println(" 2 students objects added");
        dao.displayStudent();
        System.out.println(" after removing students object");
        dao.deleteStudent(957);
       // dao.displayStudent();


    }
}
