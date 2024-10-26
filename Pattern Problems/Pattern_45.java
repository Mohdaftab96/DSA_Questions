

// Enter the n value : 5
//             1 
//          2  4
//       3  6  9
//    4  8 12 16
// 5 10 15 20 25


import java.util.Scanner;
public class Pattern_45{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n value  : ");
        int n = sc.nextInt(); //n1 = 5

        
        for(int i=1; i<=n; i++){
            int space = n-i;  
            while(space > 0){
                System.out.print("   ");
                space = space - 1;
            }
            
            int count = 1;
            for(int j=1; j<=i; j++){
                    System.out.print(i * count  + " ");
                    count = count + 1;
                    
                }
            System.out.println();
        }


    }    
}





           



