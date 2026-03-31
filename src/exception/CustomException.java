package exception;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);

    }
}
public class CustomException
{
    public static void checkAge(int age) throws InvalidAgeException
    {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
