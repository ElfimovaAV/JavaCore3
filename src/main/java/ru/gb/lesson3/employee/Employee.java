package ru.gb.lesson3.employee;


import java.util.*;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String dateOfEmployment;
    private int salary;

    public Employee(String firstName, String lastName, String position, String dateOfEmployment, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.dateOfEmployment = dateOfEmployment;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment() {
        this.dateOfEmployment = dateOfEmployment;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" + "firstname=" + firstName + ", lastname=" + lastName + ", position=" + position +
                ", dateOfEmployment=" + dateOfEmployment + ", salary=" + salary + '}';
    }

    public void salaryUp(int sum) {
        salary += sum;
    }
    public static List<Employee> getSortedEmployees(List<Employee> employees) {
            Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getDateOfEmployment().compareTo(employee2.getDateOfEmployment());
            }
        });
        return employees;
    }
}
