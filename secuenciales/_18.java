package secuenciales;

import java.util.Scanner;

public class _18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unidades: ");
        int unidades = scanner.nextInt();

        System.out.print("Precio unitario: ");
        double precio = scanner.nextDouble();

        double importe = unidades * precio;
        double descuento1 = importe * 0.15;
        double intermedio = importe - descuento1;
        double descuento2 = intermedio * 0.15;
        double totalPagar = intermedio - descuento2;
        double descuentoTotal = descuento1 + descuento2;

        System.out.println("Importe: " + importe);
        System.out.println("Descuento total: " + descuentoTotal);
        System.out.println("Importe a pagar: " + totalPagar);
    }
}
