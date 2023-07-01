import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp
{
    public static void main(String[] args)
    {
        Scanner consola = new Scanner(System.in);

        // Variable de lista donde se guardaran las personas
        List<Persona> personas = new ArrayList<>();

        // Empezamo con la creacion de menu
        var salir = false;

        while (!salir){
            mostrarMenu();

            try
            {
                salir = ejecutarOperacion( consola, personas);
            }
            catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        }

    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas)
    {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        // Revisamos la opcion proporcionada
        switch (opcion){
            case 1 ->{ // Agregar personas a la lista
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var telefono = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();
                System.out.print("Proporciona la edad: ");
                var edad = Integer.parseInt(consola.nextLine());
                System.out.print("Proporciona el genero: ");
                var genero = consola.nextLine();

                // Creamo el objeto Persona usando las variables temporales
                var persona = new Persona(nombre, telefono, email, edad, genero);

                // Lo agregamos a la lista de personas
                personas.add(persona);
                System.out.println("La lista tiene: "+ personas.size() + "elementos");
            } // Fin del caso 1
            case 2 ->{ // Listar personas
                System.out.println("Listado de Personas");

                // Mejora usando lambda y metodos de referencia
                // personas.forEach((persona) -> System.out.println(persona));

                // Utilizando un metodo mas simple para imprimir el objeto
                personas.forEach(System.out::println);
            } // Fin caso 2
            case 3 -> { // Salimos del ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);

        } // fin switch

        return salir;
    }

    private static void mostrarMenu()
    {
        // Mostramo opcione del menu
        System.out.print("""
                ***** Listado de Personas *****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion que deseas: ");
    }
}
