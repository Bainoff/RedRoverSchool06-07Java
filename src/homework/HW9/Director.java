package homework.HW9;

public class Director extends Worker {

    private int numOfSubs;

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numOfSubs = numberOfSubordinates;
    }

//TODO    Необходимо реализовать задание из Task 8.2 со следующими условиями:
//    Все методы возвращающие ЗП должны называться getSalary

//TODO Задача №2.3
// Необходимо создать класс Director, метод getSalaryDirector
// должен возвращать результат по формуле
// - <базовая ставка> * (<количество подчиненных> / 100 * 9).
// Если количество подчиненных 0, то результат как у обычного рабочего.

    public int getNumberOfSubordinates() {return numOfSubs;}

    @Override
    public int getSalary () {
        if (getNumberOfSubordinates() > 0) return (int) (super.getSalary() + super.getSalary() * (getNumberOfSubordinates() / 100.0 * 9));
        else return super.getSalary();
    }
}
