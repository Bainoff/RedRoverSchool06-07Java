package homework.HW9;

public class Employee {
//TODO    Необходимо реализовать задание из Task 8.2 со следующими условиями:
//    Все методы возвращающие ЗП должны называться getSalary


//TODO Задача №1
// Необходимо создать класс Employee со следующими методами:
// getName - получить имя
// setName
// getBaseSalary - базовая ставка
// setBaseSalary

    private String name;
    private int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getSalary() {return baseSalary;}

    public int getBaseSalary() {return baseSalary;}

    public void setSalary(int baseSalary) {this.baseSalary = baseSalary;}
}
