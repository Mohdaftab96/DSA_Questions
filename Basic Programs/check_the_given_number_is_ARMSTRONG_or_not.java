

// Enter value of n : 371
// Given Number is ArmStrong

// Enter value of n : 143
// Given Number is not ArmStrong

// Enter value of n : 153
// Given Number is not ArmStrong

import java.util.Scanner;
public class check_the_given_number_is_ARMSTRONG_or_not {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n : ");
            int n = sc.nextInt(); // n = 10

      
            int i = n;
            int sum = 0;
            int rem = 0;
            while(n > 0){
                  rem = n % 10;
                  sum = sum + (rem * rem * rem);
                  n = n / 10;
            }

            if(sum == i){
                  System.out.println("Given Number is ArmStrong");
            }else{
                  System.out.println("Given Number is not ArmStrong");
            }


      }
}
