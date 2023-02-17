package com.kodilla.abstracts.homework;

public class Person {

    private String firstNAme;
    private int age;
    private String job;

    public Person(String firstNAme, int age, String job)
    {
        this.firstNAme = firstNAme;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args)
    {
        Person person = new Person("Anna", 30, "Hairdresser");
        Hairdresser hairdresser = new Hairdresser();
        System.out.println("Name: " + person.getFirstNAme() + "  Wiek: " + person.getAge() + "   Job: " + person.getJob());
        System.out.println("Average salary: " + hairdresser.getSalary() + ",-" + "  Responsibilities: " + hairdresser.getResponsibilities());
        System.out.println();

        Person person1 = new Person("Wojtek", 45, "Dentist");
        Dentist dentist = new Dentist();
        System.out.println("Name: " + person1.getFirstNAme() + "  Wiek: " + person1.getAge() + "   Job: " + person1.getJob());
        System.out.println("Average salary: " + dentist.getSalary() + ",-" + "  Responsibilities: " + dentist.getResponsibilities());
        System.out.println();

        Person person2 = new Person("Lena", 28, "Teacher");
        Teacher teacher = new Teacher();
        System.out.println("Name: " + person2.getFirstNAme() + "  Wiek: " + person2.getAge() + "   Job: " + person2.getJob());
        System.out.println("Average salary: " + teacher.getSalary() + ",-" + "  Responsibilities: " + teacher.getResponsibilities());

    }

    public String getFirstNAme()
    {
        return firstNAme;
    }

    public int getAge()
    {
        return age;
    }
    public String getJob()
    {
        return job;
    }
}
