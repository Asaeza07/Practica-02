import java.util.Scanner;

public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int op;

        do {

            System.out.println("================= ¡Bienvenido al menu principal! ===============");
            System.out.println("Ingrese una de estas opciones:");
            System.out.println("1. Registrar nuevo prestamo.");
            System.out.println("2. Mostrar todos los prestamos.");
            System.out.println("3. Buscar prestamo por ID.");
            System.out.println("4. Actualizar su prestamo.");
            System.out.println("5. Eliminar un prestamo.");
            System.out.println("6. Calcular el total de multas.");
            System.out.println("7. Salir del menu.");

            op = sc.nextInt();

            switch(op){

                case 1 -> System.out.println("Registrar aqui el nuevo prestamo.");

                case 2 -> System.out.println("Mostrar todos los prestamos.");

                case 3 -> System.out.println("Consultar prestamo por ID.");

                case 4 -> System.out.println("Actualizar prestamo.");

                case 5 -> System.out.println("Eliminar prestamo.");

                case 6 -> System.out.println("Calcular el total de multas.");

                case 7 -> System.out.println("Saliendo...");

                default -> System.out.println("Error, ingrese un numero de 1 a 7 por favor.");
            }

        } while(op != 7);

    }
}