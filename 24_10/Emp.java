abstract class Employee
{
    abstract void salary();
}

class HR extends Employee
{
    @Override 
    void salary()
    {
        System.out.println("Salary - HR : 20000");
    }
}

class Manager extends Employee
{
    @Override 
    void salary()
    {
        System.out.println("Salary - Manager : 50000");
    }
}

public class Emp
{
    public static void main(String args[])
    {
        HR e1 = new HR();
        e1.salary();

        Manager e2 = new Manager();
        e2.salary();
    }
}