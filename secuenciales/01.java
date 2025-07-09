import java.util.Scanner;

public class 01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Varones: ");
        int varones = scanner.nextInt();

        System.out.print("Mujeres: ");
        int mujeres = scanner.nextInt();

        // Aquí puedes hacer algo con los datos, por ejemplo:
        int total = varones + mujeres;
        System.out.println("Total de estudiantes: " + total);
    }

}

