

public abstract class Employee {
    private  String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public abstract double bid();

    public int hoursWorked(int countWorkDays, int hours){
        return countWorkDays * hours;
    }

    public abstract double percentageOfTimeWorked();

    public abstract double salary();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

