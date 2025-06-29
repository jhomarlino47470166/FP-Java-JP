package secuenciales;

import java.util.Scanner;

public class _15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aporte de Juan ($): ");
        double juan = scanner.nextDouble();

        System.out.print("Aporte de Rosa ($): ");
        double rosa = scanner.nextDouble();

        System.out.print("Aporte de Daniel (Soles): ");
        double danielSoles = scanner.nextDouble();

        double daniel = danielSoles / 3; 

        double total = juan + rosa + daniel;

        double porcentajeJuan = juan * 100 / total;
        double porcentajeRosa = rosa * 100 / total;
        double porcentajeDaniel = daniel * 100 / total;

        System.out.println("Total en dólares: " + total);
        System.out.println("Porcentaje de Juan: " + porcentajeJuan + "%");
        System.out.println("Porcentaje de Rosa: " + porcentajeRosa + "%");
        System.out.println("Porcentaje de Daniel: " + porcentajeDaniel + "%");
    }
}
