package homework.HW81;

public class Manager extends Employee {
    private int subordNumber;

    public Manager(String name, byte age, String gender, int dailySalary) {
        super(name, age, gender, dailySalary);
    }

    public int getSubordNumber() {
        return subordNumber;
    }

    public void setSubordNumber(int subordNumber) {
        this.subordNumber = subordNumber;
    }

    @Override
    public int getSalary(int days) {
        return (int) (getDailySalary() * days * (1 + subordNumber / 100.0));
    }
}