class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double getTotalSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double bonus() {
        return 5000;
    }

    @Override
    double getTotalSalary() {
        return baseSalary + bonus();
    }
}

class Developer extends Employee {
    Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double overtimePay() {
        return 3000;
    }

    @Override
    double getTotalSalary() {
        return baseSalary + overtimePay();
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 30000);
        Developer d = new Developer("Bob", 25000);

        System.out.println("Manager Total Salary: " + m.getTotalSalary());
        System.out.println("Developer Total Salary: " + d.getTotalSalary());
    }
}
