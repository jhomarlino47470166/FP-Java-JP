package secuenciales;

import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pies: ");
        int pies = scanner.nextInt();
        System.out.print("Pulgadas: ");
        int pulgadas = scanner.nextInt();
        double totalPulgadas = pies * 12 + pulgadas;
        double centimetros = totalPulgadas * 2.54;
        double metros = centimetros / 100;
        System.out.println("Tu estatura en metros: " + metros);
    }
}