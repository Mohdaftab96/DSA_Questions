



// Enter the value : 5
// 1 6 11 16 21 
// 2 7 12 17 22 
// 3 8 13 18 23 
// 4 9 14 19 24 
// 5 10 15 20 25 


import java.util.Scanner;
public class Pattern_38{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        
       
        for(int i=1; i<=n; i++){
            int count = i;
            for(int j=1; j<=n; j++){
                
                System.out.print( count + " ");
                count = count + 5;
            }
            System.out.println();
        }

       



    }
}

//===================Problem - 02=================

// Enter the value : 5
// 5 10 15 20 25 
// 4 9 14 19 24 
// 3 8 13 18 23 
// 2 7 12 17 22
// 1 6 11 16 21 


import java.util.Scanner;
public class Pattern_38_GitHub{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        
       
        for(int i=1; i<=n; i++){
            int count = n-i+1;
            for(int j=1; j<=n; j++){
                
                System.out.print(count + " ");
                count = count + 5;
            }
            System.out.println();
        }


    }
}


















