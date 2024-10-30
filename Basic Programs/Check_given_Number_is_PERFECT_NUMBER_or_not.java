
// Enter the Value of n : 28
// Given number is Perfect Number

// Enter the Value of n : 6
// Given number is Perfect Number

// Enter the Value of n : 27
// Given number is not Perfect Number


import java.util.Scanner;
public class Check_given_Number_is_PERFECT_NUMBER_or_not {
       public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Value of n : ");
            int n = sc.nextInt(); // 28

            int sum = 0;
            for(int i=1; i<n; i++){
                  if(n%i == 0){
                        sum = sum + i;
                  }
            }

            if(sum == n){
                  System.out.print("Given number is Perfect Number");

            }else{
                  System.out.print("Given number is not Perfect Number");
            }






            

                  
      }
}
