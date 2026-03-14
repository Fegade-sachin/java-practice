package Encapsulation;

final class EncapsulationConstructor
{
    final private int empid;
    public int getEmpid() {
        return empid;
    }
    private EncapsulationConstructor(int empid)
    {
        this.empid = empid;
    }

    public static void main(String[] args)
    {
        new EncapsulationConstructor(65);
    }

}
public class ConstructorAsPrivate
{
   // new  EncapsulationConstructor(23);//you cannot create constructor outside the class because it is private
    public static void main(String[] args)
    {

    }
}
