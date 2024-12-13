package com.qapitol.model;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private Address address;
    private Books book;

    public Student() {
    }
    public Student(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Books getBook() {
        return book;
    }
    public void setBook(Books book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", book=" + book +
                '}';
    }
}
