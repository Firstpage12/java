//Throwable
//    -Exception
//        -Checked
//            -IOException
//            -SQLException
//        -Unchecked
//            -RuntimeException
//                -ArithmeticException
//                -OutOfBoundException


import java.io.IOException;
import java.util.Scanner;

public class Exception{

    public static void main(String[] args) throws IOException{

        int i=8,j=0,k=0;
        Scanner l=new Scanner(System.in);


        try{

            if(i<10){
                throw new MyException("ERrrrrrrror");
            }
//            System.out.println("Enter a number");
//            int p= l.nextInt();


//            k=i/p;
            k=i/j;//unchecked exception

        }
//        catch (IOException e){
//            System.out.println("some io error");
//        }
        catch (ArithmeticException e){
            System.out.println("cannot devide by zero : "+e);
        }
        catch(java.lang.Exception e){
            System.out.println("Unknown Exception  : "+e);
        }
        finally {
            System.out.println("finally done :"+k);
        }


    }
}

class MyException extends java.lang.Exception{
    public MyException(String msg){

        super(msg);

    }
}

