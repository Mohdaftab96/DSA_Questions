

// Enter the value : 5
// 1  2  3  4  5 
// 2  4  6  8  10
// 3  6  9  12 15
// 4  8  12 16 20
// 5  10  15 20 25


import java.util.Scanner;
public class Pattern_37 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        
       
        for(int i=1; i<=n; i++){
            int count = 1;
            for(int j=1; j<=n; j++){
                
                System.out.print( i*count + " ");
                count = count + 1;
            }
            System.out.println();
        }

       

    }
}




















