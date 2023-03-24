package homework;

public class HW62 {


    public static void main(String[] args) {

//    Дана строка:
//    String s = “Перестановочный алгоритм быстрого действия”;
//    необходимо вывести все буквы “о” из этой строки.
//    Для указанной строки ответ будет “ооооо” (или в столбик)
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') System.out.print('o');
        }
        System.out.println();
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.
        String s2 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е') count++;
        }
        System.out.println(count);
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.
        String s3 = "Посмотрите как Рите нравится ритм";
        String s4 = s3.toLowerCase();
        int index = s4.indexOf("рит");
        while (index != -1) {
            System.out.print(index + " ");
            index = s4.indexOf("рит", index + 1);
        }

//        Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        System.out.println();
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count2 = 0;
        for (String[] strings : array) {
            for (String string : strings) {
                if (string.indexOf('е') == -1) {
                    count2++;
                }
            }
        }
        System.out.println(count2);
    }
}
