package secuenciales;

import java.util.Scanner;

public class _19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Monto total vendido: ");
        double ventas = scanner.nextDouble();

        double sueldoBasico = 500;
        double comision = ventas * 0.09;
        double sueldoBruto = sueldoBasico + comision;
        double descuento = sueldoBruto * 0.11;
        double sueldoNeto = sueldoBruto - descuento;

        System.out.println("Comisión: " + comision);
        System.out.println("Sueldo bruto: " + sueldoBruto);
        System.out.println("Descuento: " + descuento);
        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}
