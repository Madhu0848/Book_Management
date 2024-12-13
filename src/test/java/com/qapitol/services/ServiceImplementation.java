package com.qapitol.services;

import com.qapitol.model.Address;
import com.qapitol.model.Books;
import com.qapitol.model.Student;
import com.qapitol.utils.JsonUtility;
import com.qapitol.utils.JsonUtilityBOOK;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceImplementation implements Service {

    public List<Student> student_list=new ArrayList();
    public List<Books> book_list =new ArrayList();

    @Override
    public void addStudent() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student age: ");
        int age = sc.nextInt();
        System.out.println("Enter student id: ");
        int id = sc.nextInt();

        System.out.println("Enter student address streetName: ");
        String streetName = sc.next();

        System.out.println("Enter student address completeAddress: ");
        String completeAddress = sc.next();

        System.out.println("Enter student pinCode: ");
        int pinCode = sc.nextInt();

        Student std = new Student(id, name, age);

        Address address = new Address(streetName, completeAddress, pinCode);
        std.setAddress(address);
        student_list.add(std);

      List<Student> studentDetails=  JsonUtility.readDataFromJsonFile();
      for(Student student:studentDetails){
         // System.out.println(student.toString());
          student_list.add(student);
      }
        JsonUtility.writeDataFromJsonFile(student_list);


    }

    @Override
    public void deleteStudent(int id) throws IOException {
        List<Student> studentDetails=  JsonUtility.readDataFromJsonFile();
        for(Student student:studentDetails) {
            if (student.getId() == id) {

                studentDetails.remove(student);
                JsonUtility.writeDataFromJsonFile(studentDetails);

            }
        }
    }

    @Override
    public void updateStudent(int id ,String name) throws IOException {
        List<Student> studentDetails=  JsonUtility.readDataFromJsonFile();
        for(Student student:studentDetails) {
            if (student.getId() == id) {

                student.setName(name);
                JsonUtility.writeDataFromJsonFile(studentDetails);

            }
        }

    }

    @Override
    public Student getStudentbyId(int id) throws IOException {
        List<Student> studentDetails=  JsonUtility.readDataFromJsonFile();
        Student s= new Student(); //
        for(Student student:studentDetails) {
            if (student.getId() == id) {
                System.out.println(student.toString());
                return student;
            }
        }
        return s;
    }

    @Override
    public void getStudentbyName(String name) throws IOException {

        List<Student> studentName=JsonUtility.readDataFromJsonFile();
        for(Student student:studentName) {
            if (student.getName().equals(name)) {
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void getAllStudents() throws IOException {
       List<Student> allStudent =JsonUtility.readDataFromJsonFile();
       for(Student student:allStudent) {
           System.out.println(student);
       }

    }

    @Override
    public void AddBook() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book subject: ");
        String subject = sc.nextLine();
        System.out.println("Enter book ID: ");
        int id = sc.nextInt();
        Books book = new Books(id, subject);
        book_list.add(book);

        //Books.bookCount = Books.bookCount + 1;


      List<Books> bookDetails= JsonUtilityBOOK.readDataFromJsonFile();
      for(Books books:bookDetails) {
         book_list.add(books);
      }
        JsonUtilityBOOK.writeDataFromJsonFile(book_list);

    }

    @Override
    public void DeleteBook(int id) throws IOException {

        List<Books> bookDetails = JsonUtilityBOOK.readDataFromJsonFile();
        for (Books books : bookDetails) {
           if(books.getBookid() == id) {
               bookDetails.remove(books);
                //JsonUtilityBOOK.readDataFromJsonFile();
               JsonUtilityBOOK.writeDataFromJsonFile(bookDetails);
            }

                 }
    }
    @Override
    public void UpdateBook(int id ,String name) throws IOException {
        List<Books> bookDetails= JsonUtilityBOOK.readDataFromJsonFile();
        for (Books books : bookDetails) {
            if (books.getBookid() == id) {
                books.setSubject(name);
               // JsonUtilityBOOK.readDataFromJsonFile();
                JsonUtilityBOOK.writeDataFromJsonFile(bookDetails);
            }
        }

    }

    @Override
    public void getAllBook() throws IOException {
      List<Books> allBook= JsonUtilityBOOK.readDataFromJsonFile();
      for(Books books:allBook) {

          System.out.println(books);
      }

    }

    @Override
    public Books getBookbyId(int id) throws IOException {
        List<Books> bl =JsonUtilityBOOK.readDataFromJsonFile();
      //  Books bs=new Books();

        for (Books books : bl) {
            if(books.getBookid() == id) {
                System.out.println(books);

                 return books;
            }
            else
                System.out.println("books not found for id "+id);
        }

        return null;

    }
}
