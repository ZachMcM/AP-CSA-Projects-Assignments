import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Management System!");
        System.out.println("Enter The Following Numbers To Trigger An Action");
        System.out.println("1 To ddd a new product \n2 To edit an existing product \n3 To process an order \n4 To add a new Customer \n0 To end the program");
        if (input.nextInt() == 1) {
            System.out.println("Press 1 to add a shoe \nPress 2 to add new clothing");
        }
    }
}