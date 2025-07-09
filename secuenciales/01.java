import java.util.Scanner;

public class 01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Varones: ");
        int varones = scanner.nextInt();

        System.out.print("Mujeres: ");
        int mujeres = scanner.nextInt();

        int total = varones + mujeres;
        double porcentajeVarones = (varones * 100.0) / total;
        double porcentajeMujeres = (mujeres * 100.0) / total;

        System.out.println("Porcentaje de varones: " + porcentajeVarones + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
    }

}
