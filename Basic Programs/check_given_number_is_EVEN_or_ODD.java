


// Enter value of n : 10
// Even

// Enter value of n : 5
// Odd



import java.util.Scanner;
public class check_given_number_is_EVEN_or_ODD  {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n : ");
            int n = sc.nextInt();


            if(n%2 == 0){
                  System.out.print("Even");
            }else{
                  System.out.print("Odd");
            }

                  
      }
}
