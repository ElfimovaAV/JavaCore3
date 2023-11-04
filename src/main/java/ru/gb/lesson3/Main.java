//Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные в виде
// трёх чисел гггг-мм-дд, без использования условного оператора.
//Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя,
// модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
// В основной программе создайте руководителя и поместите его в общий массив сотрудников.
// Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

package ru.gb.lesson3;

import ru.gb.lesson3.employee.Director;
import ru.gb.lesson3.employee.Employee;
import ru.gb.lesson3.employee.Manager;
import ru.gb.lesson3.employee.Operator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Создание списка сотрудников
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Operator("Nikolay", "Orlov", "2020-05-20");
        Employee employee2 = new Manager("Kirill", "Ivanov", "2019-05-07");
        Employee employee3 = new Director("Mark", "Vasiliev", "2022-01-23");
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("Employee info:");
        System.out.println("---------------");
        for (Employee employee : employees
        ) {
            System.out.println(employee);
        }

        Director.salaryUp(employees.toArray(new Employee[0]), 10000);
        System.out.println("\nNew employee info after salary growth:");
        System.out.println("---------------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nSorting list of employee by date of employment:");
        System.out.println("---------------");

        System.out.println(Employee.getSortedEmployees(employees));


}
}
