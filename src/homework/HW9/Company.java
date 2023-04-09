package homework.HW9;

public class Company {
// TODO   Задача №3
//  Необходимо создать класс со следующими методами:

// TODO   Необходимо реализовать задание из Task 8.2 со следующими условиями:
//    Все методы в утилитарном классе должны быть static


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

    public static String getEmployeeName(String name, Employee[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].getName())) return workers[i].getName() + " is a worker number " + (i + 1);
        }
        return "There is no worker with this name";
    }

//TODO поиск сотрудника в массиве по вхождению указанной строки в его имени

    public static String getEmployeeNamePart(String namePart, Employee[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(namePart))
                return "have you been searching for " + workers[i].getName() + "? his number is " + (i + 1);
        }
        return "There is no worker with such name";
    }

//TODO подсчет зарплатного бюджета для всех сотрудников в массиве

    public static int getCompanySalary(Employee[] workers) {
        int compSalary = 0;
        for (Employee worker : workers) {
            compSalary += worker.getSalary();
        }
        return compSalary;
    }

//TODO поиск наименьшей зарплаты в массиве

    public static int getMinCompanySalary(Employee[] workers) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee worker : workers) {
            if (worker.getSalary() < minSalary) minSalary = worker.getSalary();
        }
        return minSalary;
    }

//TODO поиск наибольшей зарплаты в массиве

    public static int getMaxCompanySalary(Employee[] workers) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee worker : workers) {
            if (worker.getSalary() > maxSalary) maxSalary = worker.getSalary();
        }
        return maxSalary;
    }

//TODO поиск наименьшего количества подчиненных в массиве менеджеров

    public static int getMinNumberOfSubordinates(Manager[] managers) {
        int minNumOfSubs = Integer.MAX_VALUE;
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < minNumOfSubs) minNumOfSubs = manager.getNumberOfSubordinates();
        }
    return minNumOfSubs;}

//TODO поиск наибольшего количества подчиненных в массиве менеджеров

    public static int getMaxNumberOfSubordinates(Manager[] managers) {
        int maxNumOfSubs = Integer.MIN_VALUE;
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > maxNumOfSubs) maxNumOfSubs = manager.getNumberOfSubordinates();
        }
        return maxNumOfSubs;}

//TODO поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static int getMaxBonus(Manager[] managers) {
        int maxBonus = Integer.MIN_VALUE;
        for (Manager manager : managers) {
            if ((manager.getSalary() - manager.getBaseSalary()) > maxBonus)
                maxBonus = manager.getSalary() - manager.getBaseSalary();
        }
    return maxBonus;}

//TODO поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static int getMinBonus(Manager[] managers) {
        int minBonus = Integer.MAX_VALUE;
        for (Manager manager : managers) {
            if ((manager.getSalary() - manager.getBaseSalary()) < minBonus)
                minBonus = manager.getSalary() - manager.getBaseSalary();
        }
        return minBonus;}

    public static void main(String[] args) {
//test getSalary method overwriting
        Employee emp = new Employee("vasa", 1000);
        System.out.println(emp.getName() + " зп = " + emp.getSalary());
        Worker wk = new Worker("vasawok", 1100);
        System.out.println(wk.getName() + " зп = " + wk.getSalary());
        Manager mn = new Manager("vasaman", 1000, 3);
        System.out.println(mn.getName() + " зп = " + mn.getSalary());
        Director dir = new Director("vasadir", 1000, 3);
        System.out.println(dir.getName() + " зп = " + dir.getSalary());
//test global methods
        Employee[] workers = new Employee[] {
                new Employee("vasa1", 1000),
                new Employee("vasa2", 900),
                new Employee("vanno", 1200),
                new Employee("kopetya33", 1300),
                new Employee("vasa3", 1200)};

        Manager[] managers = new Manager[] {
                new Manager("vasaMan", 1000, 0),
                new Manager("vasaMan2", 900, 2),
                new Manager("vannoMan", 1200, 4),
                new Manager("kopetyaMan", 1300, 5),
                new Manager("vasaMan3", 1200, 10)};

        System.out.println(Company.getEmployeeName("vasa2", workers));
        System.out.println(Company.getEmployeeNamePart("petya", workers));
        System.out.println("total company salary = " + Company.getCompanySalary(workers));
        System.out.println("minimal company salary = " + Company.getMinCompanySalary(workers));
        System.out.println("maximal company salary = " + Company.getMaxCompanySalary(workers));

        System.out.println("minimal number of subordinates from managers = " + Company.getMinNumberOfSubordinates(managers));
        System.out.println("maximum number of subordinates from managers = " + Company.getMaxNumberOfSubordinates(managers));
        System.out.println("maximum bonus from managers = " + Company.getMaxBonus(managers));
        System.out.println("minimal bonus from managers = " + Company.getMinBonus(managers));
    }
}
