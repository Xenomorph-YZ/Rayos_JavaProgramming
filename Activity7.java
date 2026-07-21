import java.util.Scanner;
public class Activity7 {
    public static void main(String[] args) {

    //String email = "jaceallenrayos@gmail.com";
    Scanner email = new Scanner(System.in);
    System.out.println("ENTER YOUR EMAIL:");
    String userEmail = email.nextLine();

    System.out.println("The length of the text string is: " + userEmail.length());
    String userName = userEmail;
    System.out.println(userName.toLowerCase());
    
    System.out.println(userName.indexOf(""));
    System.out.println(userName.substring(0,4)); 
    }
}
