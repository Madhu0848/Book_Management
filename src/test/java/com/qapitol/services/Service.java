package com.qapitol.services;

import com.qapitol.model.Books;
import com.qapitol.model.Student;

import java.io.IOException;

public interface Service {

    public void addStudent() throws IOException;
    public void deleteStudent(int id) throws IOException;
    public void updateStudent(int id,String name) throws IOException;
    public Student getStudentbyId(int id) throws IOException;
    public void getStudentbyName(String name) throws IOException;
    public void getAllStudents() throws IOException;


    public void AddBook() throws IOException;
    public void DeleteBook(int id) throws IOException;
    public void UpdateBook(int id,String name) throws IOException;
    public void getAllBook() throws IOException;
    public Books getBookbyId(int id  ) throws IOException;



}
