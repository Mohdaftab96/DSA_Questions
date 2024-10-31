


// Enter the Array_01 Length : 4
// Enter the Array_01 Input : 1 2 3 4
// Enter the Array_01 Length : 4
// Enter the Array_01 Input : 1 2 3 4
// Both array are equal (becoz length and Element both  are same)


// Enter the Array_01 Length : 5
// Enter the Array_01 Input : 1 2 3 4 5
// Enter the Array_01 Length : 4
// Enter the Array_01 Input : 4 3 2 1
// Both array are not equal (becoz length of both arrays are different )


// Enter the Array_01 length : 6
// Enter the Array_01 Element : 1 3 4 2 5 6
// Enter the Array_02 length : 6
// Enter the Array_01 Element : 1 4 2 3 4 5 6
// Both arrays are not Same (becoz length of both arrays are same but order of both arrays are different)




import java.util.Scanner;
public class Easy_Check_Two_Arrays_Are_Equals_Or_Not  {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            //---1st Array-------
            System.out.print("Enter the Array_01 Length : ");
            int n1 = sc.nextInt(); 

            int [] arr1 = new int[n1];


            System.out.print("Enter the Array_01 Input : ");
            for(int i=0; i<n1; i++){
                arr1[i] = sc.nextInt(); 
            }


            //---2nd Array-------
            System.out.print("Enter the Array_01 Length : ");
            int n2 = sc.nextInt(); 

            int [] arr2 = new int[n2];


            System.out.print("Enter the Array_01 Input : ");
            for(int j=0; j<n2; j++){
                arr2[j] = sc.nextInt(); 
            }


            
            int count = 0;

            for(int i=0; i<n1; i++){
                for(int j=0; j<n2; j++){
                        if(arr1[i] == arr2[j]){
                        count = count + 1;
                        break;
                    }
                }
            }
    

        if(count == n1 && count == n2){
                System.out.print("Both array are equal ");
            }else{
                System.out.print("Both array are not equal ");
            }
      }

    }
























//-----------------------------------Approach 2nd ------------------------
/*


import java.util.Arrays;
import java.util.Scanner;
public class Check_Two_Arrays_Are_Equals_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //----first Array---------
        int a[] = {10,20,30};
        int b[] = {10,20,30};
        
        boolean result = Arrays.equals(a,b);
        
        if(result == true){
            System.out.println("Both Array are equals ");
        }else{
            System.out.println("Both array are not equals ");
        }
        
       
       
    }
}

*/
