package homework.HW132;

//TODO Для следующих задач надо выполнить условия:
// Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
// Классы Employee и Manager должны быть финальными

//TODO Задача №3
// Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
// К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.


public final class Manager extends BaseEmployee {
    private String name;
    private int age;
    private char gender;
    private int dailySalary;
    private int numberOfSubordinates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(int dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary(MonthUtils.Month[] monthArray, String monthName) {
        int monthNumber = 0;
        for (int i = 0; i < monthArray.length; i++) {
            if (monthName.equals(monthArray[i].getMonthName())) {
                monthNumber = i;
                break;
            }
        }
        return (int) (monthArray[monthNumber].getNumberOfWorkDays() * getDailySalary() +
                (monthArray[monthNumber].getNumberOfWorkDays() * getDailySalary() * getNumberOfSubordinates() * 0.01));
    }
}
