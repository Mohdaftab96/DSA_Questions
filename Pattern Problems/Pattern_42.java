

// Enter the n Value : 6
// A 
// B A 
// C B A 
// D C B A 
// E D C B A 
// F E D C B A 



import java.util.Scanner;
public class Pattern_42 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n Value : ");
        int n = sc.nextInt(); //n1 = 4
        
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                char ch = (char)('A' + i - j);
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
              
    }    
}





           



