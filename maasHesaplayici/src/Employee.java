
public class Employee {

    String name;
    String surName;
    double salary;
    int workHours;
    int hiredIn;
    int extraHour;
    double raise;
    int year;

    public Employee(String name, int salary, int workHours, int hiredIn, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hiredIn = hiredIn;
        this.year = year;
    }

    public double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax = this.salary * 3 / 100;
            return tax;
        } else {
            tax = 0;
            return tax;
        }
    }

    public double bonus() {
        double bonus = 0;
        if (this.workHours > 40) {
            this.extraHour = this.workHours - 40;
            bonus = this.extraHour * 30;
            return bonus;
        }
        return bonus;
    }

    public double raiseSalary() {
        if (this.year - this.hiredIn < 10) {
            this.raise = this.salary * 5 / 100;
            return this.raise;
        } else if ((this.year - this.hiredIn < 20) && (this.year - this.hiredIn > 9)) {
            this.raise = this.salary * 10 / 100;
            return this.raise;
        } else if (this.year - this.hiredIn > 19) {
            this.raise = this.salary * 15 / 100;
            return this.raise;
        }
        return this.raise;
    }

    public void printInfo() {
        System.out.println("\n-----------\n");
        System.out.println("Calisanin\nIsmi: " + this.name);
        System.out.println("Maasi: " + this.salary);
        System.out.println("Calisma saati: " + this.workHours);
        System.out.println("Baslangic yili: " + this.hiredIn);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas artisi: " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maas: " + (this.salary + bonus() - tax()));
        System.out.println("TOPLAM MAAS: " + (this.salary + raiseSalary()));
    }
}