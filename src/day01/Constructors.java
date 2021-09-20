package day01;

import java.time.LocalDate;

class Person{

    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public static boolean isHuman = true;

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

    public static void main(String[] args) {

        Person person1 = new Person("Ahmet", 'M', LocalDate.of(1990, 5,1));

        System.out.println("person1 = " + person1);

        System.out.println(person1.dateOfBirth);
        System.out.println(Person.isHuman);


    }



}


// instance vs static