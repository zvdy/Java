package formato;
import java.util.Scanner;
public class formato {
    public static void main(String[] args) {
        // Preguntamos a el usuario por una cantidad de pesetas 
        System.out.print("Introduce una cantidad de pesetas: ");
        Scanner sc = new Scanner(System.in);
        int pesetas = sc.nextInt();
        sc.close();
        // Convertimos las pesetas a euros
        double euros = pesetas / 166.386;
        System.out.println(pesetas + " pesetas son " + euros + " euros");  
        // Ahora devuelve el valor solo con dos decimales
        System.out.printf("%d pesetas son %.2f euros", pesetas, euros);
    }
}
