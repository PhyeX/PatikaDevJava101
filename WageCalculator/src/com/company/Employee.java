package com.company;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax () {
        if ( salary < 1000 )
            return 0;

        return (int)(salary * 0.03);
    }

    int bonus() {

        return  workHours *30;
    }

    int raiseSalary(){
        int year = 2020-hireYear;
        if( year < 10 )
            return (int)(salary * 1.05);

        if( year < 20 )
            return (int)(salary * 1.10);

        return (int) (salary * 1.15);

    }
    @Override
    public String toString(){
        return
            "Adı : "+name+
            "\nMaaşı : "+salary+
            "\nÇalışma Saati : "+workHours+
            "\nBaşlangıç Yılı :"+hireYear+
            "\nVergi : "+tax()+
            "\nBonus : "+bonus()+
            "\nMaaş Artışı "+raiseSalary()+
            "\nVergi ve Bonuslar ile birlikte maaş : "+(salary-bonus()+tax())+
            "\nToplam Maaş : "+(salary+raiseSalary());

    }

}
