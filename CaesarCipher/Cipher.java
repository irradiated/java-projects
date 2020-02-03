import java.util.*;

public class Cipher {
    public static void main(String[] args) {
        String mode;
        char[] message;
        int key;

        Cipher cipher = new Cipher();
        mode = cipher.getMode();
        message = cipher.getMessage();
        key = cipher.getKey();

        System.out.print("Your translated message is: \n");
        System.out.println(cipher.translate(mode, message, key));

    }

    Scanner scan = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    String mode = "";
    String translated = "";
    int key;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    char[] message;
    final int MAX_LEN = alphabet.length;

    public Cipher() { }

    public String getMode() {
        while (true) {
            System.out.print("Do you wish to encrypt or decrypt a message? ");
            mode = (scan.nextLine()).toLowerCase();
            switch (mode) {
                case "encrypt":
                    return mode;
                case "e":
                    return mode;
                case "decrypt":
                    return mode;
                case "d":
                    return mode;
                default: 
                    System.out.println("Enter either 'encrypt' or 'e' or 'decrypt' or 'd'.");
            }
        }
    }

    public char[] getMessage() {
        System.out.print("Enter your message: ");
        String input = scan.nextLine();
        message = input.toCharArray();
        return message;
    }

    public int getKey() {
        key = 0;
        while (true) {
            System.out.print(String.format("Enter the key number (1-%d): ", MAX_LEN));
            key = scan.nextInt();
            if (key >= 1 && key <= MAX_LEN) { return key; }
            else { System.out.println(String.format("The key must be between 1 and %d.", MAX_LEN)); }
        }
    }

    public String translate(String mode, char[] message, int key) {
        if (mode.charAt(0) == 'd') { key = -key; }

        for (int i = 0; i < message.length; i++) {
            message[i] = (char)(message[i] + key);
        }

        for (char ch: message) {
            sb.append(ch);
        }

        return sb.toString();
    }
}