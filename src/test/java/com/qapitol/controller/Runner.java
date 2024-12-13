package com.qapitol.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qapitol.model.Student;
import com.qapitol.services.Service;
import com.qapitol.services.ServiceImplementation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String path = System.getProperty("user.dir") + "//src//test//java//com//qapitol//utils//Student.json";
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("Enter the your name of service option ");
        System.out.println("1.Student\n 2.Book");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Select your service option");
                System.out.println("1.AddStudent\n 2.DeleteStudent\n 3.EditStudent\n 4.getStudentId\n 5.getStudentName\n 6.getAllstudent\n 7.Exit");
                int option1 = sc.nextInt();
                ServiceImplementation s = new ServiceImplementation();
                switch (option1) {
                    case 1:
                        System.out.println("perform AddStudent operation ");

                        System.out.println("Before Adding student" + s.student_list.size());
                        s.addStudent();
                        System.out.println("Student added" + s.student_list.size());
                        break;
                    case 2:
                        System.out.println("perform DeleteStudent operation ");
                        System.out.println("enter Student ID");
                        int id = sc.nextInt();
                        s.deleteStudent(id);

                        break;
                    case 3:
                        System.out.println("perform EditStudent operation ");
                        System.out.println("Enter Student name");
                        Scanner sc1 = new Scanner(System.in);
                        String studentName = sc1.nextLine();
                        System.out.println("enter id of student ");
                        int studentId = sc1.nextInt();
                        s.updateStudent(studentId, studentName);
                        break;
                    case 4:
                        System.out.println("get Student By id");
                        System.out.println("Enter your student id ");
                        s.getStudentbyId(sc.nextInt());
                        break;
                    case 5:
                        System.out.println("get Student By Name");
                        System.out.println("Enter your student name ");
                        s.getStudentbyName(sc.next());
                        break;
                    case 6:
                        System.out.println("get all student details");
                        s.getAllStudents();
                        break;
                    case 7:
                        System.out.println("Exit");
                         return;
                    default:

                }
                break;
            case 2:
                ServiceImplementation s1 = new ServiceImplementation();
                System.out.println("Select your service option");
                System.out.println("1.AddBook\n 2.DeleteBook\n 3.UpdateBook\n 4.getBookById\n 5.getAllTheBook\n 5.Exit");
                int option2 = sc.nextInt();
                switch (option2) {

                    case 1:
                        System.out.println("perform AddBook operation ");
                        System.out.println("Before Adding Book"+s1.book_list.size());
                        s1.AddBook();
                        System.out.println("Book added : "+s1.book_list.size());
                        break;
                    case 2:
                        System.out.println("perform DeleteStudent operation ");
                        System.out.println("enter Book ID");
                        int id = sc.nextInt();
                        s1.DeleteBook(id);
                        System.out.println("book deleted : "+s1.book_list.size());
                        break;
                    case 3:
                        System.out.println("perform EditBook operation ");
                        System.out.println("enter the book ID");
                        int bookId = sc.nextInt();
                        System.out.println("enter the book name");
                        String bookName = sc.next();
                        s1.UpdateBook(bookId,bookName);

                        break;
                    case 4:
                        System.out.println("get book By id");
                        System.out.println("Enter your book id ");
                        s1.getBookbyId(sc.nextInt());
                        break;
                    case 5:
                        System.out.println("get AllTheBook");
                        s1.getAllBook();
                        return;
                    default:
                }
                break;
            case 6:
                System.out.println("enter valid operartion");
                break;
        }

    }
}
