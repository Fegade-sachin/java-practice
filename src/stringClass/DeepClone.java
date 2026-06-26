package stringClass;
class village implements Cloneable
{
    String name;
    village(String name)
    {
        this.name = name;
    }
    public Object clone()
    {
        try
        {
           return (village)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public String toString()
        {
        return this.name;
        }
}
public class DeepClone implements Cloneable
{
    String yourName;
    village vil;
    public DeepClone(String yourName , village vil)
    {
        this.yourName = yourName;
        this.vil =vil;
    }
    protected Object clone() throws CloneNotSupportedException
    {
        DeepClone closed=(DeepClone) super.clone();
        closed.vil =(village) vil.clone();
        return  closed;
    }
    public String toString()
    {
        return this.yourName+" "+ this.vil;
    }
    public static void main(String[] args) throws CloneNotSupportedException
    {
        DeepClone deepClone =new DeepClone("sachin",new village("sachin"));
        System.out.println(deepClone.yourName+" "+deepClone.vil);
        DeepClone deepClone1 =(DeepClone) deepClone.clone();
        deepClone1.yourName="sham";
        deepClone1.vil =new village("vashim");
        System.out.println(deepClone1.yourName+" "+deepClone1.vil);
    }
}
