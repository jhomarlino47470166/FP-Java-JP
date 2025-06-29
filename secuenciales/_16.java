package secuenciales;

import java.util.Scanner;

public class _16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Horas trabajadas: ");
        double horas = scanner.nextDouble();

        System.out.print("Tarifa por hora: ");
        double tarifa = scanner.nextDouble();

        double sueldoBasico = horas * tarifa;
        double sueldoBruto = sueldoBasico * 1.20;
        double sueldoNeto = sueldoBruto * 0.90;

        System.out.println("Sueldo básico: " + sueldoBasico);
        System.out.println("Sueldo bruto: " + sueldoBruto);
        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}
