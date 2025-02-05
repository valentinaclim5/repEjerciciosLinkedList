package clasesColaPila;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Clase que representa una cola de personas.
 * Utiliza una LinkedList para almacenar las personas y proporciona métodos
 * para gestionar la cola.
 */
public class ColaPersonas {

    /** Lista enlazada que almacena los objetos de tipo ColaPersona */
    private LinkedList<ColaPersona> lista;

    /**
     * Constructor que inicializa la lista de personas.
     */
    public ColaPersonas() {
        lista = new LinkedList<ColaPersona>();
    }

    /**
     * Muestra la lista de personas en la cola.
     * Si la lista está vacía, indica que no hay personas en la cola.
     */
    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("No hay personas en la lista");
        } else {
            System.out.println(lista);
        }
    }

    /**
     * Encola una nueva persona al final de la cola.
     * 
     * @param per Persona a encolar.
     */
    public void encolar(ColaPersona per) {
        lista.addLast(per);
        System.out.println("Persona encolada: " + per);
    }

    /**
     * Desencola (elimina) la primera persona de la cola.
     */
    public void desencolar() {
        lista.pop();
    }

    /**
     * Elimina una persona específica de la cola según su edad y nombre.
     * 
     * @param ged Edad de la persona a eliminar.
     * @param gom Nombre de la persona a eliminar.
     */
    public void eliminarPersona(int ged, String gom) {
        Iterator<ColaPersona> iterator = lista.iterator();
        while (iterator.hasNext()) {
            ColaPersona nueva = iterator.next();
            if (nueva.getEdad() == ged && nueva.getName().equals(gom)) {
                iterator.remove();
                System.out.println("Persona eliminada de la pila");
                return;
            }
        }
        System.out.println("No se encontró ninguna persona con ese nombre y edad.");
    }

    /**
     * Elimina todas las personas de la cola.
     */
    public void eliminarTodos() {
        lista.removeAll(lista);
        System.out.println("Se eliminó toda la pila");
    }

    /**
     * Ordena alfabéticamente la cola de personas según su nombre.
     * Luego, imprime la lista ordenada.
     */
    public void ordenAlfabetico() {
        Collections.sort(lista);
        System.out.println("📌 Lista ordenada alfabéticamente:");
        for (ColaPersona p : lista) {
            System.out.println(p);
        }
    }
}
