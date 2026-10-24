abstract class E_resource
{
    String source_id;
    String s_name;
    double E_in_kw;

    abstract void calc_eff();
}

class Solar extends E_resource
{
    Solar(String s_id, String s_n, double e)
    {
        source_id = s_id;
        s_name = s_n;
        E_in_kw = e;
    }

    @Override 
    void calc_eff()
    {
        double eff = (E_in_kw/8000)*100;
        System.out.println("Efficiency of Solar = " + eff + "%");
    }
}

class Wind extends E_resource
{
    Wind(String s_id, String s_n, double e)
    {
        source_id = s_id;
        s_name = s_n;
        E_in_kw = e;
    }

    @Override 
    void calc_eff()
    {
        double eff = (E_in_kw/8000)*100;
        System.out.println("Efficiency of Wind = " + eff + "%");
    }
}

public class Main
{
    public static void main(String args[])
    {
        E_resource E;

        E = new Solar("E0001", "Sol", 7498.48);
        E.calc_eff();

        E = new Wind("E0002", "Aeol", 2654.84);
        E.calc_eff();
    }
}