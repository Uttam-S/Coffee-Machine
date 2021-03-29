package machine.Stage4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        String operation = scanner.next();
        long second = scanner.nextLong();
        switch (operation) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(first / second);
                }
                break;
            case "*":
                System.out.println(first * second);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}