


// arr = {-5, -9, 1, 3, 8, 12};
// Sorted an Array : -9 -5 1 3 8 12 

// arr = {5, 9, 10, 3, 80, 12};
// Sorted an Array : 3 5 9 10 12 80 

// arr = {64, 34, 25, 12, 22, 11, 90};
// Sorted an Array : 11 12 22 25 34 64 90 


public class Bubble_Sort{

    static void bubbleSort(int[] arr, int n){

          int temp;
          for(int i=0; i<n; i++){
                for(int j=i+1; j<=n-1; j++){
                      if(arr[i] > arr[j]){
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;      
                      }
                }
          }
    }

    static void printArray(int[] arr, int n){
          for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
          }
    }

    public static void main(String[] args){
          int[] arr = {64, 34, 25, 12, 22, 11, 90};
          int n = arr.length;
          
          bubbleSort(arr, n);
          System.out.print("Sorted an Array :");
          printArray(arr, n);
          
    }
}

