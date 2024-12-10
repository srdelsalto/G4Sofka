package co.com.sofka.assessment.tp1;

import co.com.sofka.assessment.tp1.facade.EmployeeFacade;
import co.com.sofka.assessment.tp1.model.Developer;
import co.com.sofka.assessment.tp1.model.Employee;
import co.com.sofka.assessment.tp1.model.Manager;

// Clase principal para demostrar el uso
public class EmployeeSystem {
    public static void main(String[] args) {
        EmployeeFacade facade = new EmployeeFacade();

        // Crear empleados
        Employee manager = new Manager("Alice", 101, 5000, 2000);
        Employee developer = new Developer("Bob", 102, 4000, 10, 50);

        // Agregar empleados usando la fachada
        facade.addEmployee(manager);
        facade.addEmployee(developer);

        // Calcular y mostrar los salarios
        System.out.println("=== Salaries ===");
        facade.calculateAndPrintSalaries();

        // Actualizar el salario base de un empleado
        System.out.println("\n=== Update Base Salary ===");
        boolean updated = facade.updateBaseSalary(101, 5500);
        if (updated) {
            System.out.println("Base salary updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        // Mostrar los salarios después de la actualización
        System.out.println("\n=== Salaries After Update ===");
        facade.calculateAndPrintSalaries();
    }
}