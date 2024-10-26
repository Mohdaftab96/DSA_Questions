

// Enter the value : 4
// A
// A B
// A B C
// A B C D 
// A B C
// A B
// A


//---------------------------Problem - 01---------------------------------------


import java.util.Scanner;
public class Pattern_31{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value : ");
            int n = sc.nextInt();

            //----Upper Triangle------------
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=i; j++){
                        char ch = (char)('A' + j - 1);
                        System.out.print(ch + " ");
                  }
                  System.out.println();
            }



            //----Lower Triangle------------
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=n-i; j++){
                        char ch = (char)('A' + j - 1);
                        System.out.print(ch + " ");
                  }
                  System.out.println();
            }
      }
      
}


