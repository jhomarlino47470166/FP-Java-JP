package secuenciales;

import java.util.Scanner;

public class _20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad en soles: ");
        int monto = scanner.nextInt();

        int b200 = monto / 200;
        monto = monto % 200;

        int b100 = monto / 100;
        monto = monto % 100;

        int b50 = monto / 50;
        monto = monto % 50;

        int b20 = monto / 20;
        monto = monto % 20;

        int b10 = monto / 10;
        monto = monto % 10;

        int m5 = monto / 5;
        monto = monto % 5;

        int m2 = monto / 2;
        monto = monto % 2;

        int m1 = monto;

        System.out.println("Billetes de 200: " + b200);
        System.out.println("Billetes de 100: " + b100);
        System.out.println("Billetes de 50: " + b50);
        System.out.println("Billetes de 20: " + b20);
        System.out.println("Billetes de 10: " + b10);
        System.out.println("Monedas de 5: " + m5);
        System.out.println("Monedas de 2: " + m2);
        System.out.println("Monedas de 1: " + m1);
    }
}
