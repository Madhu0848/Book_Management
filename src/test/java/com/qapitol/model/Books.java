package com.qapitol.model;

import java.util.List;

public class Books {

    private int bookid;
    private String subject;
   // public static int bookCount=0;
    private List<Object> Student;
   public Books(){

    }
    public Books(int bookid, String subject) {
        this.bookid = bookid;
        this.subject = subject;

    }
    public int getBookid() {
        return bookid;
    }
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public List<Object> getStudent() {
        return Student;
    }
    public void setStudent(List<Object> student) {
        Student = student;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookid=" + bookid +
                ", subject='" + subject + '\'' +
                ", Student=" + Student +
                '}';
    }
}
