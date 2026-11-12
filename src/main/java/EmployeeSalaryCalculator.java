
public class EmployeeSalaryCalculator {
	public double grossSalary(double basic, double hra, double da) {
        return basic + hra + da;
    }

    public double pf(double basic) {
        return basic * 0.12;
    }

    public double deductions(double basic) {
        return pf(basic) + 200;
    }

    public double netSalary(double basic, double hra, double da) {
        return grossSalary(basic, hra, da) - deductions(basic);
    }

}
