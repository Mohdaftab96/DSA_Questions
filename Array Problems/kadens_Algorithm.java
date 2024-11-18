
//----------------What is Kaden's algorithm?-----------------------
//----Kaden's algorithm is an iterative dynamic programming algorithm that looks for the maximum contiguous
//---subarray Using the Kaden's algorithm, we should consider only the positive elements of the array and 
//----keep track of only the maximum contiguous sum subarray.


// int[] arr = {2, 3, -8, 7, -1, 2, 3};
// Maximum contiguous sum is : 11

// int[] arr = {-2, -4};
// Maximum contiguous sum is : -2

// int[] arr = {5, 4, 1, 7, 8};
// Maximum contiguous sum is : 25

// int[] arr = {1, 2, 3, -2, 5};
// Maximum contiguous sum is : 9

// int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
// Maximum contiguous sum is : 7


//=====================Method : 01===================

public class kadens_Algorithm{

    static int maxSubarraySum(int[] arr){

          int n = arr.length;

          int sum = 0;
          int maxSum = arr[0];
          for(int i=0; i<n; i++){
                sum = arr[i];
                for(int j=i+1; j<=n-1; j++){

                      sum = sum + arr[j];

                      if(sum > maxSum){
                            maxSum = sum;
                      }

                      if(sum < 0){
                            sum = 0;
                      }
                }
          }

          return maxSum;


    }

    public static void main(String[] args){

          // int[] arr = {2, 3, -8, 7, -1, 2, 3};
          // int[] arr = {-2, -4};
          // int[] arr = {5, 4, 1, 7, 8};
          int[] arr = {1, 2, 3, -2, 5};
          // int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

          // maxSubarraySum(arr);
          System.out.println("Maximum contiguous sum is : " + maxSubarraySum(arr));

          
    }
}





//=====================Method : 02===================

/*
import java.util.Scanner;
public class Medium_kadens_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Array length : ");
        int n = sc.nextInt(); //n = 8
        
        int [] arr = new int[n];
        
        System.out.print("Enter the Input : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); // -2 -3 4 -1 -2 1 5 -3
        }
        
        int maxSum = 0;
        int sum = 0;
        int start = 0, end = 0, s = 0;

        
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            
            if(sum > maxSum ){
                maxSum = sum;
                start = s;
                end = i;
            }
            
            if(sum<0){
                sum = 0;
                s = i + 1;
            }
           
        }
        
        
        System.out.println("Maximum contiguous sum is : "+ maxSum + " ");
        System.out.println("Starting Index is : "+ start + " ");
        System.out.println("Ending Index is : "+ end + " ");
        
        
        
        
    }
}

 */
