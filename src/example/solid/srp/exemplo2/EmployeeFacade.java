package example.solid.srp.exemplo2;

import java.io.IOException;

public class EmployeeFacade {
    private PayCalculator payCalculator;
    private HourReporter hourReporter;
    private EmployeeSaver employeeSaver;

    public EmployeeFacade(PayCalculator payCalculator, HourReporter hourReporter, EmployeeSaver employeeSaver) {
        this.payCalculator = payCalculator;
        this.hourReporter = hourReporter;
        this.employeeSaver = employeeSaver;
    }

    public double calculatePay(Employee emp) {
        return payCalculator.calculatePay(emp);
    }

    public void reportHours(Employee emp) {
        hourReporter.reportHours(emp);
    }

    public void saveEmployee(Employee emp) throws IOException {
        employeeSaver.save(emp);
    }
}

