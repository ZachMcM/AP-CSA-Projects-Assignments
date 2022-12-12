import java.util.Scanner;

class TestScores {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("How many scores would you like to report?");
    int numScores = input.nextInt();
    
    double[] scoresArr = new double[numScores];
    
    System.out.println("Please enter your scores");
    for (int i = 0; i < scoresArr.length; i++) {
      scoresArr[i] = input.nextDouble();
    }

    double sum = 0;
    for (double score : scoresArr) {
        sum = sum + score;
    }
    double avg = sum / scoresArr.length;
      
    int numAbove = 0;
    int numEqual = 0;
    int numBelow = 0;
    for (double score : scoresArr) {
       if (score > avg) {
         numAbove++;
       }
      else if (score == avg) {
         numEqual++;
       }
      else if (score < avg) {
        numBelow++;
      }
    }

    System.out.println("Number of Scores Above Average: " + numAbove);
    System.out.println("Number of Scores Equal to Average: " + numEqual);
    System.out.println("Number of Scores Below Average: " + numBelow);
  }
}