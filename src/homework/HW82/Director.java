package homework.HW82;

public class Director extends Manager {

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }
//TODO Задача №2.3
// Необходимо создать класс Director, метод getSalaryDirector
// должен возвращать результат по формуле
// - <базовая ставка> * (<количество подчиненных> / 100 * 9).
// Если количество подчиненных 0, то результат как у обычного рабочего.

    public int getSalaryDirector () {
        if (getNumberOfSubordinates() > 0) return getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
        else return getBaseSalary();
    }
}
