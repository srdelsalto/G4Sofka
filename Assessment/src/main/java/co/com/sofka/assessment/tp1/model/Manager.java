package co.com.sofka.assessment.tp1.model;

// Subclase Manager que utiliza herencia y polimorfismo
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    // Método sobrecargado para calcular bonificación básica
    public double calculateBonus() {
        return bonus;
    }

    // Sobrecarga: calcula bonificación adicional según años de experiencia
    public double calculateBonus(int yearsOfExperience) {
        double experienceBonus = yearsOfExperience * 100;
        return bonus + experienceBonus;
    }
}
