package exception;

import java.io.IOException;
class userException  extends Exception
{
    userException( String message )
    {
        super(message);
    }

}

public class UserDefinedException
{
    public UserDefinedException() throws Exception {
        throw new userException("UserException");
    }
    public static void main(String[] args) {
     try {

        UserDefinedException t = new UserDefinedException();
        }
     catch (Exception e) {
         System.out.println("Exception catch "+e.getMessage());
     }
    }
}
