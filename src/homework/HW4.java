package homework;

public class HW4 {
    public static void main(String[] args) {

//        Задача №1
//        Необходимо вывести числа от 0 до 15.
        System.out.println("Task 1:");
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }

//        Задача №2
//        Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
        System.out.println("Task 2:");
        for (int i = 5; i < 10000; i = i * 5) {
            System.out.println(i);
        }
//        Задача №3
//        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//                Реализовать 2 варианта:
//        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//        без использования конструкции if (шаг цикла на ваше усмотрение).
        System.out.println("Task 3:");
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 40; i <= 60; i = i + 4) {
            System.out.println(i);
        }
    }
}
