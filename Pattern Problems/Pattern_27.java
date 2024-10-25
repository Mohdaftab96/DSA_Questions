
// Enter the n value : 5
// 5 4 3 2 1 
// 4 3 2 1
// 3 2 1
// 2 1 
// 1


import java.util.Scanner;
public class Pattern_27 {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the n value : ");
            int n = sc.nextInt(); // n1 = 4


            for(int i=1; i<=n; i++){
                  for(int j=n-i+1; j>0; j--){
                       System.out.print(j + " "); 
                  }
                  System.out.println();
            }
      

      }     
}








