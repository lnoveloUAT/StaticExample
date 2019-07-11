package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(Student.get_lastStudentID());

        Student luisNovelo = new Student("Novelo", "Luis");

        System.out.println(Student.get_lastStudentID());

        Student fernandoCetina = new Student("Cetina", "Fernando");

        System.out.println(Student.get_lastStudentID());
    }
}
