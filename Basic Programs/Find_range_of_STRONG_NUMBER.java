

// Enter value of n : 143
// 1 is a Strong Number
// 2 is a Strong Number

// Enter value of n : 145
// 1 is a Strong Number
// 2 is a Strong Number
// 145 is a Strong Number


import java.util.Scanner;
public class Find_range_of_STRONG_NUMBER{

      static int fact(int n1){

            int fact = 1;
            while(n1 > 0){
                  fact = fact * n1;
                  n1 = n1 - 1;
            }

            return fact;
      }



      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n : ");
            int n = sc.nextInt(); 

            for(int i=1; i<=n; i++){
            int num = i;
            int rem = 0;
            int sum = 0;
                  while(num > 0){
                        rem = num % 10;
                        sum = sum + fact(rem);
                        num = num / 10;
                  }
            
                  if(sum == i){
                        System.out.println(i + " is a Strong Number");
                  }
            }

            

      
                  
      }
}
