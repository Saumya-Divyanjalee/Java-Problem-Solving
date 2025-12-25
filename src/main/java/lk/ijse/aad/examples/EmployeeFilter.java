package lk.ijse.aad.examples;

import java.util.*;

// Class representing an Employee
class Employee {
    String name;
    int age;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class EmployeeFilter {

    public static void main(String[] args) {

        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, 75000),
                new Employee("Bob", 25, 60000),
                new Employee("Charlie", 35, 90000),
                new Employee("Diana", 28, 70000)
        );


        // Find employees with salary > 65000

        System.out.println("High earners:");
        for (Employee emp : employees) {
            if (emp.salary > 65000) {
                System.out.println(emp.name + " - Rs." + emp.salary);
            }
        }

        // Calculate average salary

        double totalSalary = 0;

        for (Employee emp : employees) {
            totalSalary += emp.salary;
        }

        double averageSalary = totalSalary / employees.size();
        System.out.println("\nAverage salary: $" + averageSalary);
    }
}

