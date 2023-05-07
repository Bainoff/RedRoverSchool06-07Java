package homework.HW131;

//TODO Необходимо создать класс Manager в который нужно добавить следующие методы:
//         getNumberOfSubordinates - получить количество подчиненных
//         setNumberOfSubordinates
//         в классе, метод getSalary будет возвращать значение по формуле -
//         <базовая ставка> * (<количество подчиненных> / 100 * 3).
//         Если количество подчиненных 0, то результат как у обычного рабочего.


public final class Manager extends Employee{

    private final int SALARY_COEFF = 3;

    private int numberOfSubordinates;

    public Manager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

// TODO    в классе, метод getSalary будет возвращать значение по формуле
//        - <базовая ставка> * (<количество подчиненных> / 100 * 3).
//    Если количество подчиненных 0, то результат как у обычного рабочего.

    @Override
    public int getSalary(){
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * SALARY_COEFF);
        } else {
            return getBaseSalary();
        }
    }
}
