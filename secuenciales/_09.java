package secuenciales;

import java.util.Scanner;

public class _09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número de 4 cifras: ");
        int numero = scanner.nextInt();
        int num1 = numero / 1000;
        int num2 = (numero / 100) % 10;
        int num3 = (numero / 10) % 10;
        int num4 = numero % 10;
        int total = num1 + num2 + num3 + num4;
        System.out.println("Suma de cifras: " + total);
    }
}