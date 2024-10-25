

// Enter the value : 5
// 15 
// 14  13 
// 12  11  10 
// 9   8   7   6 
// 5   4   3   2   1 




import java.util.Scanner;
public class Pattern_29{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt();  // n = 3
        

        
        int count = n*(n+1)/2;
        for(int i=0; i<n; i++){
            for(int j=i+1; j>0; j--){
                    System.out.print(count + " ");
                    count = count - 1;
            } 
            System.out.println();
        }

    }
}
 








