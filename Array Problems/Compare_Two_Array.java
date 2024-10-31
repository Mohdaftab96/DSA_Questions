



import java.util.Scanner;
public class Compare_Two_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


       
        int arr1[] = {10, 20, 30, 40, 50};
        int arr2[] =  arr1;
        int arr3[] = {10, 20, 40, 40, 50};
        int arr4[] = {10, 25, 40, 40, 5};

       
        //----------------Compare Array 1st and Array 2nd---------
        
        if(arr1 == arr2){
            System.out.println("arr1 & arr2 is same ");
        
        }else{
            System.out.println("arr1 & arr2 is not same ");
            
        }



        //----------------Compare Array 1st and Array 3rd---------
     
        if(arr1 == arr3){
            System.out.println("arr1 & arr3 is same "); 
        }   
        else{
            System.out.println("arr1 & arr3 is not same ");   
        }


        //----------------Compare Array 1st and Array 4th---------
     
        if(arr1 == arr4){
            System.out.println("arr1 & arr4 is same "); 
        }   
        else{
            System.out.println("arr1 & arr4 is not same ");   
        }

    



    }
}

        
        
