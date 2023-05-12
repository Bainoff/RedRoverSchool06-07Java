package homework;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first digit");
        double a = sc.nextInt();
        System.out.println("enter second digit");
        double b = sc.nextInt();
        System.out.println("enter operation");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }
    }
}
