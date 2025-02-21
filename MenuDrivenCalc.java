import java.util.Scanner;

public class MenuDrivenCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        float resultfloat;
        char operator;

        System.out.println("Enter first number:");
        num1 = sc.nextInt();

        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        System.out.println("Choose between +, -, *, / :");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    resultfloat = (float) num1 / num2; // Cast to float for decimal division
                    System.out.println("Result: " + resultfloat);
                } else {
                    System.out.println("An error Occurred");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}