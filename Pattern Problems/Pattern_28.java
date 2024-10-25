



// Enter the number n : 5 
 
// 0 0 0 0 5 
// 0 0 0 4 
// 0 0 3 
// 0 2 
// 1 



import java.util.Scanner;
public class Pattern_28 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        
        
        for(int i=0; i<n; i++){
            int space = n-i;
            while(space > 0){
                System.out.print("0" + " ");
                space = space - 1;
            }

            for(int j=1; j<=1; j++){
                    System.out.print(n-i + " ");
            }
           
            System.out.println();
        }
    }
}


