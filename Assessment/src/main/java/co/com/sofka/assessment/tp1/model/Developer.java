package co.com.sofka.assessment.tp1.model;

// Subclase Developer
public class Developer extends Employee {
    private int extraHours;
    private double hourlyRate;

    public Developer(String name, int id, double baseSalary, int extraHours, double hourlyRate) {
        super(name, id, baseSalary);
        this.extraHours = extraHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (extraHours * hourlyRate);
    }
}