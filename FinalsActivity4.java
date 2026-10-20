import java.util.Scanner;

public class FinalsActivity4 {
    public static void main(String[] args) {

        //int[] numbers = new int[5];

        Scanner scn = new Scanner(System.in);

        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print("ENTER A NUMBER FOR INDEX " + i + " :");
        //     numbers[i] = scn.nextInt();

        // }
        
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println("INDEX" + i + " = " + numbers[i]);

        // }
        
        //INPUT QUIZ SCORES
        int[] quizScores = new int[10];
        int in = 0;
        for (int i = 0; i < quizScores.length; i++){
            in++;
            System.out.print("ENTER QUIZ " + in + " Score: " );
            quizScores[i] = scn.nextInt();
        }

        //QUIZ SCORES
        System.out.println();
        System.out.println("QUIZ SCORES:");
        int out = 0;
        for (int i = 0; i < quizScores.length; i++){
            out++;
            System.out.println("QUIZ " + out + ": " + quizScores[i]);
        }

        //TOTAL & AVERAGE
        System.out.println();
        int totalScore = 0;
        for (int i = 0; i < quizScores.length; i++){
            totalScore += quizScores[i];
        }
        System.out.println("TOTAL SCORE: " + totalScore);
       
        double averageScore = (double) totalScore / quizScores.length;
        System.out.println("AVERAGE SCORE: " + averageScore);
        
        scn.close();
    }
}


