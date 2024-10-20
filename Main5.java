import java.lang.Math;

public class Main5 {
    public static void main(String[] args) {
        double a = 4.4;
        double b = 0.57;
        double c = 6;
        double z = 0.054;
        double e = 1;

        double x = Math.sqrt(c + Math.pow(Math.pow(a-b, 2), 3))/Math.pow(a,2)+Math.pow(b,2);
        System.out.println("Результат: " + x);

        double y = Math.pow(e,a-b) * (Math.pow(Math.tan(z), 2) + 1);
        System.out.println("Результат: " + y);



    }
}
