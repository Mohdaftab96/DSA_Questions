



// Enter the value : 5
// 1 3 5 7 9 
// 11 13 15 17 19 
// 21 23 25 27 29 
// 31 33 35 37 39 
// 41 43 45 47 49 




import java.util.Scanner;
public class Pattern_33{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        
       
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                  System.out.print(count + " ");
                  count = count + 2;
            }
            System.out.println();
        }

       

    }
}




















