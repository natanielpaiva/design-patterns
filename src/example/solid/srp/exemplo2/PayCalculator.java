package example.solid.srp.exemplo2;

public class PayCalculator {
    public double calculatePay(Employee emp) {
        double basePay = emp.getHoursWorked() * emp.getHourlyRate();
        return basePay + calculateBonus(emp);
    }

    private double calculateBonus(Employee emp) {
        // Lógica para calcular um bônus, por exemplo, baseado no desempenho
        if (emp.hasMetSalesTarget()) {
            return 100.0; // Bônus fixo
        }
        return 0.0;
    }
}

