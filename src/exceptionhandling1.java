import java.lang.ArithmeticException;
public class exceptionhandling1 {
    public static void main(String[] args) {
        try {int a=10,b=0;
        System.out.println(a/b);}
        catch(Exception e) {
            System.out.println("cannot be divided by zero");

        }
        System.out.println("program continues");
    }
}
