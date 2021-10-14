import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountantTest {
    List<Employee> employeeList = new ArrayList<>();
    Accountant accountant = new Accountant();

    @Test
    void sum() {
        employeeList.add(new Programmer("f", "l", 1, 20));
        employeeList.add(new Manager("f", "l", 2, 20));
        assertEquals(13000.0, accountant.sum(employeeList));
        employeeList.add(new Programmer("f", "l", 1, 19));
        employeeList.add(new Manager("f", "l", 2, 19));
        assertEquals(25350.0, accountant.sum(employeeList));
    }
}