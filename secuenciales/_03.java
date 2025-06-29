package secuenciales;

import java.util.Scanner;

public class _03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilómetros: ");
        int kilometros = scanner.nextInt();

        System.out.print("Pies: ");
        int pies = scanner.nextInt();

        System.out.print("Millas: ");
        int millas = scanner.nextInt();

        double m_Kilometros = kilometros * 1000;
        double m_Pies = pies / 3.2808;
        double m_Millas = millas * 1609;

        double metros = m_Kilometros + m_Pies + m_Millas;

        double yardas = metros / 0.9144;

        System.out.println("Metros = " + metros);
        System.out.println("Yardas = " + yardas);
    }
}
