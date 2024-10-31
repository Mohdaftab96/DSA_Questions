

// Enter the n number : 1010
// Decimal Number : 10.0


// Enter the n number : 10110100 
// Decimal Number : 180.0

import java.util.Scanner;
public class Convert_BINARY_to_DECIMAL {


      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the n number : ");
            int n = sc.nextInt(); // n = 10

            int rem = 0;
            double sum = 0;
            int i = 0;
            while(n > 0){
                  
                  rem = n % 10;
                  sum = sum +  rem * Math.pow(2, i);
                  n = n/10;
                  i++;
            }

            System.out.println("Decimal Number : " + sum);



                  
      }
}

