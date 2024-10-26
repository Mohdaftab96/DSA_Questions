


// Enter the n value  : 4
//              1  
//          4   9
//     16  25  36
// 49  64  81  100


import java.util.Scanner;
public class Pattern_43{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n value  : ");
        int n = sc.nextInt(); //n1 = 5

        
        int count = 1;

        for(int i=1; i<=n; i++){
            int space = n-i; // 3, 2, 1 
            while(space > 0){
                System.out.print("    ");
                space = space - 1;
            }
            for(int j=1; j<=i; j++){
                    System.out.print(count * count + "  ");
                    count = count + 1;
                }
            System.out.println();
        }


    }    
}





           



