package encapsulation;
class EncImplementation
{
    public static void main(String[] args) {

        EncapsulationProgram en = new EncapsulationProgram();
        en.setName("sachin");
        en.setId(101);
        System.out.println(en.getName());
        System.out.println(en.getId());
    }
}
public class EncapsulationProgram
{
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
//it is only hide state or variable not provide security it is not safe variable another programmer can change
// it only provide access restriction, not security