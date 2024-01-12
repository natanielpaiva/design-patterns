package example.solid.srp.exemplo2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto Employee
        Employee emp = new Employee();
        emp.setName("Nataniel Paiva");
        emp.setEmail("@natanieltech");
        emp.setHoursWorked(40);
        emp.setHourlyRate(20.0);
        emp.setMetSalesTarget(true);

        // Instanciar as classes de utilidade
        PayCalculator payCalculator = new PayCalculator();
        HourReporter hourReporter = new HourReporter();
        EmployeeSaver employeeSaver = new EmployeeSaver();

        // Calcular e imprimir o salário
        double salary = payCalculator.calculatePay(emp);
        System.out.println("Salary: $" + salary);

        // Gerar e imprimir o relatório de horas
        String report = hourReporter.reportHours(emp);
        System.out.println(report);

        // Salvar as informações do empregado
        try {
            employeeSaver.save(emp);
            System.out.println("Employee saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving employee: " + e.getMessage());
        }
    }
}

