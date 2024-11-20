



// int[] arr = {10, 5, 3, 4, 3, 5, 6};
// First Repeating Element is: 5


// int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
// First Repeating Element is: 6

public class first_repeating_element_in_an_array_of_integers{

      static int firstRepeatingElement(int[] arr, int n){
   
            
            for(int i=0; i<n; i++){
                  for(int j=i+1; j<=n-1; j++){
                        if(arr[i] == arr[j]){
                              // x = arr[i];
                              return i;
                        }
                  }  
            }
            return -1;            
      }


      public static void main(String[] args){

            

            // int[] arr = {10, 5, 3, 4, 3, 5, 6};
            int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
            int n = arr.length;
            

            int index = firstRepeatingElement(arr, n);

            if(index == -1){
                  System.out.println("No Repeating Element Found");
            }else{
                  System.out.println("First Repeating Element is: " + arr[index]);
            }
            
      

      }
      
}

