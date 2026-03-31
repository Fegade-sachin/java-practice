package exception;

public class ReturnStatInTry_FinallyBlock
{
    public static void main(String[] args) {


        try {
            return;
        }
        finally
        {
           // return;
            System.out.println("this code is not reachable ");
        }
    }
}
// class Test {
//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException("Try");
//        } finally {
//            throw new RuntimeException("Finally");
//        }
//    }
//}