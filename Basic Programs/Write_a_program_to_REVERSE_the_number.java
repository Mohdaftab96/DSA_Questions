


// Enter value of n : 12345
// Reverse Number is : 54321

// Enter value of n : 789       
// Reverse Number is : 987



import java.util.Scanner;
public class Write_a_program_to_REVERSE_the_number {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n : ");
            int n = sc.nextInt();


            int sum = 0;
            int rem = 0;
            while(n>0){
                  rem = n % 10;
                  sum = sum * 10 + rem;
                  n = n / 10;
            }

            System.out.println("Reverse Number is : " +sum );




      }
}
