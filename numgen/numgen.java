package numgen;

public class numgen {

    // method to generate a random number
    
    public static int n1(int min, int max) {
        int range = max - min + 1;
        int random = (int) (Math.random() * range) + min;
        return random;
    }

    //method to generate a random number different from n1

    public static int n2(int min, int max, int n1) {
        int range = max - min + 1;
        int random = (int) (Math.random() * range) + min;
        while (random == n1) {
            random = (int) (Math.random() * range) + min;
        }
        return random;
    }

    // method to generate a random number different from n1 and n2

    public static int n3(int min, int max, int n1, int n2) {
        int range = max - min + 1;
        int random = (int) (Math.random() * range) + min;
        while (random == n1 || random == n2) {
            random = (int) (Math.random() * range) + min;
        }
        return random;
    }

    //main

    public static void main(String[] args) {
        int n1 = n1(1, 5);
        int n2 = n2(1, 5, n1);
        int n3 = n3(1, 5, n1, n2);
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        System.out.println("n3: " + n3);
    }

}
