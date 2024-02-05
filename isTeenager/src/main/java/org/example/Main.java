package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println(Person.isTeenager(17)); // Output: true
        System.out.println(Person.isTeenager(13)); // Output: true
        System.out.println(Person.isTeenager(19)); // Output: true
        System.out.println(Person.isTeenager(9)); // Output: false
        System.out.println(Person.isTeenager(25)); // Output: false
    }
}