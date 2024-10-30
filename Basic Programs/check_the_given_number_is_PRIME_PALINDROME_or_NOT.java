

// Enter value of n : 313
// Given Number is a Prime Palindrmoe

// Enter value of n : 103
// Given Number is not a Prime Palindrmoe


import java.util.Scanner;
public class check_the_given_number_is_PRIME_PALINDROME_or_NOT {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n : ");
            int n = sc.nextInt(); // n = 10

      //checking Palindrome
            int i = n;
            int sum = 0;
            int rem = 0;
            while(n > 0){
                  rem = n % 10;
                  sum = sum * 10 + rem;
                  n = n / 10;
            }


      // checking Prime
            int n1 = sum;
            int flag = 0;
            for(int j=2; j<n1; j++){
                  if(n1 % j == 0){
                  flag = 0;
                  break;
                  }else{
                  flag = 1;
                  }
            }


        if(flag == 1){
            System.out.print("Given Number is a Prime Palindrome");
        }else{
            System.out.print("Given Number is not a Prime Palindrome");
        }






            

                  
      }
}
