

// Enter the n Value : 6
// 0 
// 0 1
// 0 1 0
// 0 1 0 1
// 0 1 0 1 0
// 0 1 0 1 0 1


import java.util.Scanner;
public class Pattern_41 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n Value : ");
        int n = sc.nextInt(); //n1 = 4
        
        
        for(int i=1; i<=n; i++){
           
            
            for(int j=1; j<=i; j++){
                  if(j%2 == 1){
                      System.out.print("0" + " ");
                  }else{
                      System.out.print("1" + " ");
                  }
            }

            System.out.println();
        }

        
    



    }
}




           


