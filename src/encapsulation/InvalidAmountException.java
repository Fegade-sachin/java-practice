package encapsulation;

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}
class InvalidAmountException2 extends RuntimeException
{
    public static void main(String[] args)
    {
        int amount=-1;
        if (amount < 0) {
            throw new InvalidAmountException("Amount cannot be negative");
        }
    }
}