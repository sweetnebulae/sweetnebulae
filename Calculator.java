import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner inputUser;
        float a, b, result;
        String operator;
        inputUser = new Scanner(System.in);

        System.out.println("Value of a = ");
        a = inputUser.nextFloat();
        System.out.println("Operator = ");
        operator = inputUser.next();
        System.out.println("Value of b = ");
        b = inputUser.nextFloat();

        switch (operator){
            case "+":
                result = a + b;
                System.out.println("Result = " + result);
                break;
            case "-":
                result = a - b;
                System.out.println("Result = " + result);
                break;
            case "*":
                result = a * b;
                System.out.println("Result = " + result);
                break;
            case "/":
                result = a / b;
                System.out.println("Result = " + result);
                break;
            default:
                System.out.println("Not Found");
        }
    }
}
