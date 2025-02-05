package mainColaPila;

import java.util.Scanner;
import clasesColaPila.ColaPersona;
import clasesColaPila.ColaPersonas;

/**
 * Clase principal que gestiona una aplicación de cola de personas.
 * Permite listar, ordenar, encolar, desencolar y eliminar personas de la cola.
 */
public class ColaPersonaAPP {

    /**
     * Método principal que ejecuta el programa y muestra un menú interactivo.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        
        // Scanner para entrada de usuario
        Scanner sc = new Scanner(System.in);

        // Cola de personas
        ColaPersonas pers = new ColaPersonas();

        // Variable para la opción del menú
        String menuOp = "0";
        final int TOPEOP = 7;

        // Bucle principal del menú
        while (Integer.parseInt(menuOp) != TOPEOP) {
            do {
                System.out.println("Opciones:");
                System.out.println("\t1. Listar personas.\n" 
                        + "\t2. Ordenar alfabeticamente.\n"
                        + "\t3. Encolar persona.\n" 
                        + "\t4. Desencolar persona.\n"
                        + "\t5. Eliminar una persona determinada.\n" 
                        + "\t6. Eliminar todos.\n" 
                        + "\t7. Salir.\n");
                menuOp = sc.nextLine();
            } while (Integer.parseInt(menuOp) > TOPEOP || Integer.parseInt(menuOp) <= 0);

            // Procesar opción seleccionada
            switch (Integer.parseInt(menuOp)) {
                case 1:
                    pers.listar();
                    break;
                case 2:
                    pers.ordenAlfabetico();
                    break;
                case 3:
                    ColaPersona p = rellenarColaPersona(sc);
                    pers.encolar(p);
                    break;
                case 4:
                    pers.desencolar();
                    break;
                case 5:
                    System.err.println("Dime los datos de la persona que vas a eliminar");
                    System.out.println("Nombre: ");
                    String gom = sc.nextLine();
                    System.out.println("Edad: ");
                    int edad = Integer.parseInt(sc.nextLine());
                    pers.eliminarPersona(edad, gom);
                    break;
                case 6:
                    pers.eliminarTodos();
                    break;
                case 7:
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
     * @return Objeto ColaPersona con los datos introducidos.
     */
    private static ColaPersona rellenarColaPersona(Scanner sc) {
        System.out.println("Dime los datos de la persona que quieres encolar");
        System.out.println("Nombre: ");
        String nom = sc.nextLine();
        System.out.println("Edad: ");
        int ed = Integer.parseInt(sc.nextLine());
        return new ColaPersona(ed, nom);
    }
}
