import java.util.ArrayList;

public class Persona implements Comparable <Persona>{
    private int  edad;
    private String nombre;
    private String dni;

    public Persona(int edad, String nombre, String dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public int compareTo (Persona persona){
        //return this.dni.compareTo(persona.getDni());
        //return -1;
        return Integer.compare(this.edad,persona.edad);

    }

    /*
    @Override
    public int compareTo (){
        return Integer.compare(this.edad,persona.edad);
    }
    @Override
    public int compareTo (Object o){
        return Integer.compare(this.edad,persona.edad);
    }
    */

    public static void mostrarArrayPersonas (ArrayList<Persona>personas){
        for (Persona persona:personas){
            System.out.println(persona.toString());
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }
}
