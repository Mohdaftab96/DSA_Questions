
//-------Given Array of size n and a number k, find all elements that appear more than n/k times----------------


// int[] arr = {9, 8, 7, 9, 2, 9, 7};
// int  k = 3;
// output: 9

// int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
// int k = 4;
// output: 2 3

// int[] arr = {1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1};
// int k = 4;
// output: 1 2


// int[] arr = { 4, 5, 6, 7, 8, 4, 4 };
// int k = 3;
// output: 4




//===============================Method - 01=====================================================



import java.util.Arrays;
public class Given_Array_of_size_n_and_a_number_n_Divided_By_k{

      static void morethanNdK(int[] arr, int n, int k){

            int x = n/k;
            // System.out.println(x + " ");

            Arrays.sort(arr);

            
            for(int i=0; i<n; i++){
                  int count = 0;
                  while(i<n-1 && arr[i] == arr[i+1]){
                              count = count + 1;
                              i = i + 1;
                        }

                  if(count >= x){
                        System.out.print(arr[i] + " ");
                  }      
            }
                  
      }


      public static void main(String[] args){

            // int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
            // int k = 4;
            // int[] arr = {9, 8, 7, 9, 2, 9, 7};
            // int  k = 3;

            // int[] arr = {1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1};
            // int k = 4;

            int[] arr = { 4, 5, 6, 7, 8, 4, 4 };
            int k = 3;

            int n = arr.length;
            

            morethanNdK(arr, n, k);
             
            
            

      }
      
}






//===============================Method - 02======================================================

/* 
import java.util.Arrays;
import java.util.Scanner;
public class Given_Array_of_size_n_and_a_number_n_Divided_By_k{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.print("Enter the Array Length : ");
        int n = sc.nextInt();
        
        int [] arr = new int[n];
        
        System.out.print("Enter the Array Length : ");
        for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
        }
    
        
        Arrays.sort(arr); // sorting array



        System.out.print("Enter the k Times : ");
        int k = sc.nextInt();

        
        for(int i=0; i<n; i++){
            int count = 1;
            while((i+1)<n && arr[i] == arr[i+1]){
                count = count + 1;

                i = i + 1;

            }

            if(count > (n/k)){
                System.out.print(arr[i] + " ");
            }
        }
        
        
       
    }
}

*/

