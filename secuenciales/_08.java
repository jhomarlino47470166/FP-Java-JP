package secuenciales;

import java.util.Scanner;

public class _08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radio: ");
        double r = scanner.nextDouble();
        System.out.print("Altura: ");
        double h = scanner.nextDouble();
        double areaBase = Math.PI * r * r;
        double areaLateral = 2 * Math.PI * r * h;
        double areaTotal = 2 * areaBase + areaLateral;
        System.out.println("Área base = " + areaBase);
        System.out.println("Área lateral = " + areaLateral);
        System.out.println("Área total = " + areaTotal);
    }
}