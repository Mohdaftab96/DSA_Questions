
// Enter the Value of n : 121
// Given number is Palindrome

// Enter the Value of n : 155
// Given number is not Palindrome



import java.util.Scanner;
public class Check_given_number_is_PALINDROME_or_not{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter the Value of n : ");
            int n = sc.nextInt(); // n = 121

            int i = n;
            int rem=0;
            int sum = 0;


            while(n>0){
                  rem = n % 10;
                  sum  = sum * 10 + rem;
                  n = n / 10;
            }


            if(sum == i){
                  System.out.println("Given number is Palindrome");
            }else{
                  System.out.print("Given number is not Palindrome");
            }

            

                  
      }
}
