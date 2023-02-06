import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        int ch, a, b, c;
        System.out.println("Enter the number");
        Scanner n1 = new Scanner(System.in);
        a = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        b= n2.nextInt();
        System.out.println("Enter the choice");
        Scanner n3 = new Scanner(System.in);
        ch = n3.nextInt();

        switch (ch){
            case 1:c=a+b;
            System.out.println("Addition:"+c);break;
            case 2:c=a-b;
                System.out.println("Substraction:"+c);break;
            case 3:c=a*b;
                System.out.println("Multiplication:"+c);break;
            case 4:c=a/b;
                System.out.println("Division:"+c);break;
            default:
                System.out.println("Invalid choice");






        }


    }
}
