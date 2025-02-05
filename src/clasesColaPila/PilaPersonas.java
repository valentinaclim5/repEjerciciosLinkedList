package clasesColaPila;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Clase que representa una pila de personas.
 * Utiliza una {@code LinkedList} para gestionar las personas en una estructura LIFO (Last In, First Out).
 */
public class PilaPersonas {
    
    /** Lista enlazada que almacena los objetos de tipo {@code PilaPersona}. */
    private LinkedList<PilaPersona> lista;

    /**
     * Constructor que inicializa la lista de personas.
     */
    public PilaPersonas() {
        lista = new LinkedList<PilaPersona>();
    }
        
    /**
     * Muestra la lista de personas en la pila.
     * Si la lista está vacía, indica que no hay personas en la pila.
     */
    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("No hay personas en la lista");
        } else {
            System.out.println(lista);
        }
    }

    /**
     * Apila una nueva persona en la pila.
     * 
     * @param per Persona a apilar.
     */
    public void apilar(PilaPersona per) {
        lista.push(per);
        System.out.println("Persona apilada: " + per);
    }

    /**
     * Desapila (elimina) la última persona que ingresó en la pila.
     */
    public void desapilar() {
        lista.pop();
    }

    /**
     * Elimina una persona específica de la pila según su edad y nombre.
     * 
     * @param edad Edad de la persona a eliminar.
     * @param nombre Nombre de la persona a eliminar.
     */
    public void eliminarPersona(int edad, String nombre) {
        Iterator<PilaPersona> iterator = lista.iterator();
        while (iterator.hasNext()) {
            PilaPersona nueva = iterator.next();
            if(nueva.getEdad() == edad && nueva.getName().equals(nombre)) {
                iterator.remove();
                System.out.println("Persona eliminada de la pila");
                return;
            }
        }
        System.out.println("No se encontró ninguna persona con ese nombre y edad.");
    }

    /**
     * Elimina todas las personas de la pila.
     */
    public void eliminarTodos() {
        lista.clear();
        System.out.println("Se eliminó toda la pila");
    }
}
