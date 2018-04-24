package com.labtest.controller;
import com.labtest.model.Student;
import sun.plugin.javascript.navig.Array;


import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "studentController")
public class StudentController {
    Student student = new Student();
    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();
    List<Student> studentList = new ArrayList<Student>();

    public StudentController() {
    }

    public Student getStudent() {
        return student;
    }


    public List<Student> getStudentlist() {
        student1.setStudentId(19);
        student1.setStudentName("Apu");
        studentList.add(student1);
        student2.setStudentId(22);
        student2.setStudentName("Bari");
        studentList.add(student2);
        student3.setStudentId(24);
        student3.setStudentName("Minhaj");
        studentList.add(student3);
        return studentList;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public String isNextPage(){
        return "success";
    }

}
