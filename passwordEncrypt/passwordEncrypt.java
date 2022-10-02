package passwordEncrypt;

public class passwordEncrypt {
    public static void main(String[] args) {
        // Ask user for a password
        System.out.println("Enter a password: ");
        String password = System.console().readLine();
        // Encrypt the password
        String encrypted = "";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            c = (char) (c + 2 - (i + 1) -2);
            encrypted = encrypted + c;
        }
        // Print the encrypted password
        System.out.println("Encrypted password: " + encrypted);
    }
}