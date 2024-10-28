

// Enter the n Value : 4
// 13 * 14 * 15 * 16 
// 9 * 10 * 11 * 12 
// 5 * 6 * 7 * 8 
// 1 * 2 * 3 * 4 


// Enter the n Value : 5
// 21 * 22 * 23 * 24 * 25 
// 16 * 17 * 18 * 19 * 20
// 11 * 12 * 13 * 14 * 15
// 6 * 7 * 8 * 9 * 10
// 1 * 2 * 3 * 4 * 5


import java.util.Scanner;
public class Pattern_52 {
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the n Value : ");
            int n = sc.nextInt(); //n = 4

      
            for(int i=1; i<=n; i++){

                  int a = n * (n-i) + 1;
                  for(int j=1; j<=(2*n-1); j++){
                        if(j%2 == 0){
                              System.out.print("*" + " ");
                        }else{
                              System.out.print(a + " ");
                              a++;
                        }
                  }
                  System.out.println();
            }


    }    
}




      



