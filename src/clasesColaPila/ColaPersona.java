package clasesColaPila;

/**
 * Clase que representa una persona en una cola.
 * Implementa la interfaz Comparable para permitir ordenar las personas por nombre.
 */
public class ColaPersona implements Comparable<ColaPersona> {

    /** Edad de la persona */
    private int edad;

    /** Nombre de la persona */
    private String name;

    /**
     * Constructor con parámetros.
     * 
     * @param num Edad de la persona.
     * @param ed  Nombre de la persona.
     */
    public ColaPersona(int num, String ed) {
        this.edad = num;
        this.name = ed;
    }

    /**
     * Constructor vacío.
     */
    public ColaPersona() {
    }

    /**
     * Obtiene la edad de la persona.
     * 
     * @return Edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     * 
     * @param edad Nueva edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return Nombre de la persona.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la persona.
     * 
     * @param name Nuevo nombre de la persona.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve una representación en cadena de la persona.
     * 
     * @return Cadena con el nombre y la edad de la persona.
     */
    @Override
    public String toString() {
        return name + "[edad=" + edad + ", name=" + name + "]";
    }

    /**
     * Compara esta persona con otra en base a su nombre.
     * 
     * @param o Otra persona con la que se comparará.
     * @return Un valor negativo si esta persona es menor, 
     *         cero si son iguales, o un valor positivo si esta persona es mayor.
     */
    @Override
    public int compareTo(ColaPersona o) {
        return this.name.compareTo(o.getName());
    }

}
