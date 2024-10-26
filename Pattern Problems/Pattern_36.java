


// Enter the value : 6
// 1 1 2 1 3 1 
// 1 2 2 2 3 2 
// 1 3 2 3 3 3 
// 1 4 2 4 3 4 
// 1 5 2 5 3 5 
// 1 6 2 6 3 6 


import java.util.Scanner;
public class Pattern_36 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        
       
        for(int i=1; i<=n; i++){
            int count1 = i;
            int count2 = 1;
            for(int j=1; j<=n; j++){
                if(j%2 == 1){
                    System.out.print(count2 + " ");
                    count2 = count2 + 1;
                }else{
                    System.out.print(count1 + " ");
                     
                }
                
            }
            System.out.println();
        }

       



    }
}




















