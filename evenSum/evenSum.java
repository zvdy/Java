package evenSum;

public class evenSum {
    public static void main(String[] args) {
        // We print the nums from 2 to 20 2 by 2 and we count the sum of them and the number of prints
        int sum = 0;
        int count = 0;
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
            sum += i;
            count++;
        }
        // We print the result
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        
    }
}
