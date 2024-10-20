import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число a: ");
        double a = scanner.nextInt();
        System.out.println("Введіть число b: ");
        double b = scanner.nextInt();
        System.out.println("Введіть число х: ");
        double x = scanner.nextInt();
        System.out.println("Введіть число у: ");
        double y = scanner.nextInt();


        if (x == -1 && y <= 6) {
            System.out.println("Результат: " + Math.asin(x));
        }else if (x == 6) {
            System.out.println("Результат: " + 3 * Math.pow(x,2) + b*x);
        }else if (x <= 6 && y == 8) {
            System.out.println("Результат: " + Math.abs(a*x - 3*b));
        }else {
            System.out.println("Не вірні дані");
        }

    }
}