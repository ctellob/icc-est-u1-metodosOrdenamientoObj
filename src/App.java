import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] personas = {
                new Person("Juan", 25),
                new Person("Ana", 19),
                new Person("Carlos", 30),
                new Person("Maria", 22),
                new Person("Diego", 15),
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
    }
}
