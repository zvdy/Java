package joke;


public class joke {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
        if (i % 5 == 0 && i % 2 != 0) {
            System.out.println(i +" Agarramela que me crece");
        }
        else {
            System.out.println(i);
        }
        }
    }
}
