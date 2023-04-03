package homework.HW82;

public class Company {
// TODO   Задача №3

// Необходимо создать класс со следующими методами:

    public Employee[] workers;
    public Manager[] managers;

    public Company(Employee[] workers) {
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Employee(workers[i].getName(), workers[i].getBaseSalary());
        }
    }

    public Company(Manager[] managers) {
        for (int i = 0; i < managers.length; i++) {
            managers[i] = new Manager(managers[i].getName(), managers[i].getBaseSalary(), managers[i].getNumberOfSubordinates());
        }
    }
//TODO поиск сотрудника в массиве по его имени

    public String getEmployeeName(String name) {
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].name)) return "worker number " + (i + 1);
        }
        return "There is no worker with this name";
    }

//TODO поиск сотрудника в массиве по вхождению указанной строки в его имени

    public String getEmployeeNamePart(String namePart) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].name.contains(namePart)) return "worker number " + (i + 1);
        }
        return "There is no worker with this name";
    }

//TODO подсчет зарплатного бюджета для всех сотрудников в массиве

    public int getCompanySalary() {
        int compSalary = 0;
        for (int i = 0; i < workers.length; i++) {
            compSalary += workers[i].baseSalary;
        }
        return compSalary;
    }

//TODO поиск наименьшей зарплаты в массиве

    public int getMinCompanySalary() {
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].baseSalary < minSalary) minSalary = workers[i].baseSalary;
        }
        return minSalary;
    }

//TODO поиск наибольшей зарплаты в массиве

    public int getMaxCompanySalary() {
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].baseSalary > maxSalary) maxSalary = workers[i].baseSalary;
        }
        return maxSalary;
    }

//TODO поиск наименьшего количества подчиненных в массиве менеджеров

    public int getMinNumberOfSubordinates() {
        int minNumOfSubs = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() > minNumOfSubs) minNumOfSubs = managers[i].getNumberOfSubordinates();
        }
    return minNumOfSubs;}

//TODO поиск наибольшего количества подчиненных в массиве менеджеров

    public int getMaxNumberOfSubordinates() {
        int maxNumOfSubs = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (managers[i].getNumberOfSubordinates() < maxNumOfSubs) maxNumOfSubs = managers[i].getNumberOfSubordinates();
        }
        return maxNumOfSubs;}

//TODO поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public int getMaxBonus() {
        int maxBonus = Integer.MIN_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if ((managers[i].getSalaryManager() - managers[i].getBaseSalary()) > maxBonus) maxBonus = managers[i].getSalaryManager() - managers[i].getBaseSalary();
        }
    return maxBonus;}

//TODO поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public int getMinBonus() {
        int minBonus = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if ((managers[i].getSalaryManager() - managers[i].getBaseSalary()) > minBonus) minBonus = managers[i].getSalaryManager() - managers[i].getBaseSalary();
        }
        return minBonus;}
}
