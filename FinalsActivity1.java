import java.util.Scanner;

public class FinalsActivity1 {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         System.out.println("CREATE YOUR ACCOUNT");
         System.out.println();

         System.out.println("PLEASE ENTER USERNAME:");
         String username = scn.nextLine();
    
         System.out.println("ENTER PASSWORD: ");
         String entered = scn.nextLine();
         String password;

         while (entered.equals(scn.nextLine())) {
            System.out.println("CONFIRM PASSWORD");
            System.out.println("ACCOUNT MADE SUCCESFUL!");
         }
         System.out.println("WRONG PASSWORD");
    }
}
