
// Enter the n value  : 5 
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// 16 17 18 19 
// 20 21 22 
// 23 24 
// 25


import java.util.Scanner;
public class Pattern_48{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the n value  : ");
            int n = sc.nextInt(); //n1 = 5

            //=====Upper Triangle======
            int count = 1;
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=i; j++){
                        System.out.print(count + " ");
                        count = count + 1;
                  }
            System.out.println();
        }

      

            //=======Lower Triangle========
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=n-i; j++){
                        System.out.print(count + " ");
                        count = count + 1;
                  }
                  System.out.println();
            }

            
    }    
}




      


