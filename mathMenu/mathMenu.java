package mathMenu;
import java.util.Scanner;

public class mathMenu {
    

    public static Scanner teclado = new Scanner(System.in);
    // Crearemos los metodos de main
    // Metodo para preguntar por un número entre 1-10
    public static int dimeNumero() {
        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();
        while (num < 1 || num > 10) {
            System.out.println("Introduce un número entre 1 y 10: ");
            num = teclado.nextInt();
        }
        return num;
    }

    // Método para decir si num es par o impar
    public static void dimeParimpar(int num) {
        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    } 

    // Método para calcular el cuadrado de num
    public static int ElevaCuadrado(int num) {
        num = (num * num);
        return num;
    }

    // Método para mostrar la tabla de multiplicar de nums
    public static void muestraTablaMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        int num, cuadrado;
        num = dimeNumero();
        dimeParimpar(num);
        cuadrado = ElevaCuadrado(num);
        System.out.println("El cuadrado de " + num + " es " + cuadrado);
        muestraTablaMultiplicar(num);
        teclado.close();
    }
}
