package if_else_codes_practice;

public class IfElse_Code1_comparing_values {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a > 50 && b > 50 && c > 50) {
            System.out.println("Your values are greater than 50");
        } else if (a < 50 && b < 50 && c < 50) {
            System.out.println("Your values are less than 50");
        } else {
            System.out.println("Your values are missoriented");
        }
    }
}
//to check values below 50 or not