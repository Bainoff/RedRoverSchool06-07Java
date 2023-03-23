package homework;

public class HW61 {
    public static void main(String[] args) {
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести сумму всех значений массива.
        int sum = 0;
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);

//   Дан массив:
//   int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//   необходимо вывести максимальное значение массива.
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int i : array2) {
            if (i > max) max = i;
        }
        System.out.println(max);


//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести минимальное значение массива.
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;
        for (int i : array3) {
            if (i < min) min = i;
        }
        System.out.println(min);

//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int avg;
        int sum2 = 0;
        for (int i : array4) {
            sum2 = sum2 + i;
        }
        avg = sum2 / array4.length;
        System.out.println(avg);

//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum3 = 0;
        for (int[] ints : array5) {
            for (int anInt : ints) {
                sum3 += anInt;
            }
        }
        System.out.println(sum3);

//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max2 = Integer.MIN_VALUE;
        for (int[] ints : array6) {
            for (int anInt : ints) {
                if (max2 < anInt) max2 = anInt;
            }
        }
        System.out.println(max2);

//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int counter = 0;
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
               counter++;
            }
        }
        System.out.println(counter);
    }
}

