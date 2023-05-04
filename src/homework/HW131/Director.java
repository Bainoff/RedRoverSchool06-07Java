package homework.HW131;

//TODO Необходимо создать класс Director с теми же методами, что и Manager,
//        но метод getSalary должен возвращать результат по формуле -
//        <базовая ставка> * (<количество подчиненных> / 100 * 9).
//        Если количество подчиненных 0, то результат как у обычного рабочего.

public final class Director extends Employee{

    private final int SALARY_COEFF = 9;

    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
    @Override
    public int getSalary(){
        if (getNumberOfSubordinates() > 0) {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * SALARY_COEFF);
        } else {
            return getBaseSalary();
        }
    }
}
