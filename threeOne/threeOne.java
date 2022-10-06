package threeOne;
public class threeOne {
    public static void main(String[] args) {
        // Generate random number between 1 and 5 and count the number of times three and one is generated
        int one = 0, two = 0, three = 0, four = 0, five = 0;
        // When the count of 3 is the double of 1, stop the count
        while (three != one * 2 || three == 0 || one == 0) {
            int random = (int) (Math.random() * 5 + 1);
             System.out.println(random); // This might make it easier to see the pattern but it is not necessary and sometimes takes a lot of time to run
            switch (random) {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
            }
        }
        System.out.println("The number of 3 is " + three);
        System.out.println("The number of 1 is " + one);
        System.out.println("the number 3 is the double of 1!");
        System.out.println("The number of 2 is " + two);
        System.out.println("The number of 4 is " + four);
        System.out.println("The number of 5 is " + five);

    }
}
