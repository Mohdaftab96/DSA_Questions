

//-----------Find common elements in three sorted arrays----------------


// arr1 = {1, 5, 10, 20, 40, 80};
// int[] arr2 = {5, 13, 15, 20};
// int[] arr3 = {5, 20};
// 5 20


// arr1 = {2, 5, 10, 30};
// arr2 = {5, 20, 34};            
// arr3 = {5, 13, 19};
// 5


// arr1 = {1, 5, 5};
// arr2 = {5, 5, 10, 20};
// arr3 = {3, 4, 5, 5, 10};
// 5 5


public class Find_Common_Elements_in_Three_Sorted_Arrays{

    static void commonElementsInThreeSortedArray(int[] arr1, int n1, int[] arr2, int n2, int[] arr3, int n3){

          int i = 0;
          int j = 0;
          int k = 0;
          boolean flag = false;

          while(i<n1 && j<n2 && k<n3){
                if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                      System.out.print(arr1[i] + " ");
                      i++;
                      j++;
                      k++;
                      flag = true;
                      
                }else if(arr1[i] < arr2[j]){

                      i++;

                }else if(arr2[j] < arr3[k]){

                      j++;

                }else{

                      k++;

                }
          }
          if(flag != true){
               System.out.println("No common Elements Found"); 
          }
    }



    
    public static void main(String[] args){

      
        //   int[] arr1 = {1, 5, 10, 20, 40, 80};
        //   int n1 = arr1.length;
        //   int[] arr2 = {5, 13, 15, 20};
        //   int n2 = arr2.length;
        //   int[] arr3 = {5, 20};
        //   int n3 = arr3.length;

          // int[] arr1 = {2, 5, 10, 30};
          // int n1 = arr1.length;
          // int[] arr2 = {5, 20, 34};
          // int n2 = arr2.length;
          // int[] arr3 = {5, 13, 19};
          // int n3 = arr3.length;


          int[] arr1 = {1, 5, 5};
          int n1 = arr1.length;
          int[] arr2 = {5, 5, 10, 20};
          int n2 = arr2.length;
          int[] arr3 = {3, 4, 5, 5, 10};
          int n3 = arr3.length;

          
          commonElementsInThreeSortedArray(arr1, n1, arr2, n2, arr3, n3);

          
          
          
          

          
    }
}

