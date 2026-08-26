package Activities;
import java.util.Scanner;

public class Activity8 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the Day of The Weak (1-7)");
    int day = scn.nextInt();

    if (day == 1) {
        System.out.println("aray mo MONDAY nanaman");
    }
    else if (day == 2) {
        System.out.println("IS TUESDAY INNIT");
    }
    else if (day == 3) {
        System.out.println("WED NES DAY");
    }
    else if (day == 4) {
        System.out.println("Bruh Scouting (Thursday)");
    }
    else if (day == 5) {
        System.out.println("LAPIT NA!!!");
    }
    else if (day <= 7) {
        System.out.println("TARA VALO");
    }
    else {
        System.out.println("nigga wat");
    }
    scn.close();
    }
}
