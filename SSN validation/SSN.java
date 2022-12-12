import java.util.Scanner;

class SSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a SSN that follows the format: DDD-DD-DDDD where D is a digit");
        String userSSN = input.nextLine();
        if (userSSN.length() != 11) {
            System.out.println("Invalid SSN!");
        } else {
            for (int i = 0; i < 11; i++) {
                if ((i != 3) && (i != 6)) {
                    checkForDigit(userSSN.substring(i, i + 1));
                } else {
                    checkForDashes(userSSN.substring(i, i + 1));
                }
            }
            System.out.println("Valid SSN!");
        }
    }

    public static void checkForDigit(String possibleDigit) {
        for (int i = 0; i <= 9; i++) {
            if (Integer.toString(i).equals(possibleDigit)) {
                return;
            }
        }
        System.out.println("Invalid SSN!");
        System.exit(0);
    }

    public static void checkForDashes(String possibleDash) {
        if ((possibleDash.equals("-"))) {
            return;
        } else {
            System.out.println("Invalid SSN!");
            System.exit(0);
        }
    }
}