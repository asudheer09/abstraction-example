package com.example.dao;

import com.example.model.Student;

import java.util.ArrayList;

public class DaoImpl implements  Dao{
   // public static ArrayList list= new ArrayList();
    public static ArrayList<Student> list= new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

//    int[] arr={1,2,3,4};
//    for(int i:arr){
//        System.out.println(i);
//    }

    @Override
    public void deleteStudent(int sid) {
        ArrayList<Student> copyData= new ArrayList<Student>();
        copyData.addAll(list);
        for (Student s:list ) {
            if(s.getSid()==sid){
                copyData.remove(s);
            }
        }
        for(Student s:copyData){
            System.out.println(s);
        }
    }


    @Override
    public void displayStudent() {
        for (Student s:list) {
            System.out.println(s);
        }
    }
}
