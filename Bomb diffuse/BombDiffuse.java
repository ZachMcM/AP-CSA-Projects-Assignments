//Your program should clearly ask for 4 inputs and then output the correct action to diffuse the bomb.

import java.util.Scanner;

class BombDiffuse {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean red;
    boolean blue;
    boolean star;
    boolean led;

    System.out.println("Please respond to the following questions with true or false");
    System.out.println("Does the wire have red coloring?");
    red = input.nextBoolean();
    System.out.println("Does the wire have blue coloring?");
    blue = input.nextBoolean();
    System.out.println("Does the wire have a star symbol?");
    star = input.nextBoolean();
    System.out.println("Is the LED on?");
    led = input.nextBoolean();

    if (red && blue && star && led)
    {
        System.out.println("Do not cut the wire!");
    }   
    else if (!red && !blue && !star && !led) 
    {
        System.out.println("NOT POSSIBLE LOOK AGAIN!");
    }
  }
}