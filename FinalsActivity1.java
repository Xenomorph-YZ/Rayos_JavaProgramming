import java.util.Scanner;

public class FinalsActivity1 {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         System.out.println("===========CREATE YOUR ACCOUNT===========");
         System.out.println();

         System.out.println("PLEASE ENTER USERNAME:");
         String username = scn.nextLine();
    
         System.out.println("PLEASE ENTER PASSWORD: ");
         String pInput = scn.nextLine();
         System.out.println("CONFIRM PASSWORD");
         String cpInput = scn.nextLine();

        while(!cpInput.equals(pInput)){
                System.out.println("PASSWORD DO NOT MATCH. TRY AGAIN. ");
                System.out.println("PLEASE CONFIRM PASSWORD: ");
                cpInput = scn.nextLine();
         }
         System.out.println("ACCESS GRANTED!");
        System.out.println("===========LOGIN===========");
        
        System.out.println("ENTER USERNAME");
        String lUser = scn.nextLine();
        System.out.println("ENTER PASSWORD");
        String pString = scn.nextLine();
        
        do {
            if (!lUser.equals(username) && !pString.equals(pInput)) {
                System.out.println("INVALID USERNAME AND PASSWORD.");
                System.out.print("ENTER USERNAME: ");
                lUser = scn.nextLine();
                System.out.print("ENTER PASSWORD: ");
                pString = scn.nextLine();
            } 

            else if (!lUser.equals(username)) {
                System.out.println("INVALID USERNAME. TRY AGAIN.");
                System.out.print("ENTER USERNAME: ");
                lUser = scn.nextLine();
                System.out.print("ENTER PASSWORD: ");
                pString = scn.nextLine();
            }

            else if (!pString.equals(pInput)) {
                System.out.println("INVALID PASSWORD. TRY AGAIN.");
                System.out.print("ENTER USERNAME: ");
                lUser = scn.nextLine();
                System.out.print("ENTER PASSWORD: ");
                pString = scn.nextLine();
            }
        } while (!lUser.equals(username) || !pString.equals(pInput));

        System.out.println("SUCCESFUL LOGIN");
    }
}