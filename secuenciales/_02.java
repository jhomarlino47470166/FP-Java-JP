package secuenciales;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        double pulgadas = centimetros / 2.54;
        double pies = pulgadas / 12;
        double yardas = pies / 3;

        System.out.println("Centímetros = " + centimetros);
        System.out.println("Pulgadas = " + pulgadas);
        System.out.println("Pies = " + pies);
        System.out.println("Yardas = " + yardas);
    }
}

