
// Enter the Value of n : 143
// Given is not a Strong Number


// Enter the Value of n : 145
// Given is a Strong Number


// A strong number is a number that is equal to the sum of the factorials of its digits


import java.util.Scanner;


public class Check_given_number_is_STRONG_or_not {


      static int fact(int n1){

            
            int fact = 1;
            while(n1>0){
                  fact = fact * n1;
                  // System.out.println(fact + " ");
                  n1--;
            }

            return fact;
      }

       public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Value of n : ");
            int n = sc.nextInt(); // n = 143

            int i=n;
            int rem = 0;
            int sum = 0;
            while(n>0){
                  rem = n % 10; // rem = 4,5,1
                  sum = sum + fact(rem);
                  n = n / 10;
            }

            if(sum == i){
                  System.out.print("Given is a Strong Number");
            }else{
                  System.out.print("Given is not a Strong Number");
            }





            

                  
      }
}
