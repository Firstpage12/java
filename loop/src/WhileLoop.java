import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args){
        int i,f=0,r;
        System.out.println("enter the number");
        Scanner number = new Scanner(System.in);
        int a =number.nextInt();

        while(a>0){
            r=a%10;
            f=f+r;
            a=a/10;

        }
        System.out.println("sum of digits"+f);

    }
}
