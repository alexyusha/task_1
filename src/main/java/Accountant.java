import java.util.List;


public class Accountant {
    public double sum(List<Employee> listEmployees){
        int sumSalary = 0;
        for (int i =0; i < listEmployees.size(); i++){
            sumSalary += listEmployees.get(i).salary();
        }
        return sumSalary;
    }
}
