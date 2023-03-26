package homework.HW71;

public class Employee extends Person {
//TODO    Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
//    Класс должен иметь метод isSameName(Employee employee) который возвращает true,
//    если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
    int salary;
    public boolean isSameName(Employee employee){
        if (super.name == name) return true;
        else return false;
    }
}