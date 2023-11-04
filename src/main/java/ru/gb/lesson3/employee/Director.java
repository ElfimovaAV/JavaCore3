package ru.gb.lesson3.employee;

import java.util.Date;

public class Director extends Employee {

    public Director(String firstName, String lastName, String dateOfEmployment) {
        super(firstName, lastName, "Director", dateOfEmployment, 180000);
    }

    public static void salaryUp(Employee[] employees, int sum) {
        for (Employee employee : employees
        ) {
            if (!(employee instanceof Director)) {
                employee.salaryUp(sum);
            }


        }
    }
}