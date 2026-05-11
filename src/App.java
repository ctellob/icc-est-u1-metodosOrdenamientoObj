import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] personas = {
                new Person("Juan", 25, new int[] { 10, 15, 20 }),
                new Person("Ana", 19, new int[] { 15, 15, 20 }),
                new Person("Carlos", 30, new int[] { 10, 10, 10 }),
                new Person("Maria", 22, new int[] { 20, 15, 20 }),
                new Person("Diego", 15, new int[] { 20, 10, 20 }),
        };

        // Imprime sin ordenamiento la edad
        System.out.println("\n----Sin ordenar---------");
        for (Person person : personas) {
            System.out.println(person);
        }
        System.out.println("---------------------------------");

        // ordenamiento de la edad
        PersonController personController = new PersonController();
        personController.sortPersonByAge(personas);
        System.out.println("\n----Procedo de ordenar---------");
        System.out.println("---------------------------------");

        // Imprimi ya ordenado la edad
        System.out.println("\n----Ordenado---------");
        for (Person person : personas) {
            System.out.println(person);
        }

        // ORDENA POR PROMEDIO
        personController.sortPersonByAvrNotas(personas);
        // IMPRIME ORDENADO POR PROMEDIO
        System.out.println("Personas ordenadas por promedio:");
        for (Person person : personas) {
            System.out.println(person);
        }

        // ORDENA POR VALOR DE NOMBRE
        System.out.println("Personas ordenadas por valor:");
        for (Person person : personas) {
            System.out.println(person);
        }
    }
}
