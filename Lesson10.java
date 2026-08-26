import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("ENTER A NUMBER:");
    int num1 = scn.nextInt();

    if (num1 % 2 == 0)
    {
        System.out.println("Number is Even");    
    }
    else{
        System.out.println("Number is Odd");
    }
    /*
    System.out.println( "Please enter a Number");
    int num1 = scn.nextInt();

    if (num1 >= 0)
    {
     System.out.println("YESSIR");   
    }
    
    else
    {
        System.out.println("Nigerian Tive");
    }
    scn.close();
    */
    /*    int x = 8;
        int y = 9;

        if (x<y)
        {
            System.out.println( "TRUE!");
        }

        else 
        {
            System.out.println("FALSE");
        }
     */



    }
}
