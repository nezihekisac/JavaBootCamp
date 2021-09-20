package day01;

public class CharSequences {

    public static void main(String[] args) {

        String str1 = "Java"; // literal ==> String pool

        String str2 = new String("Java");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String schoolName = "Cybertek";

        schoolName.concat(" school"); //String is immutable , returns new String ==> "Cybertek School"
        System.out.println(schoolName);

        System.out.println("-------------------------------------------------");

        StringBuilder sb1 = new StringBuilder("Cybertek");

        sb1.append(" School"); // StringBuilder is mutable, methods can modify the original object
        System.out.println(sb1);

// come back at 11:30 am US EST


    }


}
