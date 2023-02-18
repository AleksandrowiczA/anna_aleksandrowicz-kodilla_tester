package com.kodilla.abstracts.homework;

public class Person {

    private String firstNAme;
    private int age;
    private Job job;

    public Person(String firstNAme, int age, Job job)
    {
        this.firstNAme = firstNAme;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args)
    {
        Person person1 = new Person("Anna", 30, new Hairdresser());
        Person person2 = new Person("Wojtek", 45, new Dentist());
        Person person3 = new Person("Lena", 28, new Teacher());
        System.out.println(person1.getFirstNAme() + " " + person1.getAge());
        System.out.println("Responsibilities: " + person1.getJob().getResponsibilities());
        System.out.println(person2.getFirstNAme() + " " + person2.getAge());
        System.out.println("Responsibilities: " + person2.getJob().getResponsibilities());
        System.out.println(person3.getFirstNAme() + " " + person3.getAge());
        System.out.println("Responsibilities: " + person3.getJob().getResponsibilities());
    }
    public String getFirstNAme()
    {
        return firstNAme;
    }
    public int getAge()
    {
        return age;
    }
    public Job getJob()
    {
        return job;
    }
}
