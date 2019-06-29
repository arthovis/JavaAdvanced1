package com.company;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Andrei","Baicu", 29);
        System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());
        person.setFirstName("");
        person.setLastName("");
        person.setAge(-35);
        System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());

        Person person1 = new Person(25);
        System.out.println(person1.getFirstName()+" "+person1.getLastName()+" "+person1.getAge());
    }
}
