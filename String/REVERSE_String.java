



// String str = "geeksforgeeks";
// The reverse String is :  skeegrofskeeg

// String str = "congratulation";
// The reverse String is :  snoitalutargnoc


//=============Time Complexity : O(n)======Method - 01======


public class REVERSE_String {

      static void reverseString(String str, int n){
            char[] s = str.toCharArray(); 
            
            char temp;
            int left = 0;
            int right = str.length() - 1;
            while(left < right){
                  temp = s[left];
                  s[left] = s[right];
                  s[right] = temp;
                  left++;
                  right--;
            }

            for(int i=0; i<n; i++){
                  System.out.print(s[i]);
            }
     
      }
  
      public static void main(String[] args){
  
  
         String str = "geeksforgeeks";
         int n = str.length();

          reverseString(str, n);
          
      }
  
}
  


//=============Time Complexity : O(n)=====Method - 02=======
  
/* 
  public class REVERSE_String {

      static String reverseString(String str, int n){
            char[] s = str.toCharArray(); 
            
            String rev = "";
            for(int i=n-1; i>=0; i--){
                  rev = rev + str.charAt(i);
            }

            return rev;
     
      }
  
      public static void main(String[] args){
  
  
         String str = "geeksforgeeks";
         int n = str.length();

      //     reverseString(str, n);

            System.out.println("The Reverse String is : " + reverseString(str, n));

          
      }
  
  }
  
  */