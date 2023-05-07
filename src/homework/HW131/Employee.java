package homework.HW131;

//TODO Необходимо создать класс Employee со следующими методами:
//         getBaseSalary - получить базовую ставку
//         setBaseSalary
//         getName - получить имя
//         setName
//         getSalary - получить зарплату (должен быть абстрактный)


public abstract class Employee {

    private int baseSalary;
    private String name;

    public Employee(int baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSalary();
}
