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

//        Задача №2
//        Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
//        половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
//        Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
//        Вывести на экран кому сколько пиастров полагается.
//        Дополнительное задание со звездочкой
//        Попробовать придумать как программа может проверить правильность дележа.
        int booty = 100;
        double shipOwnersPart = booty / 2;
        double captainsPart = shipOwnersPart / 2;
        int numberOfSailors = 5;
        double sailorsPart = booty / 2 / 2 / numberOfSailors;
        boolean check = (shipOwnersPart + captainsPart + sailorsPart * numberOfSailors) == booty;

        System.out.println( "ship owner's part equals " + booty/2 +
                            "\ncaptain's part equals " + booty/2/2 +
                            "\neach sailor's part equals " + booty/2/2/numberOfSailors +
                            "\nbooty divided correctly? " + check);

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
