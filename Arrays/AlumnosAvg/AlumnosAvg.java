package Arrays.AlumnosAvg;

import java.util.Scanner;

public class AlumnosAvg{
public static void cargaNotas(double n[][], String alumnos[]) {
Scanner tc= new Scanner(System.in);
int i = 0;
//Crear un vector con los nombres completos de cinco alumnos. Dichos nombres se introducirán en el momento de la declaración.
System.out.println("Carga de la matriz");
    //f de filas
    for (int f=0; f < n.length; f++) {
    //Realizar un método que cargue las tres notas de cada uno de los cinco alumnos. Indicando el nombre del alumno del cual se van a introducir sus notas. 
    System.out.println("Introduce las " + n[0].length + " notas del alumno " + (String)alumnos[i] + ": ");
    i++;
    //c de columnas
    for (int c=0; c < n[0].length; c++) {
        n[f][c] = tc.nextInt();
        }
    }
    System.out.println("Listo");
    System.out.println(" ");
tc.close();
}

public static void notaMedia (double n[][], String alumnos[]) {
    //Realizar un método que calcule la nota media de cada uno de los cinco alumnos. 
    double media = 0;
    int i = 0;
    for (int f=0; f < n.length; f++) {
        for (int c=0; c < n[0].length; c++) { // AQUI
            media = media + n[f][c];
        }
        media = media / n[0].length; // AQUI
        System.out.println("La nota media del alumno " + (String)alumnos[i] + " es: " + media);
        i++;
        media = 0;
    }
}

public static void main(String[] args) {
    //Crear una matriz con las notas de los cinco alumnos en tres módulos. Las notas podrán llevar decimales.
    String alumnos[] = {"Pepe", "Pedro", "Carlos", "Galindo", "Cristian"};
    double notas[][]= new double[5][3];

    cargaNotas(notas, alumnos);
    //Obtener la nota media de cada alumno, mostrando el resultado de la siguiente forma:
    notaMedia(notas, alumnos);
    }
}