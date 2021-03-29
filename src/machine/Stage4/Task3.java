package machine.Stage4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        double a;
        double b;
        double c;
        double r;
        switch (shape) {
            case "rectangle" :
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "triangle" :
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            case "circle" :
                r = scanner.nextDouble();
                System.out.println(3.14 * r * r);
                break;
            default :
                System.out.println("Unknow form");
                break;
        }
    }
}
