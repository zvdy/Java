package multiplication;
import java.io.*;
public class multiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // HackerRank Java Loops I
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for( int i = 1; i <= 10; i++ ) {
                    System.out.println( N + " x " + i + " = " + N*i);
        bufferedReader.close();
        }
    }
}
