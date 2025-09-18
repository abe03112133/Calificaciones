package com.tecm.calificaciones;
/**
 *
 * @author g_mdz
 */
public class Participante {

    // Atributos
    private String nombre;
    private int[] calificaciones; // almacena 5 valores numéricos

    // Constructor
    public Participante(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método que calcula el promedio
    public double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int cal : calificaciones) {
            suma += cal;
        }
        return (double) suma / calificaciones.length;
    }

    // Método que obtiene la calificación final en letra
    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) return 'F';
        else if (promedio <= 60) return 'E';
        else if (promedio <= 70) return 'D';
        else if (promedio <= 80) return 'C';
        else if (promedio <= 90) return 'B';
        else return 'A';
    }

    // Método que imprime los resultados
    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public static void main(String[] args) {
        
        int[] calif = {85, 90, 88, 92, 87}; // ejemplo de calificaciones
        Participante p = new Participante("Juan Perez", calif);

        double promedio = p.calcularPromedio(calif);
        char cFinal = p.obtenerCalificacion(promedio);

        p.imprimirResultados(p.nombre, promedio, cFinal);
        
    }
}
