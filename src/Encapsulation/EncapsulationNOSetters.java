package Encapsulation;

public final class EncapsulationNOSetters//if i make class as final inheritance is not allow
    //you can't extends of that class or not overridden
{
    final private int EmpId;
    final private String EmpName;


    public EncapsulationNOSetters(String empName, int empId) //this class constructor can create outside that's why we can access outside
    {//if we don't want to outside access  make constructor as private
        EmpName = empName;
        EmpId = empId;
    }
    public String getEmpName() {
        return EmpName;
    }

    public int getEmpId() {
        return EmpId;
    }

    public static void main(String[] args)
    {
        //one object can assignee once value to the variable we can not change this object we need to create now one
        //  if you want to  value this object is inside a class or outside a class does not matter but you need to create new object
        // outher wise you can't change value or give value of that cllass object variable
        EncapsulationNOSetters e = new EncapsulationNOSetters("J", 23);
        System.out.println(e.getEmpName());
        System.out.println(e.getEmpId());

    }
}
class OutsideEncapsulationNOSetters
{
    public static void main(String[] args)
    {
        //if you want to change value we need to create new object. outside class wa can create object.

        EncapsulationNOSetters en = new EncapsulationNOSetters("java", 111);
        System.out.println(en.getEmpName());
        System.out.println(en.getEmpId());
    }
}
