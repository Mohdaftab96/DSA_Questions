
// Enter the n value  : 5
// 1 2 3 4 5 
// 2 3 4 5 1
// 3 4 5 1 2
// 4 5 1 2 3
// 5 1 2 3 4


import java.util.Scanner;
public class Pattern_49{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the n value  : ");
            int n = sc.nextInt(); //n1 = 5

           
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=n-i+1; j++){
                        System.out.print(i+j-1 + " ");
                  }

                  int count = 1;
                  for(int j=2; j<=i; j++){
                        System.out.print(count + " ");
                        count = count + 1;
                  }
            System.out.println();
        }

      

           


    }    
}




      


