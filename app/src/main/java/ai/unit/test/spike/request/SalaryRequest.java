package ai.unit.test.spike.request;

import ai.unit.test.spike.domain.EmployeeType;

public class SalaryRequest {
    private EmployeeType employeeTYpe;
    private double baseSalaryRate;
    private int overTimeHours;
    private int seniority;
    private int workDays;

    private double salesRevenue;

    public double getBaseSalaryRate() {
        return baseSalaryRate;
    }

    public void setBaseSalaryRate(final double baseSalaryRate) {
        this.baseSalaryRate = baseSalaryRate;
    }

    public EmployeeType getEmployeeTYpe() {
        return employeeTYpe;
    }

    public void setEmployeeTYpe(final EmployeeType employeeTYpe) {
        this.employeeTYpe = employeeTYpe;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(final int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(final int seniority) {
        this.seniority = seniority;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(final int workDays) {
        this.workDays = workDays;
    }

    public double getSalesRevenue() {
        return salesRevenue;
    }

    public void setSalesRevenue(final double salesRevenue) {
        this.salesRevenue = salesRevenue;
    }

}
