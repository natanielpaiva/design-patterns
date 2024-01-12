package example.solid.srp.exemplo2;

public class Employee {
    private String name;
    private String email;
    private int hoursWorked;
    private double hourlyRate;
    private boolean metSalesTarget;

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setMetSalesTarget(boolean metSalesTarget) {
        this.metSalesTarget = metSalesTarget;
    }

    public boolean hasMetSalesTarget() {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }



    // Construtor, getters e setters
}

