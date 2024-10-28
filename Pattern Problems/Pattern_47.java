

// Enter the n value  : 4
// 1 
// 1 * 2
// 1 * 2 * 3
// 1 * 2 * 3 * 4



import java.util.Scanner;
public class Pattern_47{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n value  : ");
        int n = sc.nextInt(); //n1 = 5

        
        for(int i=1; i<=n; i++){
            int count = 1;
            for(int j=1; j<=2*i-1; j++){
                    if(j%2 == 0){
                        System.out.print("*" + " ");
                    }else{
                        System.out.print(count + " ");
                        count = count + 1;
                    }
                    
                }
            System.out.println();
        }


    }    
}





           


