package machine.Stage3;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsNeeded = scanner.nextInt();
        int cupsAvailable = Math.min(water / 200, Math.min(milk / 50, beans / 15));
        if (cupsNeeded == cupsAvailable) {
            System.out.println( "Yes, I can make that amount of coffee");
        } else if (cupsNeeded > cupsAvailable) {
            System.out.println("No, I can make only" + cupsAvailable + "cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsAvailable - cupsNeeded) + " more than that)");
        }
    }
}
