


// Enter Value of n : 5
// Given number is Prime

// Enter Value of n : 22
// Given number is not Prime


import java.util.Scanner;
public class check_whether_the_given_number_is_PRIME_or_not{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Value of n : ");
            int n = sc.nextInt(); // n = 5

          
            int flag = 1;
                  for(int j=2; j<n; j++){
                        if(n%j == 0){
                              flag = 0;
                              break;
                        }else{
                              flag = 1;
                        }
                  }

                  if(flag == 1){
                        System.out.print("Given number is Prime");
                  }else{
                        System.out.print("Given number is not Prime");
                  }
            

           

                  
      }
}

