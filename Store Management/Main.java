import java.util.Scanner;

public class MyConsole {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //array of objects
    Product[] productList = new Product[4];
    
    //products (objects)
    Shirt kobeTee = new Shirt("Kobe Graphic Tee", 45, "Nike", "Yellow", "M", true);
    Shirt uscTee = new Shirt("USC Workout Shirt", 20, "Jordan", "Maroon", "L", false);
    Shoe fluGame = new Shoe("Joran 12 Flu Game", 250, "Jordan", "Red/Black", 12.5, "streetwear");
    Shoe kobeGrinch = new Shoe("Kobe 6 Grinch", 650, "Nike", "Green", 12, "basketball");    
    
    productList[0] = kobeTee;
    productList[1] = uscTee;
    productList[2] = fluGame;
    productList[3] = kobeGrinch;

    //main loop asking for customer interaction
    int loopCount = 0;
    int userInput = 0;
    System.out.println(" ");
    System.out.println("Welcome to the store!");
    System.out.println("Respond to the following prompts. Type -1 if you want to quit");
    while (userInput != -1) {
      if (loopCount == 0) {
        System.out.println("What product would you like to take a look at?");
      } else {
        System.out.println(" ");
        System.out.println("Would you like to keep looking?");
        System.out.println("Type 1 for yes, -1 for no");
        System.out.println(" ");
        userInput = input.nextInt();
        if (userInput == -1) {
          return;
        }
        System.out.println(" ");
        System.out.println("What product would you like to take a look at?");
      }
      loopCount++;
      System.out.println("Type the number associated with the product you want to look at");
      System.out.println(" ");
      for (int i = 0; i < productList.length; i++) {
        System.out.println(i + ": " + productList[i].getName());
        System.out.println(" ");
      }
      userInput = input.nextInt();
      if (userInput != -1) {
        int selectedIndex = userInput;
        System.out.println(" ");
        System.out.println(productList[selectedIndex]);
        System.out.println(" ");
        System.out.println("Would you like to buy this product?");
        System.out.println("Type 1 for yes, 2 for no, -1 to quit");
        System.out.println(" ");     
        userInput = input.nextInt();
        if (userInput == 1) {
          System.out.println(" ");
          System.out.println("Would you like to negotiate the price?");
          System.out.println("Type 1 for yes, 2 for no, -1 to quit");
          System.out.println(" ");
          userInput = input.nextInt();
          if (userInput == 1) {
            System.out.println(" ");
            System.out.println("What is your offer?");
            System.out.println(" ");
            userInput = input.nextInt();
            if (productList[selectedIndex].negotiatePrice(userInput)) {
              System.out.println(" ");
              System.out.println("We accept your offer!");
              System.out.println("You bought " + productList[selectedIndex].getName() + " for " + productList[selectedIndex].getPrice());
              System.out.println(" ");
            } else {
              System.out.println(" ");
              System.out.println("Unfortunately we cannot accept your offer");
              System.out.println("Would you still like to purchase the " + productList[selectedIndex].getName() + "?");
              System.out.println("Type 1 for yes, 2 for no, -1 to quit");
              System.out.println(" ");
              userInput = input.nextInt();
              if (userInput == 1) {
                System.out.println(" ");
                System.out.println("You bought " + productList[selectedIndex].getName() + " for " + productList[selectedIndex].getPrice());
                System.out.println(" ");                
              } else if (userInput == 2) {
                System.out.println(" ");
                System.out.println("We are very sorry to hear that!");
                System.out.println(" ");
              }
            }
          } else if (userInput == 2) {
            System.out.println(" ");
            System.out.println("You bought " + productList[selectedIndex].getName() + " for " + productList[selectedIndex].getPrice());
            System.out.println(" ");
          }
        }
      }
    }
  }
}