package mainColaPila;

import java.util.Scanner;
import clasesColaPila.PilaPersona;
import clasesColaPila.PilaPersonas;

/**
 * Clase principal que gestiona una aplicación de pila de personas.
 * Permite listar, apilar, desapilar y eliminar personas de la pila.
 */
public class PilaPersonaAPP {

    /**
     * Método principal que ejecuta el programa y muestra un menú interactivo.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Scanner para entrada de usuario
        Scanner sc = new Scanner(System.in);

        // Pila de personas
        PilaPersonas pers = new PilaPersonas();

        // Variable para la opción del menú
        String menuOp = "0";
        final int TOPEOP = 6;

        // Bucle principal del menú
        while (Integer.parseInt(menuOp) != TOPEOP) {
            do {
                System.out.println("Opciones:");
                System.out.println("\t1. Listar personas.\n" 
                        + "\t2. Apilar persona.\n" 
                        + "\t3. Desapilar persona.\n"
                        + "\t4. Eliminar una persona determinada.\n" 
                        + "\t5. Eliminar todos.\n" 
                        + "\t6. Salir.\n");
                menuOp = sc.nextLine();
            } while (Integer.parseInt(menuOp) > TOPEOP || Integer.parseInt(menuOp) <= 0);

            // Procesar opción seleccionada
            switch (Integer.parseInt(menuOp)) {
                case 1:
                    pers.listar();
                    break;
                case 2:
                    PilaPersona p = rellenarPilaPersona(sc);
                    pers.apilar(p);
                    break;
                case 3:
                    pers.desapilar();
                    break;
                case 4:
                    System.err.println("Dime los datos de la persona que vas a eliminar");
                    System.out.println("Nombre: ");
                    String gom = sc.nextLine();
                    System.out.println("Edad: ");
                    int ged = Integer.parseInt(sc.nextLine());
                    pers.eliminarPersona(ged, gom);
                    break;
                case 5:
                    pers.eliminarTodos();
                    break;
                case 6:
                    System.out.println("El programa ha acabado");
                    break;
            }
        }

        // Cerrar el Scanner
        sc.close();
    }

    /**
     * Método que solicita los datos de una persona al usuario y la crea.
     *
     * @param sc Scanner para la entrada del usuario.
     * @return Objeto PilaPersona con los datos introducidos.
     */
    private static PilaPersona rellenarPilaPersona(Scanner sc) {
        System.out.println("Dime los datos de la persona que quieres apilar");
        System.out.println("Nombre: ");
        String nom = sc.nextLine();
        System.out.println("Edad: ");
        int ed = Integer.parseInt(sc.nextLine());
        return new PilaPersona(ed, nom);
    }
}
