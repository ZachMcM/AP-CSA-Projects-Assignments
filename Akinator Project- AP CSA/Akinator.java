
/**
 * Write a description of class Main here.
 *
 * Zach McMullen and Zach Patterson-Castaneda
 * August 26th, 2022
 */


import java.util.Scanner;

class Akinator {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please choose you favorite streaming service and I will guess it");
    System.out.println("Does your streaming service stream sports or music?");
    String userAnswer = input.nextLine();
    while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
    {
        System.out.println("Invalid option, please choose yes or no.");
        userAnswer = input.nextLine();
    }
    //questions about sports and music
    if (userAnswer.equals("yes"))
    {
         System.out.println("Does your streaming service stream music?");
         userAnswer = input.nextLine();
         while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
         {
             System.out.println("Invalid option, please choose yes or no.");
             userAnswer = input.nextLine();
        }
        //questions about music
        if (userAnswer.equals("yes")) 
        {
            System.out.println("Is your streaming service made by Google or Apple?");
            userAnswer = input.nextLine();
            while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
            {
                System.out.println("Invalid option, please choose yes or no.");
                userAnswer = input.nextLine();
            }
            if (userAnswer.equals("yes")) 
            {
               System.out.println("Is your streaming service made by Google?");
               userAnswer = input.nextLine();
               while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
               {
                   System.out.println("Invalid option, please choose yes or no.");
                   userAnswer = input.nextLine();
                }
                if (userAnswer.equals("yes"))
                {
                    System.out.println("You're thinking of YouTube Music");
                }    
               else 
                {
                    System.out.println("You're thinking of Apple Music");
                }
            }
            else
            {
                System.out.println("Is you're streaming service owned by Amazon?");
                userAnswer = input.nextLine();
                while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
                {
                   System.out.println("Invalid option, please choose yes or no.");
                   userAnswer = input.nextLine();
                }
                if (userAnswer.equals("yes"))
                {
                    System.out.println("You're thinking of Amazon Music");
                }
                else {
                    System.out.println("You're thinking of Spotify");
                }
            }
        }
        //questions about sports
        else
        {
            //streaming services that offer sports and start with a p
            System.out.println("Does your service start with a P");
            userAnswer = input.nextLine();
            while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
            {
              System.out.println("Invalid option, please choose yes or no.");
              userAnswer = input.nextLine();
            }
            if (userAnswer.equals("yes"))
            {
                System.out.println("Does your streaming service have The Office?");
                userAnswer = input.nextLine();
                while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
                {
                  System.out.println("Invalid option, please choose yes or no.");
                  userAnswer = input.nextLine();
                }
                if (userAnswer.equals("yes"))
                {
                  System.out.println("You are thinking of Peacock");  
                } 
                else
                {
                    System.out.println("Does your streaming service have The Boys?");
                    userAnswer = input.nextLine();
                    while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
                    {
                      System.out.println("Invalid option, please choose yes or no.");
                      userAnswer = input.nextLine();
                    }
                    if (userAnswer.equals("yes")) 
                    {
                        System.out.println("You are thinking of Prime Video");
                    }
                    else {
                        System.out.println("You are thinking of Paramount+");
                    }
                }
            }
            else { 
                System.out.println("Does your service only offer sports content?");
                userAnswer = input.nextLine();
                while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
                {
                    System.out.println("Invalid option, please choose yes or no.");
                    userAnswer = input.nextLine();
                }
                if (userAnswer.equals("yes"))
                {
                    System.out.println("Does your streaming service only offer one sport?");
                    userAnswer = input.nextLine();
                    while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
                    {
                        System.out.println("Invalid option, please choose yes or no.");
                        userAnswer = input.nextLine();
                    }
                    if (userAnswer.equals("yes"))
                    {
                        System.out.println("Does your streaming service have basketball?");
                        userAnswer = input.nextLine();
                        while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
                        {
                            System.out.println("Invalid option, please choose yes or no.");
                            userAnswer = input.nextLine();
                        }
                        if (userAnswer.equals("yes"))
                        {
                            System.out.println("You are thinking of NBA TV");
                        }
                        else 
                        {
                            System.out.println("Does your streaming service has baseball?");
                            userAnswer = input.nextLine();
                            while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
                            {
                                System.out.println("Invalid option, please choose yes or no.");
                                userAnswer = input.nextLine();
                            }
                            if (userAnswer.equals("yes"))
                            {
                                System.out.println("You are thinking of MLB Live");
                            }
                            else {
                                System.out.println("You are thinking of NFL+");
                            }
                        }
                    } else {
                        System.out.println("You are thinking of ESPN+");
                    }                        
                }    
                else {
                    System.out.println("Is your streaming service owned by Google?");
                    userAnswer = input.nextLine();
                    while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
                    {
                      System.out.println("Invalid option, please choose yes or no.");
                      userAnswer = input.nextLine();
                    }
                    if (userAnswer.equals("yes"))
                    {
                        System.out.println("You are thinking of Youtube TV");
                    } else {
                        System.out.println("You are thinking of Hulu");
                    }
                }                           
            }
        }
    }
    //tv and movie only streaming services
    else
    {
       System.out.println("Does your streaming service offer both Marvel and DC?");
       userAnswer = input.nextLine();
       while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
       {
        System.out.println("Invalid option, please choose yes or no.");
        userAnswer = input.nextLine();
       }
       if (userAnswer.equals("yes"))
       {
        System.out.println("You are thinking of Netflix");
       }
       else {
        System.out.println("Does your streaming service have MCU movies?");
        userAnswer = input.nextLine();
        while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
        {
         System.out.println("Invalid option, please choose yes or no.");
         userAnswer = input.nextLine();
        }
        if (userAnswer.equals("yes"))
        {
            System.out.println("You are thinking of Disney+");
        } 
        else {
            System.out.println("Does your streaming service have DC Content?");
            userAnswer = input.nextLine();
            while(!(userAnswer.equals("yes") ||userAnswer.equals("no")))
            {
             System.out.println("Invalid option, please choose yes or no.");
             userAnswer = input.nextLine();
            }
            if (userAnswer.equals("yes"))
            {
                System.out.println("You are thinking of HBOMax");
            }
            else {
                System.out.println("You are thinking of Apple TV");
            }
        }
       }
    }
    }
}

