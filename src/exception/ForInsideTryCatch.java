package exception;

public class ForInsideTryCatch
{
    static Integer x=null;
    public static void main(String[] args)
    {
        for( int i=0;i<10;i++)
        {
         try
         {
             if(i==3)
             {
                 System.exit(0);
                 break;
             }
             System.out.println(i);

         }
         catch(Exception e)
         {
             System.out.println(e);
         }
         finally
             {
             System.out.println("finally");
             }
        }
    }
}
