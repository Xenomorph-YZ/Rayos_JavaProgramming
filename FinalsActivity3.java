public class FinalsActivity3 {
    public static void main(String[] args) {

        //String[] cars = {
        //        "BMW", //0
        //        "Volvo", //1
        //        "Jeep", //2
        //        "Mazda"//3
        //};
        //System.out.println(cars[0]);

        // cars[0] = "Opel";

        // System.out.println(cars[0]);
        // System.out.println(cars.length);

        //for loop
        //for (int i = 0; i < cars.length; i++) {
        //    System.out.println(cars[i]);
        //}

        //for each loop
        //for (String jace : cars) {
        //    System.out.println(jace);
        //}
        

        //String[] subjects = {
        //    "Math", "Science", "PE", "English", "Filipino"
        //};

        //for (String subject : subjects) {
        //    System.out.println(subject);
        //}

        // String[] students =
        // {
        //     "Juan","Maria","Pedro","Ana","Mark","Sofia","Carlo","Luis","Mia","John"
        // };
        // System.out.println("Number of students: " + students.length);


        //int[] numbers = {10, 20, 30, 40, 50};
        //int sum = 0;

        //for (int i = 0; i < numbers.length; i++) {
        //    sum +=numbers[i];
        //}

        //System.out.println("Sum of numbers: " + sum);


        //int[] scores = {85, 92, 76, 95, 88, 79, 90, 84, 91, 87};

        //int highest = scores[0];
        //int lowest = scores[0];

        //for(int i = 0; i<scores.length; i++) {
        //    if(scores[i] > highest) {
        //        highest = scores[i];
        //    }
        //    if(scores[i] < lowest) {
        //        lowest = scores[i];
        //    }
        //}
        
        //System.out.println(highest);
        //System.out.println(lowest);

        //int[] numbers = {12, 7, 25, 40, 18, 33, 50, 61};

        //System.out.println("EVEN NUMBERS:");

        //for (int i = 0; i < numbers.length; i++) {
        //    if (numbers[i] % 2 == 0) {
        //        System.out.println(numbers[i]);
        //    }
        //}
        //System.out.println("ODD NUMBERS:");
        //for (int i = 0; i < numbers.length; i++) {
        //    if (numbers[i] % 2 != 0) {
        //        System.out.println(numbers[i]);
        //    }
        //}


         int[] grades =
        {
            85, 78, 92, 88, 76,
            95, 89, 84, 91, 73
        };

        int highest = grades[0];
        int lowest = grades[0];

        for(int i = 0; i<grades.length; i++) {
            if(grades[i] > highest) {
                highest = grades[i];
            }
            if(grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        int total = 0;
        for(int i = 0; i < grades.length; i++) {
            total += grades[i];
        }

        double average = (double) total / grades.length;
            int passing = 0;
            int failing = 0;

        for(int i = 0; i < grades.length; i++)
            if(grades[i] >= 75) {
                passing++;
            } else {
                failing++;
            }

        System.out.println("=============== GRADE ANALYZER =============== ");

        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Passing: " + passing);
        System.out.println("Failing: " + failing);

    }
}
