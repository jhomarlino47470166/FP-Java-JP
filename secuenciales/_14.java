package secuenciales;

import java.util.Scanner;

public class _14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 números:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();
        double num5 = scanner.nextDouble();

        double[] numeros = {num1, num2, num3, num4, num5};
        java.util.Arrays.sort(numeros);

        double promedio = (numeros[2] + numeros[3] + numeros[4]) / 3;

        System.out.println("Promedio de los 3 mayores: " + promedio);
    }
}
