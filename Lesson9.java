import java.util.Random;

public class Lesson9 {
 
    public static void main(String[] args) {
        int x = 9;
        double a = 2.67;
        int y = 20;
        int z = 25;

        Random rand = new Random();
        int random = rand.nextInt(1,100);

        //(0-99 if *100, if *101 it is 0-100)
        //int random = (int)(Math.random()*100);


        //Math.max (Maximum)
        System.out.println(Math.max(x, Math.max(y, z)));

        //Math.min (Minimum)
        System.out.println(Math.min(x, Math.min(y, z)));

        //Math.sqrt (Square root)
        System.out.println(Math.sqrt(y));

        //Math.abs (Absolute value) (only 1 value eg. x only)
        System.out.println(Math.abs(x));

        //Math.pow (Raise to the power of:)
        System.out.println(Math.pow(9, 2));

        //Math.round (Rounding off)
        System.out.println(Math.round(2));

        //Math.ceil (Ceiling)
        System.out.println(Math.ceil(a));

        //Math.floor (Flooring)
        System.out.println(Math.floor(a));

        //Math.random (Random Number Generator/RNG)
        //System.out.println(random);
    }

}

class BooleanLesson{
    public static void main(String[] args) {
        boolean isRaining = false;
        int x = 9;
        int y = 5;
        int z = 18;

        //System.out.println("Is it Raining?" + isRaining);
        System.out.println(x > y); //true
        System.out.println(x < y); //false

        System.out.println(x > y && y > x); //true
        System.out.println(x < y && y > x); //false
        
        System.out.println(x < y || y > x); //true
    }
}