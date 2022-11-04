package notas;
import java.util.Scanner;
public class notas {
    public static void main(String[] args) {
        // Introduciremos notas de varios alumnos hasta teclear -1. 
        // El programa mostrará la media de todas las notas y el número de suspensos
        int notas;
        int numSuspensos;
        int sumaNotas;
        int contador;
        contador = 0;
        numSuspensos = 0;
        sumaNotas = 0;
        notas = 0;
        // Preguntamos nota hasta que se introduzca -1, contamos el número de suspensos, la
        // cantidad de notas introducidas y la media de todas las notas
        while (notas != -1) {
            System.out.println("Introduzca nota: ");
            Scanner teclado = new Scanner(System.in);
            notas = teclado.nextInt();
            contador = contador+1;
            if (notas < 5 && notas != -1) {
                numSuspensos++;
            }
            if (notas != -1) {
                sumaNotas = sumaNotas + notas;
            }
        }
        System.out.println("Los suspensos son: " + numSuspensos);
        System.out.println("El número de notas introducidas es: " + contador);
        System.out.println("La media de las notas es " + sumaNotas / (contador - 1));
        
        
    }
}

