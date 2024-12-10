package co.com.sofka.assessment.tp1;

import co.com.sofka.assessment.tp1.model.Developer;
import co.com.sofka.assessment.tp1.model.Employee;
import co.com.sofka.assessment.tp1.model.Manager;

// Clase principal para demostrar el uso
public class EmployeeSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 5000, 2000);
        Manager manager2 = new Manager("Michael", 104, 2000, 1000);
        Employee developer = new Developer("Bob", 102, 4000, 10, 50);
        Employee santiagoDeveloper = new Developer("Santiago", 103, 5000, 20, 60);

        System.out.println(manager);
        System.out.println("Salary with base bonus: " + manager.calculateSalary());

        System.out.println(manager2);
        System.out.println("Salary with Base Bonus: " + manager2.calculateSalary());
        System.out.println("Salary Bonus with Experience: " + (manager2.calculateSalary() - manager2.calculateBonus() + manager2.calculateBonus(5)));  // 5 years

        System.out.println(developer);
        System.out.println("Salary: " + developer.calculateSalary());

        System.out.println(santiagoDeveloper);
        System.out.println("Salary: " + santiagoDeveloper.calculateSalary());
    }
}