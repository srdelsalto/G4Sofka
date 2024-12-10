package co.com.sofka.assessment.tp1.model;

//Clase base que utiliza encapsulación
public abstract class Employee {
    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Método abstracto para que cada subclase implemente su cálculo de salario
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + ", Base Salary: " + baseSalary + "]";
    }
}