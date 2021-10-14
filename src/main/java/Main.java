import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            int random = (int)(Math.random() * 2);
            if (random == 0){
                employeeList.add(new Programmer("firstName" + i, "LastName" + i, i, i));
            }
            else{
                employeeList.add(new Manager("firstName" + i, "LastName" + i, i, i));
            }


        }
        System.out.println(accountant.sum(employeeList));
    }
}
