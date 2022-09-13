package goodmorning;

public class goodmorning {
    public static void main(String[] args) {
    // We create time variable and print it out
    double time = 6.00;
    System.out.println("It is " + time + " o'clock.");

    // We create a if statement to check what time it is and depending on the time we give the user a different message
    if (time <= 12.00) {
        System.out.println("Good Morning");
    }
    else if (time <= 18.00) {
        System.out.println("Good Afternoon");
    }
    else {
        System.out.println("Good Evening");
    }
    }
}
