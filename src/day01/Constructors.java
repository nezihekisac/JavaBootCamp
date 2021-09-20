package day01;

import java.time.LocalDate;

class Person{

    public String name;
    public char gender;
    public LocalDate dateOfBirth;

    public Person(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}


public class Constructors {




}
