import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EmployeeSalaryCalculatorTest {

    EmployeeSalaryCalculator obj =
            new EmployeeSalaryCalculator();

    @Test
    void testGrossSalary() {
        assertEquals(50000,
                obj.grossSalary(30000, 10000, 10000));
    }

    @Test
    void testPF() {
        assertEquals(3600, obj.pf(30000));
    }

    @Test
    void testDeductions() {
        assertEquals(3800, obj.deductions(30000));
    }

    @Test
    void testNetSalary() {
        assertEquals(46200,
                obj.netSalary(30000, 10000, 10000));
    }
}
