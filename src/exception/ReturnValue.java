package exception;

public class ReturnValue
{
        public static int test()
        {
            int x = 10;
            try
            {

                for (int i = 0; i < 10; i++)
                {
                    x = x + i;
                    System.out.println(x);

                }
                return x;
            }
            catch (Exception e)
            {

            }
            finally
            {
                x = 20;
                System.out.println("x is " + x);
            }
            return x;
        }


        public static void main(String[] args) {
            System.out.println(test());
        }
}
/*
output is 10
Why?
Return value is copied before finally executes
So change in finally does NOT affect return
 */