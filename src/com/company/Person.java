package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(int age){
        this("Ion","Vasile",age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        if (!"".equals(firstName)) {
            this.firstName = firstName;
        } else {
            System.out.println("Invalid name");
        }
    }

    public void setLastName(String lastName) {
        if (!"".equals(lastName)) {
            this.lastName = lastName;
        } else {
            System.out.println("Invalid name");
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");

        }
    }
}