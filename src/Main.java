import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Persona> personas =new ArrayList<>();
        personas.add(new Persona(15,"Jasinto","45678912"));
        personas.add(new Persona(18,"Juan","12345678"));
        personas.add(new Persona(14,"Carlos","34567891"));
        personas.add(new Persona(19,"Adrian","23456780"));
        Persona.mostrarArrayPersonas(personas);

        ///Ordenamiento
        personas.sort(null);

        //Collections.sort (personas);

        // Comparator<Persona> comparadorDni = (persona1, persona2) -> persona1.getDni().compareTo(persona2.getDni());
        // personas.sort(comparadorDni);

        System.out.println("Personas ordenadas");
        Persona.mostrarArrayPersonas(personas);

    }
}