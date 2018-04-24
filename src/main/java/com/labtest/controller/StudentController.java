package com.labtest.controller;
import com.labtest.model.Student;


import javax.faces.bean.ManagedBean;

@ManagedBean(name = "studentController")
public class StudentController {
    Student student = new Student();

    public StudentController() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public String isNextPage(){
        return "success";
    }

}
