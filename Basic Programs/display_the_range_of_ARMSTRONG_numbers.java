


//Enter value of n1 : 1
// Enter value of n2 : 500
// 1 153 370 371 407 


// Enter value of n1 : 1
// Enter value of n2 : 153
// 1 is a ArmStrong Number
// 153 is a ArmStrong Number

import java.util.Scanner;
public class display_the_range_of_ARMSTRONG_numbers {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n1 : ");
            int n1 = sc.nextInt(); // n = 100

            System.out.print("Enter value of n2 : ");
            int n2 = sc.nextInt(); // n = 100

            
            for(int i=n1; i<=n2; i++){
                  
                  int x = i;
                  int sum = 0;
                  int rem = 0;
                  while(x > 0){
                        rem = x % 10;
                        sum = sum + (rem * rem * rem);
                        x = x / 10;

                  }

                  if(sum == i){
                        System.out.print(i + " is a ArmStrong Number");
                  }
            }


                  
      }
}
