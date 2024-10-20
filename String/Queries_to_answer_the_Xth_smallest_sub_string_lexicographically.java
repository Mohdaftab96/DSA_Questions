

// Enter the String : geek
// Enter the Queries Length : 3
// Enter the Queries Elements : 1 5 10
// e ek k 

// Enter the String : abcgdhge
// Enter the Queries Length : 2
// Enter the Queries Elements : 15 32
// bcgdhge gdhge



import java.util.Scanner;
public class Queries_to_answer_the_Xth_smallest_sub_string_lexicographically {

    public static void main(String[] args) {
    
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next(); // str = geek
        int n = str.length();

        int count = 0;
        String sum = "";
        String[] arr = new String[100];
        
        //----------Finding Subtring of Given String and storing String as a Array ----------
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                sum = str.substring(i, j);
                
                arr[count] = sum;
                count = count + 1;
            }
        }
        
        int n1 = count;
        
        //-------------------Sorting Subtring-----------------
        
        String temp = "";
        for(int i=0; i<n1; i++){
            for(int j=i+1; j<n1; j++){
                if(arr[i].compareTo(arr[j])>0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // for(int i=0; i<n1; i++){
        //     System.out.print(arr[i] + " ");
        // }
        
        //-------------Finding the value that given as a queries------------



        System.out.print("Enter the Queries Length : ");
        int n2 = sc.nextInt(); // n2 = 3
        
        int[] query = new int[n2];
        System.out.print("Enter the Queries Elements : ");
        for(int i=0; i<n2; i++){
            query[i] = sc.nextInt();
        }
        
        
        for(int i=0; i<n2; i++){
            System.out.print(arr[query[i] - 1] + " ");
        }
        
        
    } 
        
}
        
        
        
        
        
        
        
        
        

        
        