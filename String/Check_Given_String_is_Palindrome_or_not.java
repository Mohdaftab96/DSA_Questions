

// String str = "abba"
// Given String is Palindrome


// String str = "abc"
// Given String is not Palindrome



public class Check_Given_String_is_Palindrome_or_not{
    static boolean isPalindromeOrNot(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args){

       String str = "abbabbbabbabba";
//       String str = "aaba";

       boolean x = isPalindromeOrNot(str);

       if(x == true){
           System.out.println("Given String is Palindrome");
       }else{
           System.out.println("Given String is not Palindrome");
       }



    }
}



//=======================================================================

/* 
public class Check_Given_String_is_Palindrome_or_not {

      static boolean isPalindrome(String s){
  
          int left = 0;
          int right = s.length() - 1;
          while(left < right){
              while(s.charAt(left) != s.charAt(right)){
                  return true;
              }
              left++;
              right--;
          }
          return false;
      }
  
          static int checkPalindrome(String str, int n){
  
              int count = 1;
              if(isPalindrome(str)){
                  count = count + 1;
              }
              
              return count;
  
          }
  
  
      
  
      //Driver Code
      public static void main(String[] args){
  
          String str = "abc";
          int n = str.length();
  
          int x = checkPalindrome(str, n);
  
          if(x == 1){
              System.out.println("Given String is Palindrome");
          }else{
              System.out.println("Given String is not Palindrome");
          }
  
  
      }
  }
  
*/
