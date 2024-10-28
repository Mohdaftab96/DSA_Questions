


// Enter the n Value  : 5
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5


import java.util.Scanner;
public class Basic_Diamond_Star_Pattern {
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the n Value  : ");
            int n = sc.nextInt(); //n = 4

            
            
            //======Upper diamond======
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=n-i+1; j++){
                        System.out.print(j + " ");
                  } 
                  System.out.println();  
            }



            //======Lower diamond======
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=i; j++){
                        System.out.print(j + " ");
                  } 
                  System.out.println();
            }


            
    }    
}




      



