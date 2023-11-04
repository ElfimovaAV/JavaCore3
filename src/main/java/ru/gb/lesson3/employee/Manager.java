package ru.gb.lesson3.employee;

import ru.gb.lesson3.employee.Employee;

import java.util.Date;

public class Manager extends Employee {

    public Manager(String firstName, String lastName, String dateOfEmployment) {
        super(firstName, lastName, "Manager", dateOfEmployment, 50000);
    }


}
