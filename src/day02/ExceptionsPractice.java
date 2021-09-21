package day02;

public class ExceptionsPractice {


    public static void main(String[] args) throws InterruptedException {

        String str = null;

     //  System.out.println(str.toLowerCase());  // unchecked exception

     //   FileInputStream file = new FileInputStream(""); // checked exception

        try {
            System.out.println(9 / 0);
        }catch (RuntimeException e){
         //   e.printStackTrace(); // after executing all the codes, gives the full details of the exception that was occured
        }


        System.out.println("Test1 completed");

        /*
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         */

        Thread.sleep(3000);

        System.out.println("Test2 completed");






    }


    public static void method1() throws InterruptedException {  // caller has to handle the exception

        Thread.sleep(3000);

        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("How are you");

    }

    public static void method2(){

        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void method3(){
     //   method1();
        method2();

    //    Thread.sleep(3000);

    }



}
