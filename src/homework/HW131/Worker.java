package homework.HW131;

//TODO Необходимо создать класс Worker
// где метод getSalary будет возвращать базовую ставку и должен быть финальным.

public class Worker extends Employee{
    public final int getSalary(){
        return getBaseSalary();
    }
}
