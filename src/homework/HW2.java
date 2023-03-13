package homework;

public class HW2 {
    public static void main(String[] args) {

//        Задача №1
//        Необходимо создать целочисленные переменные a и b,
//        присвоить произвольные значения переменным на ваш выбор
//        и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление.
        System.out.println("Task 1:");
        int a = 5;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a * 1.0 / b);

        //TODO extra

//        Экстра задача
//        Также вывести остаток от деления и сделать проверку на четность этих переменных.
        System.out.println("Task 2:");
        System.out.println(a % b);
        System.out.println(a%2==0);
        System.out.println(b%2==0);

//        Экстра задача
//        Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
        System.out.println("Task 3:");
        System.out.println('\u263a');
    }
}
