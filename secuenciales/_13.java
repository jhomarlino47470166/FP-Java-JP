package secuenciales;

import java.util.Scanner;

public class _13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cateto 1: ");
        double a = scanner.nextDouble();

        System.out.print("Cateto 2: ");
        double b = scanner.nextDouble();

        double sumaCuadrados = a * a + b * b;
        double hipotenusa = Math.sqrt(sumaCuadrados);

        System.out.println("Hipotenusa = " + hipotenusa);
    }
}
