package homework.HW82;

import homework.HW9.Director;
import homework.HW9.Worker;

public class Company {
// TODO   Задача №3

// Необходимо создать класс со следующими методами:

//    public Employee[] workers;
//    public Manager[] managers;

//    public Company(Employee[] workers) {
//        for (int i = 0; i < workers.length; i++) {
//            workers[i] = new Employee(workers[i].getName(), workers[i].getBaseSalary());
//        }
//    }
//
//    public Company(Manager[] managers) {
//        for (int i = 0; i < managers.length; i++) {
//            managers[i] = new Manager(managers[i].getName(), managers[i].getBaseSalary(), managers[i].getNumberOfSubordinates());
//        }
//    }
//TODO поиск сотрудника в массиве по его имени

    public String getEmployeeName(String name, Employee[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].getName())) return "worker number " + (i + 1);
        }
        return "There is no worker with this name";
    }

//TODO поиск сотрудника в массиве по вхождению указанной строки в его имени

    public String getEmployeeNamePart(String namePart, Employee[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(namePart)) return "worker number " + (i + 1);
        }
        return "There is no worker with this name";
    }

//TODO подсчет зарплатного бюджета для всех сотрудников в массиве

    public int getCompanySalary(Employee[] workers) {
        int compSalary = 0;
        for (Employee worker : workers) {
            compSalary += worker.getBaseSalary();
        }
        return compSalary;
    }

//TODO поиск наименьшей зарплаты в массиве

    public int getMinCompanySalary(Employee[] workers) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee worker : workers) {
            if (worker.getBaseSalary() < minSalary) minSalary = worker.getBaseSalary();
        }
        return minSalary;
    }

//TODO поиск наибольшей зарплаты в массиве

    public int getMaxCompanySalary(Employee[] workers) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee worker : workers) {
            if (worker.getBaseSalary() > maxSalary) maxSalary = worker.getBaseSalary();
        }
        return maxSalary;
    }

//TODO поиск наименьшего количества подчиненных в массиве менеджеров

    public int getMinNumberOfSubordinates(Manager[] managers) {
        int minNumOfSubs = Integer.MAX_VALUE;
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < minNumOfSubs) minNumOfSubs = manager.getNumberOfSubordinates();
        }
    return minNumOfSubs;}

//TODO поиск наибольшего количества подчиненных в массиве менеджеров

    public int getMaxNumberOfSubordinates(Manager[] managers) {
        int maxNumOfSubs = Integer.MIN_VALUE;
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > maxNumOfSubs) maxNumOfSubs = manager.getNumberOfSubordinates();
        }
        return maxNumOfSubs;}

//TODO поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public int getMaxBonus(Manager[] managers) {
        int maxBonus = Integer.MIN_VALUE;
        for (Manager manager : managers) {
            if ((manager.getSalaryManager() - manager.getBaseSalary()) > maxBonus)
                maxBonus = manager.getSalaryManager() - manager.getBaseSalary();
        }
    return maxBonus;}

//TODO поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public int getMinBonus(Manager[] managers) {
        int minBonus = Integer.MAX_VALUE;
        for (Manager manager : managers) {
            if ((manager.getSalaryManager() - manager.getBaseSalary()) < minBonus)
                minBonus = manager.getSalaryManager() - manager.getBaseSalary();
        }
        return minBonus;}

    public static void main(String[] args) {
//test getSalary method overwriting
        homework.HW9.Employee emp = new homework.HW9.Employee("vasa", 1000);
        System.out.println(emp.getName() + " зп = " + emp.getSalary());
        homework.HW9.Worker wk = new Worker("vasawok", 1100);
        System.out.println(wk.getName() + " зп = " + wk.getSalary());
        homework.HW9.Manager mn = new homework.HW9.Manager("vasaman", 1000, 3);
        System.out.println(mn.getName() + " зп = " + mn.getSalary());
        homework.HW9.Director dir = new Director("vasadir", 1000, 3);
        System.out.println(dir.getName() + " зп = " + dir.getSalary());
//test global methods
        homework.HW9.Employee[] workers = new homework.HW9.Employee[] {
                new homework.HW9.Employee("vasa1", 1000),
                new homework.HW9.Employee("vasa2", 900),
                new homework.HW9.Employee("vanno", 1200),
                new homework.HW9.Employee("kopetya33", 1300),
                new homework.HW9.Employee("vasa3", 1200)};

        homework.HW9.Manager[] managers = new homework.HW9.Manager[] {
                new homework.HW9.Manager("vasaMan", 1000, 0),
                new homework.HW9.Manager("vasaMan2", 900, 2),
                new homework.HW9.Manager("vannoMan", 1200, 4),
                new homework.HW9.Manager("kopetyaMan", 1300, 5),
                new homework.HW9.Manager("vasaMan3", 1200, 10)};

        System.out.println(homework.HW9.Company.getEmployeeName("vasa2", workers));
        System.out.println(homework.HW9.Company.getEmployeeNamePart("petya", workers));
        System.out.println("total company salary = " + homework.HW9.Company.getCompanySalary(workers));
        System.out.println("minimal company salary = " + homework.HW9.Company.getMinCompanySalary(workers));
        System.out.println("maximal company salary = " + homework.HW9.Company.getMaxCompanySalary(workers));

        System.out.println("minimal number of subordinates from managers = " + homework.HW9.Company.getMinNumberOfSubordinates(managers));
        System.out.println("maximum number of subordinates from managers = " + homework.HW9.Company.getMaxNumberOfSubordinates(managers));
        System.out.println("maximum bonus from managers = " + homework.HW9.Company.getMaxBonus(managers));
        System.out.println("minimal bonus from managers = " + homework.HW9.Company.getMinBonus(managers));
    }
}
