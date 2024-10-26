

// Enter the value : 4 (difference with the no. of given value n)
// 1 
// 2 6 
// 3 7 10 
// 4 8 11 13 

// Enter the value : 5
// 1 
// 2 7
// 3 8 12
// 4 9 13 16 
// 5 10 14 17 19




import java.util.*;
public class Pattern_32 {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value : ");
            int n = sc.nextInt();

            int count;
            
            for(int i=1; i<=n; i++){
                  count = i;
                  int a = n;
                  for(int j=1; j<=i; j++){
                        System.out.print(count + " ");
                        count = count + a;
                        a = a - 1; 
                  }
                  System.out.println();
            }

           
      }  
}




//-----------------------------Problem - 02------------------------------------





// Enter the value : 5
// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * * 


/*
import java.util.*;
public class Pattern_25{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value : ");
            int n = sc.nextInt();

            int count;
            for(int i=1; i<=n; i++){
                  count = i;
                  for(int j=1; j<=n; j++){
                        if(i==1|| j==1 || i==n || j==n){
                              System.out.print("*" + " ");
                        }else{
                              System.out.print("  ");
                        }
                  }
                  System.out.println();
            }
           
      }
      
}

*/


//----------------------------------Problem - 03--------------------




// Enter the value : 5
//  1  2  3  4  5  5  4  3  2  1 
//  1  2  3  4  *  *  4  3  2  1 
//  1  2  3  *  *  *  *  3  2  1 
//  1  2  *  *  *  *  *  *  2  1 
//  1  *  *  *  *  *  *  *  *  1 


/*
import java.util.*;
public class Pattern_25{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value : ");
            int n = sc.nextInt();

            int count;
            
            for(int i=0; i<n; i++){

                  //1st Ulta Puramid
                  for(int j=1; j<=n-i; j++){
                        System.out.print(j + " ");  
                  }

                   //2nd triangle
                  for(int j=1; j<=i; j++){
                        System.out.print("*" + " ");  
                  }

                  //3rd left triangle
                  for(int j=1; j<=i; j++){
                        System.out.print("*" + " ");  
                  }


                   //3rd left triangle
                   for(int j=n-i; j>0; j--){
                        System.out.print(j + " ");  
                  }



                  System.out.println();
            }


           
      }
      
}

*/
