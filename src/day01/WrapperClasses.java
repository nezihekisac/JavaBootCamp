package day01;

public class WrapperClasses {

    public static void main(String[] args) {

        byte b = 100;
        int c = b;


     // Integer x = b; // wrapper class ONLY accepts its own primitive

        Integer y = c;
     //   Double z = 10;


        System.out.println("---------------------------------------------");

        String str = "1000";

        int r1 =  Integer.parseInt(str);
        Integer r2 = Integer.valueOf(str);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);



    }

}
