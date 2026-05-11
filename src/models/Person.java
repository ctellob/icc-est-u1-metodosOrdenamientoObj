package models;

public class Person {
    private String name;
    private int edad;
    private int[] notas;

    public Person(String name, int edad, int[] notas) {
        this.name = name;
        this.edad = edad;
        this.notas = notas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", edad=" + edad + " promedio= " + getPromedio() + " valor= "
                + calcularValueName() + "]";
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int getPromedio() {
        // Calcular el promedio, Sumo todas las notas) / las divido para la cant d notas
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return sum / notas.length;
    }

    public int calcularValueName() {
        int value = 0;
        for (int i = 0; i < name.length(); i++) {
            char letra = name.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
                value += 5;
            else if (letra != ' ')
                value += this.edad;
        }

        return value;
    }

}
