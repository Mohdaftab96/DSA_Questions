

// Enter the n value  : 5
// 1 2 3 4 5 
// 0 3 4 5 6 
// 0 0 5 6 7
// 0 0 0 7 8 
// 0 0 0 0 9


import java.util.Scanner;
public class Pattern_46{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n value  : ");
        int n = sc.nextInt(); //n1 = 5

        
        for(int i=1; i<=n; i++){
            int space = i-1;  
            while(space > 0){
                System.out.print("0" + " ");
                space = space - 1;
            }
            
            for(int j=1; j<=n-i+1; j++){
                    System.out.print(2*i+j-2  + " ");
                    
                }
            System.out.println();
        }


    }    
}





           



