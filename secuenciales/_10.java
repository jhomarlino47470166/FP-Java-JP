package secuenciales;

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número de 4 cifras: ");
        int numero = scanner.nextInt();
        int num1 = numero / 1000;
        int num2 = (numero / 100) % 10;
        int num3 = (numero / 10) % 10;
        int num4 = numero % 10;
        int al_reves = num4 * 1000 + num3 * 100 + num2 * 10 + num1;
        System.out.println("Número invertido: " + al_reves);
    }
}