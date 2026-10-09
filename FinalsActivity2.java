public class FinalsActivity2 {
   public static void main(String[] args) {

      for (int i = 1; i <= 5; i++) {   
         for (int j = 1; j <= 5; j++) {
            int product = i * j;
            if (product < 10) {
               System.out.print(" " + product + " ");
            } else {
               System.out.print(" " + product);
            }
         }
         System.out.println();
        }
    }
}
