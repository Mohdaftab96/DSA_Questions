

// Enter the value : 5
// 2 4 6 8 10 
// 12 14 16 18 20
// 22 24 26 28 30 
// 32 34 36 38 40
// 42 44 46 48 50



import java.util.Scanner;
public class Pattern_35{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        
       
       int count = 2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                    System.out.print(count + " ");
                    count = count + 2;
            }
            System.out.println();
        }

       



    }
}




















