package co.com.sofka.assessment.tp1.facade;

import co.com.sofka.assessment.tp1.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFacade {
    private List<Employee> employees;

    public EmployeeFacade() {
        employees = new ArrayList<>();
    }

    // Metodo para agregar un empleado
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Metodo para calcular los salarios de todos los empleados
    public void calculateAndPrintSalaries() {
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Calculated Salary: " + employee.calculateSalary());
        }
    }

    // Metodo para encontrar un empleado por ID
    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null; // Retornar null si no se encuentra
    }

    // Metodo para actualizar el salario base de un empleado por ID
    public boolean updateBaseSalary(int id, double newBaseSalary) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employee.setBaseSalary(newBaseSalary);
            return true;
        }
        return false;
    }
}
