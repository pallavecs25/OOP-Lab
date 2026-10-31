abstract class Employee{
    String empId, empName;
    double basicSal;
    double salProp;

    abstract void calcSal();

    void displayDet()
    {
        System.out.println("Id : " + empId);
        System.out.println("Name : " + empName);
        System.out.println("Salary : " + salProp);
    }
}

class PerEmp extends Employee{

    PerEmp(String a, String b, double c)
    {
        empId = a;
        empName = b;
        basicSal  = c;
    }

    @Override 
    void calcSal()
    {
        salProp = basicSal + (0.2*basicSal);
    }
}
class ConEmp extends Employee{

    ConEmp(String a, String b, double c)
    {
        empId = a;
        empName = b;
        basicSal  = c;
    }

    @Override 
    void calcSal()
    {
        salProp = basicSal + (0.1*basicSal);
    }
}

public class Main
{
    public static void main(String args[])
    {
        Employee e;

        e = new PerEmp("E001", "Pal", 100000 );
        e.calcSal();
        e.displayDet();

       ConEmp e2 = new ConEmp("E021", "John", 40000 );
        e2.calcSal();
        e2.displayDet();
    }
}
