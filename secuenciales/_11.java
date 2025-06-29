package secuenciales;

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primer número (3 cifras): ");
        int num1 = scanner.nextInt();
        System.out.print("Segundo número (3 cifras): ");
        int num2 = scanner.nextInt();

        int a1 = num1 / 100;
        int a2 = (num1 / 10) % 10;
        int a3 = num1 % 10;

        int b1 = num2 / 100;
        int b2 = (num2 / 10) % 10;
        int b3 = num2 % 10;

        int nuevo1 = b3 * 100 + a2 * 10 + b1;
        int nuevo2 = a3 * 100 + b2 * 10 + a1;

        System.out.println("Nuevo primer número: " + nuevo1);
        System.out.println("Nuevo segundo número: " + nuevo2);
    }
}
