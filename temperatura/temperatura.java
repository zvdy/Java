package temperatura;
import java.util.Scanner;

public class temperatura {
    
    // Array de los doce meses del año
    static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    // Scanner
    static Scanner teclado = new Scanner(System.in);

    //Método Cargar por teclado las temperaturas máxima de los doce meses del año y almacenarlos en un array
    public static int[] cargarTemperaturas(){
        int[] temperaturas = new int[12];
        for(int i=0; i<12; i++){
            System.out.println("Introduce la temperatura máxima del mes de " + meses[i]);
            temperaturas[i] = teclado.nextInt();
            System.out.println("");
        }
        return temperaturas;
    }


    //Método Cargar por teclado las Tºs mínimas de los doce meses del año y almacenar en otro array
    public static int[] cargarTemperaturasMin(){
        int[] temperaturasMin = new int[12];
        for(int i=0; i<12; i++){
            System.out.println("Introduce la temperatura mínima del mes de " + meses[i]);
            temperaturasMin[i] = teclado.nextInt();
            System.out.println("");
        }
        return temperaturasMin;
    }


    // Método para visualizar las temperaturas máximas y minimas de cada mes del año mediante un for loop
    public static void visualizarTemperaturas(int[] temperaturas, int[] temperaturasMin){
        for(int i=0; i<12; i++){
            System.out.println("La temperatura máxima del mes de " + meses[i] + " es " + temperaturas[i] + "ºC");
            System.out.println("La temperatura mínima del mes de " + meses[i] + " es " + temperaturasMin[i] + "ºC");
            System.out.println("----------------------------------------------------------");
        }
    }


    //Método para visualizar el mes con temperatura mínima más baja
    public static void mesTemperaturaMinima(int[] temperaturasMin){
        int mes = 0;
        int temperaturaMinima = temperaturasMin[0];
        for(int i=0; i<12; i++){
            if(temperaturasMin[i] < temperaturaMinima){
                temperaturaMinima = temperaturasMin[i];
                mes = i;
            }
        }
        System.out.println("El mes con la temperatura mínima más baja es " + meses[mes] + " con " + temperaturaMinima + "ºC");
        System.out.println("----------------------------------------------------------");
    }


    //Método para visualizar el mes con temperatura mínima más alta
    public static void mesTemperaturaMaxima(int[] temperaturas){
        int mes = 0;
        int temperaturaMaxima = temperaturas[0];
        for(int i=0; i<12; i++){
            if(temperaturas[i] > temperaturaMaxima){
                temperaturaMaxima = temperaturas[i];
                mes = i;
            }
        }
        System.out.println("El mes con la temperatura máxima más alta es " + meses[mes] + " con " + temperaturaMaxima + "ºC");
    }

    // Main 
    public static void main(String[] args) {
        int[] temperaturas = cargarTemperaturas();
        int[] temperaturasMin = cargarTemperaturasMin();
        visualizarTemperaturas(temperaturas, temperaturasMin);
        mesTemperaturaMinima(temperaturasMin);
        mesTemperaturaMaxima(temperaturas);
    }
}
