package opps.encapsulation;
import java.lang.reflect.Field;
class  parent  implements Cloneable
{

    double salary;
    parent(double salary)
    {
       this.salary=salary;
    }
    // Copy constructor
//    parent(parent other) {
//        this.salary = other.salary;
//    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Override clone
    @Override
    protected parent clone() {
        try {
            return (parent) super.clone(); // shallow copy is fine here
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // should never happen
        }
    }
}

public final class ImmutableClass
{

        private final int age;
        private final String name;
        private final parent abc;
        public ImmutableClass(int age, String name, parent abc) {

            if(age > 0 && age < 120) {
                this.age=age;

            }
            else {
                throw new IllegalArgumentException("age must be between 0 and 100");
            }

            this.name = name;
          //  this.abc =new parent(abc.getSalary());
           // this.abc =new parent(abc);//copy constructor
            this.abc = abc.clone();// defensive copy using clone

        }

    public parent getAbc()
    {
        //return  new parent(abc.getSalary());
        //return new parent(abc);copy constructor
        return abc.clone();// return a copy, not the original

    }

    public int getAge()
    {
            return age;
        }

        public String getName() {
            return name;
        }

        public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        parent  p=new parent(1200);
            ImmutableClass im = new ImmutableClass(25, "Jack",p);
            new parent(1300);//also it is not modify
            p.setSalary(1400);//you can't modify object  defensive copy is used

            System.out.println(im.getAge()+" ");
            System.out.println(im.getName()+" ");
            System.out.println(im.getAbc().getSalary()+" ");
            //Encapsulation break through  reflection:
            Field nameField = ImmutableClass.class.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(im, "sachin");
            // reflection override
            System.out.println("----------------------------------------------");
            System.out.println(im.getAge()+" "+im.getName()+" "+im.getAbc().getSalary());
            System.out.println("After reflection age is become 99 : " + im.getName());

        }
}




























    /*
    this is an  immutable class
    Getter present
    Setter absent
    Data cannot be modified after creation.
     */

