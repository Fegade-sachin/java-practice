package opps.polymorphism.ex_polymorphism;
//What will be the outcome of the below program?
public class MainClass3
{

        double overloadedMethod(double d)
        {
            return d *= d;
        }

        int overloadedMethod(int i)// chosen first because argument is int

        {
            return overloadedMethod(i *= i);
        }

        float overloadedMethod(float f)
        {
            return overloadedMethod(f *= f);
        }

        public static void main(String[] args)
        {
            MainClass3 main = new MainClass3();

            System.out.println(main.overloadedMethod(100));//calling method int
        }
    }
    // Final Answer: The program results in a runtime StackOverflowError due to infinite recursion.


