package controllers;

import models.Person;

public class PersonController {

    // Metodo que ordena un arreglo de personas
    // por su EDAD (age), metodo insercion
    public void sortPersonByAge(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getEdad() > aux.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = aux;
        }
    }

    public void sortPersonByName(Person[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = aux;
        }
    }

    // Metodo ordena las personas segun el promedio de sus notas con seleccion
    public void sortPersonByAvrNotas(Person[] personas) {
        for (int i = 0; i < personas.length; i++) {
            int auxMenor = i;

            for (int j = i + 1; j < personas.length; j++) {
                // Comparacion para actualizar el indice (auxMenor)
                if (personas[j].getPromedio() < personas[auxMenor].getPromedio())
                    auxMenor = j;

            }
            // Pregunto si el auxMneor es diferente de i entocnes cambio de posiciones
            if (auxMenor != i) {
                Person aux = personas[i];
                personas[i] = personas[auxMenor];
                personas[auxMenor] = aux;
            }
        }
    }

    // Ordenar el arreglo de personas por un valor de su nombre
    // el valor del nombre sera la cantidad de letras donde las vocales
    // valen 5 y las consonantes vsalen el valor de la edad
    // -------------- EJEMPLO---------------------
    // Juan 20 años Ana 80
    // 20 + 5 + 20 = 50 5 + 80 + 5 = 90
    public void sortPersonByNameValue(Person[] personas) {
        for (int i = 0; i < personas.length; i++) {
            int auxMenor = i;

            for (int j = i + 1; j < personas.length; j++) {
                // Comparacion para actualizar el indice (auxMenor)
                if (personas[j].calcularValueName() < personas[auxMenor].calcularValueName())
                    auxMenor = j;

            }
            // Pregunto si el auxMneor es diferente de i entocnes cambio de posiciones
            if (auxMenor != i) {
                Person aux = personas[i];
                personas[i] = personas[auxMenor];
                personas[auxMenor] = aux;
            }
        }
    }
}
