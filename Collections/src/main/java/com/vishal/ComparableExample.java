package com.vishal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return student.getId() - this.getId();
    }
}

public class ComparableExample{
    public static void main(String[] args) {
        Student student1 = new Student(1,"Java");
        Student student2 = new Student(2,"C++");
        Student student3 = new Student(3,"Python");

        List<Student> students = new ArrayList<Student>();
        students.add(student3);
        students.add(student1);
        students.add(student2);
        Collections.sort(students);
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
