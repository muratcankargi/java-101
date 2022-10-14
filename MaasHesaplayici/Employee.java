package MaasHesaplayici;

class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return  this.salary * 0.03;
        }
        return 0;

    }

    double bonus() {
        if (workHours > 40) {
            return (workHours-40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int currentYear = 2021;
        int workYear = currentYear - this.hireYear;
        if (workYear < 10) {
            if (workYear >= 9) {
                return this.salary * 0.1;
            }
            return (this.salary * 0.05);
        } else if (workYear < 20) {
            return this.salary * 0.1;
        } else if (workYear >= 19) {
            return this.salary * 0.15;
        } else
            return 0;
    }

    void tostring() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : "+this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş Artışı : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus() - this.tax()));
        System.out.println("Net Maaş : "+(this.salary+bonus()+raiseSalary()-tax()));
    }
}
