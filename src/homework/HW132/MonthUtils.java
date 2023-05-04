package homework.HW132;

//TODO Создать класс MonthUtils который бы хранил подготовленные месяцы
// или их массивы для использования (объекты класса Month).
// Статические поля с объектами месяцев должны быть финальными
// Создать статические методы возвращающие кварталы (массивы по 3 месяца
// соответственно), полугодия и год.
// Extra: сделать класс Month nested внутри класса MonthUtils. Сделать конструктор у класса Month private.


public class MonthUtils {

    public static final Month[] monthArray = new Month[]{
            new Month("january", 31, 21),
            new Month("february", 28, 20),
            new Month("march", 31, 21),
            new Month("april", 30, 20),
            new Month("may", 31, 21),
            new Month("june", 30, 20),
            new Month("july", 31, 21),
            new Month("august", 31, 21),
            new Month("september", 30, 20),
            new Month("october", 31, 21),
            new Month("november", 30, 20),
            new Month("december", 31, 21)
    };

    public static Month[] getQuarter(int quarterNumber) {
        switch (quarterNumber) {
            case 1: {
                Month[] q1 = new Month[3];
                q1[0] = monthArray[0];
                q1[1] = monthArray[1];
                q1[2] = monthArray[2];
                return q1;
            }
            case 2: {
                Month[] q2 = new Month[3];
                q2[0] = monthArray[3];
                q2[1] = monthArray[4];
                q2[2] = monthArray[5];
                return q2;
            }
            case 3: {
                Month[] q3 = new Month[3];
                q3[0] = monthArray[6];
                q3[1] = monthArray[7];
                q3[2] = monthArray[8];
                return q3;
            }
            case 4: {
                Month[] q4 = new Month[3];
                q4[0] = monthArray[9];
                q4[1] = monthArray[10];
                q4[2] = monthArray[11];
                return q4;
            }
            default:
                throw new IllegalArgumentException("enter valid value");
        }
    }

    public static Month[] getSemiYear(int semiYear) {
        switch (semiYear) {
            case 1: {
                Month[] s1 = new Month[6];
                for (int i = 0; i < s1.length; i++) {
                    s1[i] = monthArray[i];
                }
                return s1;
            }
            case 2: {
                Month[] s2 = new Month[6];
                for (int i = 6; i < s2.length - 1; i++) {
                    s2[i] = monthArray[i];
                }
                return s2;
            }
        }
        throw new IllegalArgumentException("enter valid value");
    }

    public static Month[] getYear() {
        return monthArray;
    }

    public static final class Month {
        private static String monthName;
        private static int numberOfDays;
        private static int numberOfWorkDays;

        public String getMonthName(){
            return monthName;
        }

        public int getNumberOfWorkDays() {
            return numberOfWorkDays;
        }

        private Month(String monthName, int numberOfDays, int numberOfWorkDays) {
            this.monthName = monthName;
            this.numberOfDays = numberOfDays;
            this.numberOfWorkDays = numberOfWorkDays;

        }
    }
}
