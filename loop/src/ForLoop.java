import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args){

        int a , i , f=1;
        System.out.println("enter the number");
        Scanner number = new Scanner(System.in);
        a=number.nextInt();
        for(i=a;i>=1;i--){
            f=f*i;
        }
        System.out.println("Factorial:"+f);
    }
}
