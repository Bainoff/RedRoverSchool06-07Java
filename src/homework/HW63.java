package homework;

public class HW63 {

//    Необходимо написать 4 метода:
//    сложение 2х чисел
//    вычитание 2х чисел
//    умножение 2х чисел
//    деление 2х чисел

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int substraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return (double)a / b;
    }

    public static void main(String[] args) {
        System.out.println("addition result is " + addition(2,2));
        System.out.println("substraction result is " + substraction(5,4));
        System.out.println("multiplication result is " + multiplication(7,3));
        System.out.println("division result is " + division(21,6));

    }
}
