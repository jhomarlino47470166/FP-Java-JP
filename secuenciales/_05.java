package secuenciales;

import java.util.Scanner;

public class _05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad en GB: ");
        double gb = scanner.nextDouble();
        double mb = gb * 1024;
        double kb = mb * 1024;
        double bytes = kb * 1024;
        System.out.println("Megabytes = " + mb);
        System.out.println("Kilobytes = " + kb);
        System.out.println("Bytes = " + bytes);
    }
}