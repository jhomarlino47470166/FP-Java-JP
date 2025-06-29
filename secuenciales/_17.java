package secuenciales;

import java.util.Scanner;

public class _17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Donación total: ");
        double donacion = scanner.nextDouble();

        double salud = donacion * 0.25;
        double comedor = donacion * 0.35;
        double escuela = donacion * 0.25;

        double asilo = donacion - (salud + comedor + escuela);

        System.out.println("Centro de salud: " + salud);
        System.out.println("Comedor infantil: " + comedor);
        System.out.println("Escuela infantil: " + escuela);
        System.out.println("Asilo de ancianos: " + asilo);
    }
}
