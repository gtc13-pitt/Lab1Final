public class Hourly extends Worker
{
    private double income;
    private int hours;
    private double pay;

    public Hourly(String last, String first, int hours, double pay)
    {   
        super(last, first);
        this.hours = hours;
        this.pay = pay;
        this.income = hours*pay;
    }
    
    @Override
    public double income()    {
        return hours * pay;
    }

    public String toString()
    {
        return super.toString() + "\nAnnual Hours: " + hours + "\nHourly Wage: " + pay;
    }
}