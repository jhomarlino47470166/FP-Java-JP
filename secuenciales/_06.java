package secuenciales;

import java.util.Scanner;

public class _06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radio: ");
        double r = scanner.nextDouble();
        System.out.print("Altura: ");
        double h = scanner.nextDouble();
        double area = 2 * Math.PI * r * (r + h);
        double volumen = Math.PI * r * r * h;
        System.out.println("Área total = " + area);
        System.out.println("Volumen = " + volumen);
    }
}
