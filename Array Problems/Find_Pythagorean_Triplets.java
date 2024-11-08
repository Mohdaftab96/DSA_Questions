
//-------Find Pythagorean Triplets--[a^2 + b^2 = c^2]------------


// arr = {3, 1, 4, 6, 5};
// Pythagorean Triplet : true

// int[] arr = {10, 4, 6, 12, 5};
// Pythagorean Triplet : false



public class Find_Pythagorean_Triplets{

    static boolean pythagoreanTriplet(int[] arr, int n){


        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n-1; j++){
                for(int k=j+1; k<n; k++){
                    if((arr[i]*arr[i])+(arr[j]*arr[j]) == (arr[k]*arr[k])){
                        return true;
                    }
                }
            }
        } 
        return false;        
    }



    
    public static void main(String[] args){

      
            int[] arr = {3, 1, 4, 6, 5};
            // int[] arr = {10, 4, 6, 12, 5};
        
            int n = arr.length;
                
            // pythagoreanTriplet(arr, n);
            System.out.println("Pythagorean Triplet : " + pythagoreanTriplet(arr, n));
        
          
        
    }
}

