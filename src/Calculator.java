import java.lang.*;
import java.util.*;
public class Calculator {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the valuse of a");
            int a=sc.nextInt();
            System.out.println("Enter the valuse of b");
            int b=sc.nextInt();
            System.out.println("Enter the operator");
            char op=sc.next().charAt(0);
            switch(op){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a%b);
                    break;
                default:
                    System.out.println("invalid character");
            }

            }
        }


