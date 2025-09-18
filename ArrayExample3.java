public class ArrayExample3 {
   public static void main(String[] args) {
       // Declare and initialize an array of doubles
       double[] prices = {12.5, 9.99, 5.0, 25.75, 15.20};
       double sum = 0;
       // Calculate the sum of all elements using a loop
       for (int i = 0; i < prices.length; i++) {
           sum = sum + prices[i];
       }
       // Print the total sum
       System.out.println("The total sum of prices is: " + sum);
   }
}
