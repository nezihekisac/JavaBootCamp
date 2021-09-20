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

        StringBuilder stringBuilder = new StringBuilder("Cybertek");
        stringBuilder.append(" School"); // StringBuilder is mutable, methods can modify the original object
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Cybertek");
        stringBuffer.append(" School");
        System.out.println(stringBuffer);


        stringBuilder.reverse();
        stringBuffer.reverse();

        System.out.println("stringBuilder = " + stringBuilder);
        System.out.println("stringBuffer = " + stringBuffer);



   // come back at 11:30 am US EST


    }


}
