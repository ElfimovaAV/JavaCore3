package ru.gb.lesson3.employee;

import ru.gb.lesson3.employee.Employee;

import java.util.Date;

public class Operator extends Employee {

    public Operator(String firstName, String lastName, String dateOfEmployment) {
        super(firstName, lastName, "Operator", dateOfEmployment, 30000);
    }


}
