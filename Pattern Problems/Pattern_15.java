

// Enter the value : 4
// 1 1 1 1 
// 1 1 2 2 
// 1 3 3 3 
// 4 4 4 4 


//--------------------------Method 01 ------------------------------

import java.util.Scanner;
public class Pattern_15{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        

        for(int i=1; i<=n; i++){
            int space = n-i; //
            while(space > 0){
                System.out.print("1" + " ");
                space = space - 1;
            }

            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
                
            }
            System.out.println();
        }

    }
}




//-----------------------------Method 02-----------------------------



/* 
import java.util.*;
public class Pattern_15{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=n-i){
                    System.out.print("1" + " ");
                }else{
                    System.out.print(i + " ");
                }
                
            }
            System.out.println();
        }

    }
}

*/
















