package exception;

public class FinallyNotExecuted
{
        public static void main(String[] args) {
            try {
                //System.exit(0);
                System.exit(1);
            } finally {
                System.out.println("Finally");
            }
        }

}
