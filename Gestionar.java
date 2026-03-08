import java.util.ArrayList;
import java.util.Scanner;

public class Gestionar {

    static ArrayList<Prestamo> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void registrarPrestamo() {

        System.out.print("ID: ");
        int ID = sc.nextInt();
        sc.nextLine();

        System.out.print("Usuario: ");
        String Usuario = sc.nextLine();

        System.out.print("Dias: ");
        String Dias = sc.nextLine();

        System.out.print("DiasPrestamos: ");
        int DiasPrestamos = sc.nextInt();
        sc.nextLine();

        System.out.print("MultaporDia: ");
        double MultaporDia = sc.nextDouble();

        Prestamo nuevo = new Prestamo(ID, Usuario, Dias, DiasPrestamos, MultaporDia);
        prestamos.add(nuevo);

        System.out.println("Prestamo registrado correctamente.");
    }

    public static void mostrarPrestamos() {
        for (Prestamo p : prestamos) {
            p.mostrarPrestamo();
            System.out.println("----------------");
        }
    }
}