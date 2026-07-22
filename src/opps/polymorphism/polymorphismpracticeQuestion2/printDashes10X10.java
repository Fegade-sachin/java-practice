package opps.polymorphism.polymorphismpracticeQuestion2;

/*
3. Print a 10x10 grid of dashes

Write a Java program to print the following grid.

Expected Output :

- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
 */
public class printDashes10X10
{
   void Print()
    {
        for(int i=0;i<10*10;i++)
        {
            System.out.println("- - - - - - - - - -");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        printDashes10X10 obj = new printDashes10X10();
        obj.Print();

    }
}

