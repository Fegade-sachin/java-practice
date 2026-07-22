package opps.encapsulation;

public class ValidationEncap
{
     private int age;
     private String name;
    //Encapsulation allows validation before modifying data.
    public ValidationEncap(int age, String name)
    {
        if(age >0 && age < 120)
        {
            this.age = age;
            System.out.println("valid age");
        }
        else
        {//throw an Exception if it is not valued
            throw new IllegalArgumentException("Invalid age ! Age must be between 0 and 120");
        }
    }


    public int getAge()
    {
        return age;
    }
//    public void setAge(int age)
//    {
//        this.age = age;
//    }
    //you don't have sater because no one can modify age

    public static void main(String[] args) {
        //ValidationEncap obj = new ValidationEncap(-18, "Jack");//this is an Invalid age
        new ValidationEncap(18, "Jack");//it is valued
       // obj.setAge(-18); you can't pass value because does not have setter here.
        //System.out.println(obj.getAge());// it can be set value to it

    }

}
