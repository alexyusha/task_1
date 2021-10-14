public class Programmer extends Employee{
   private static final double MAX_HOURS = 160;
   private  static final int DAY_HOURS = 8;
   private final int countDays;


    public Programmer(String firstName, String lastName, int id, int countDays){
        super(firstName, lastName, id);
        this.countDays = countDays;
    }

    @Override
    public double bid() {
        return 8000.0;
    }

    @Override
    public double percentageOfTimeWorked() {
        return hoursWorked(countDays, DAY_HOURS)*100/MAX_HOURS;
    }

    @Override
    public double salary() {
        return percentageOfTimeWorked()*bid()/100;
    }
}
