package threeOne;
public class threeOne {
    public static void main(String[] args) {
        // Generate random number between 1 and 5 and count the number of times three and one is generated
        int three = 1;
        int one = 0;
        // When the count of 3 is the double of 1, stop the count
        while (three != one * 2) {
            int random = (int) (Math.random() * 5 + 1);
            // System.out.println(random); // This might make it easier to see the pattern but it is not necessary and sometimes takes a lot of time to run
            if (random == 3) {
                three++;
            } else if (random == 1) {
                one++;
            }
        }
        System.out.println("The number of 3 is " + three);
        System.out.println("The number of 1 is " + one);

    }
}
