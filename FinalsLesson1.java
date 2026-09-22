import java.util.Scanner;

public class FinalsLesson1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("ENTER PASSWORD (5 DIGITS):");

        int pswd = scn.nextInt();
        if (pswd == 16621)
    {
        System.out.println("ACESS GRANTED!");    
    }
    else{
        System.out.println("WRONG PASSWORD!");
    }
        // int i = 1;
        // while (i < 5) {
        //   System.out.println(i);
        //   i++;
        // }
        // int i = 10;
        // while (i >= 0) {
        //     System.out.println(i);
        //     i--;   
        // }
        // System.out.println("HAPPY BIRTHDAY MADLANG PIPOL!");
    }
}

