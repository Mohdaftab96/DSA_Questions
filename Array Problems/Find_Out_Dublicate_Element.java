

// int[] arr = {1, 2, 3, 2, 3, 4};
// Dublicate Elements are :2 3 

// int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11};
// Dublicate Elements are : 12 11 5 

// int[] arr = {2, 10, 10, 100, 2, 10, 11, 2, 11, 2};
// Dublicate Elements are : 2 10 11 

// int[] arr = {5, 40, 1, 40, 100000, 1, 5, 1};
// Dublicate Elements are : 5 40 1 


import java.util.ArrayList;
import java.util.List;

public class Find_Out_Dublicate_Element {

      static List<Integer> findDublicateElements(int[] arr, int n){


            List<Integer> res = new ArrayList<>();
           
            for(int i=0; i<n; i++){
                  for(int j=i+1; j<=n-1; j++){
                        if(arr[i] == arr[j]){
                              if(!res.contains(arr[j])){
                                    res.add(arr[j]);
                              }
                              break;
                        }
                  }    
            }  
            return res;    
      }
      
      public static void main(String[] args){

            
            
            // int[] arr = {12, 11, 40, 12, 5, 6, 5, 12, 11};
            // int[] arr = {1, 2, 3, 2, 3, 4};
            // int[] arr = {2, 10, 10, 100, 2, 10, 11, 2, 11, 2};
            int[] arr = {5, 40, 1, 40, 100000, 1, 5, 1};
            int n = arr.length;
            
            System.out.print("Dublicate Elements are : ");
            List<Integer> dublicate = findDublicateElements(arr, n);

            for(int x : dublicate){
                  System.out.print(x + " ");
            }
            
            

            
      }
}


      