package com.dylan;

import jdk.nashorn.internal.scripts.JO;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> students = new ArrayList<>();

        Student John = new Student("John", "Doe", 1, 1);
        Student TwilightAngst = new Student("TwilightAngst", "Blurr", 2, 1);
        Student Nastya = new Student("Nastya", "Arkhip", 3,1);
        Student Savitri = new Student("Savitri", "Ananta", 4,1);
        Student Kia = new Student("Kia","Habib",5,1);
        Student Bob = new Student("Bob","Mcclane",6,1);
        Student Cletus = new Student("Cletus","Paulhus",7,1);
        Student Marielle = new Student("Marielle","Warren",8,1);
        Student Lesha = new Student("Lesha","Blair",9,1);
        Student Rebeca = new Student("Rebeca","Plate",10,1);
        Student Aundrea = new Student("Aundrea","Gabel",11,1);
        Student Cathey = new Student("Cathey","Simoneaux",12,1);
        Student Ja = new Student("Ja","Seavey",13,1);
        Student Letitia = new Student("Letitia","Sayers",14,1);
        Student Dylan = new Student("Dylan","Myers",15,1);

        students.add(John);
        students.add(TwilightAngst);
        students.add(Nastya);
        students.add(Savitri);
        students.add(Kia);
        students.add(Bob);
        students.add(Cletus);
        students.add(Marielle);
        students.add(Lesha);
        students.add(Rebeca);
        students.add(Aundrea);
        students.add(Cathey);
        students.add(Ja);
        students.add(Letitia);
        students.add(Dylan);

        ArrayList<Teachers> teachers = new ArrayList<>();

        Teachers Alma = new Teachers("Alma","Spinks", 1,1);
        Teachers Cynthia = new Teachers("Cynthia","Enfinger",2,1);
        Teachers Richard = new Teachers("Richard", "Casey",3,1 );

        teachers.add(Alma);
        teachers.add(Cynthia);
        teachers.add(Richard);

        Set<Student> students1 = new HashSet<>();
            students1.add(John);
            students1.add(TwilightAngst);
            students1.add(Nastya);
            students1.add(Savitri);
            students1.add(Kia);

        Set<Student> students2 = new HashSet<>();
            students2.add(Bob);
            students2.add(Cletus);
            students2.add(Marielle);
            students2.add(Lesha);
            students2.add(Rebeca);

        Set<Student> students3 = new HashSet<>();
            students3.add(Aundrea);
            students3.add(Cathey);
            students3.add(Ja);
            students3.add(Letitia);
            students3.add(Dylan);

        Map<Teachers, Set>  classes = new HashMap<>();
            classes.put(Alma, students1);
            classes.put(Cynthia, students2);
            classes.put(Richard, students3);

        for(Teachers teach : classes.keySet()){
            System.out.println(teach);
        }
        for(Set minions : classes.values()){
            System.out.println(minions);
        }

    }
}
