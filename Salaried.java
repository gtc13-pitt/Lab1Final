public class Salaried extends Worker
{
    private double income;

    public Salaried(String last, String first, double salary)
    {   
        super(last, first);
        this.income = salary;
    }
    @Override
    public double income()    {
        return income;
    }

    public String toString()
    {
        return super.toString() + "\nAnnual Salary: " + income;
    }
}