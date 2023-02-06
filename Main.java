

import java.text.NumberFormat;
import java.util.Scanner;




public class Main {
    public static void main(String[] args)  {


       Scanner principle = new Scanner(System.in);
        System.out.println("NUMBER:");
       int princi =principle.nextInt();
       if(princi%5==0){

           if(princi%3==0){
               System.out.println("FizzBuzz");
           }
           else{
               System.out.println("Fizz");
           }

       } else if (princi%3==0) {
           System.out.println("buzz");

       }
       else{
           System.out.println(princi);
       }


    }
}