package secuenciales;

import java.util.Scanner;

public class _07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base: ");
        double b = scanner.nextDouble();
        System.out.print("Altura: ");
        double h = scanner.nextDouble();
        double area = b * h;
        double perimetro = 2 * (b + h);
        System.out.println("Área = " + area);
        System.out.println("Perímetro = " + perimetro);
    }
}