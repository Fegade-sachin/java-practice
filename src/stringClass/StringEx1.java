package stringClass;
//object store in two different memory one heap or Another is String constat pool
public class StringEx1
{
    public static void main(String[] args) {
        String S1=new String("abc");
        String S2=new String("abc");
        System.out.println(S1==S1.intern());//refer  inside heap memory and another SCP false
        System.out.println(S1.intern()==S1.intern());//refer to the same  object reference true
        System.out.println(S1.intern()==S2.intern());//true
        System.out.println(S2==S2.intern());//same object different refer two memory location,that's why it is false
        System.out.println(S2==S1);// refer only inside heap memory false
        System.out.println(S1.equals(S2));//true check content it that object
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("without new Keyword ");
        String s3="java";
        String s4="java";
        System.out.println(s3==s4);
        System.out.println(s3==s4.intern());//does not affect on it because it already in SCP .
        System.out.println(s3.intern()==s4.intern());//both are same memory location
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Comparison heap Memory or SCP memory object");
        System.out.println(S1==s3);//false
        System.out.println(S1==s4.intern()); //false
        System.out.println(S1.intern()==s4);//true;
        System.out.println(S1.intern()==s3);//true
        System.out.println(new String("java")==s3);//false
        System.out.println(new String("java")==s4);//false
        System.out.println(new String("java")==new String("java"));//false
        System.out.println("java"=="java");//true
        System.out.println(S1==S2);//true


    }
}
