


// Enter the Upper pyramid number: 5
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          *
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          *


import java.util.Scanner;
public class Pattern_22{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Upper pyramid number: ");
        int n = sc.nextInt();  // n = 3
        
        
        
        //----Ulta Upper Pyramid------------
        
        for(int i=1; i<=n; i++){
            int space = i-1;
            while(space > 0){
                System.out.print("  ");
                space = space - 1;
            }
            for(int j=n; j>i-1; j--){
                System.out.print(" *");    
            }

            for(int j=n; j>i; j--){
                System.out.print(" *");    
            }
            System.out.println();
        }

        //----Ulta Lower Pyramid------------
        
        for(int i=1; i<=n; i++){
            int space = i-1;
            while(space > 0){
                System.out.print("  ");
                space = space - 1;
            }
            for(int j=n; j>i-1; j--){
                System.out.print(" *");    
            }

            for(int j=n; j>i; j--){
                System.out.print(" *");    
            }
            System.out.println();
        } 

    }
}

