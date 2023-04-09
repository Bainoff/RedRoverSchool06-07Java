package homework.HW9;

public class Worker extends Employee {
    public Worker(String name, int baseSalary) {
        super(name, baseSalary);
    }

//TODO    Необходимо реализовать задание из Task 8.2 со следующими условиями:
//    Все методы возвращающие ЗП должны называться getSalary

// TODO    Задача №2.1
//  Необходимо создать класс Worker где метод getSalaryWorker  будет возвращать зарплату, базовую ставку.

    public int getSalary(){return super.getSalary();}
}
