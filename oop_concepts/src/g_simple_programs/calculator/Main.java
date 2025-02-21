package g_simple_programs.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation (+, -, *, /): ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case '+':
                calculator.setOperation(new Addition());
                break;
            case '-':
                calculator.setOperation(new Subtraction());
                break;
            case '*':
                calculator.setOperation(new Multiplication());
                break;
            case '/':
                calculator.setOperation(new Division());
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }


        double result = calculator.performCalculation(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
