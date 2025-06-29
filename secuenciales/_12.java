package secuenciales;

import java.util.Scanner;

public class _12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese c: ");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println("Raíz 1: " + x1);
        System.out.println("Raíz 2: " + x2);
    }
}
