package com.example.dao;

import com.example.model.Student;

public interface Dao {
    void addStudent(Student student);
    void deleteStudent(int sid);
    void displayStudent();
}
