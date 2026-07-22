import java.util.Scanner;

public class Activity7 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER EMAIL: ");
        String email = scn.nextLine();
        
        int atSymbol = email.indexOf("@");

        String username = email.substring(0,atSymbol);
        System.out.println(username);

        String domain = email.substring(atSymbol +1);
        System.out.println(domain);

    }
}