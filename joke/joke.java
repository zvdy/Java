package joke;


public class joke {
    public static void main(String[] args) {
        // we do a for loop to iterate from 1 to 100
        for (int i = 1; i <= 100; i++) {
        // We create a if statement to return a print if i 
        // is divisible only by 5 so we can output a rhyme
            if (i % 5 == 0 && i % 2 != 0) {
            System.out.println(i +" Agarramela que me crece");
        }
        // we print the rest of the numbers
        else {
            System.out.println(i);
        }
        }
    }
}
