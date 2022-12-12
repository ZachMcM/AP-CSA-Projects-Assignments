import java.util.Scanner;

class SSNv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a SSN that follows the format: DDD-DD-DDDD where D is a digit");
        String userSSN = input.nextLine();
        if (userSSN.length() != 11) {
            System.out.println("Invalid SSN!");
        } else {
            for (int i = 0; i < 11; i++) {
                if ((i != 3) && (i != 6)) {
                    if (!(checkForDigit(userSSN.substring(i, i + 1)))) {
                        System.out.println("Invalid SSN!");
                        return;
                    }
                } else {
                    if (!checkForDashes(userSSN.substring(i, i + 1))) {
                        System.out.println("Invalid SSN!");
                        return;
                    }
                }
            }
            System.out.println("Valid SSN!");
        }
    }

    public static boolean checkForDigit(String possibleDigit) {
        for (int i = 0; i <= 9; i++) {
            if (Integer.toString(i).equals(possibleDigit)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkForDashes(String possibleDash) {
        if ((possibleDash.equals("-"))) {
            return true;
        } else {
            return false;
        }
    }
}