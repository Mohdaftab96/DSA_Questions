
// Input  : aassss
// Output : YES (Substring aa)
// Input  : gfg
// Output : NO

//==========TC of below code : O(n)===========

public class Check_if_a_string_contains_a_palindromic_sub_string_of_even_length{

      static boolean isPalindrome(String s) {
  
  
          for(int i=0;i<s.length()-1; i++){
              if(s.charAt(i) == s.charAt(i+1)){
                  return true;
              }
          }
          return false;
      }
  
      public static void main(String[] args){
  
         String str = "xzyyz";
//    String str = "gfg";
  
  
        if(isPalindrome(str)) {
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
  
  
      }
  }

//===============TC of below code : O(n^3) =============


/*
public class Check_if_a_string_contains_a_palindromic_sub_string_of_even_length{

      static boolean isPalindrome(String s2) {
          int left = 0;
          int right = s2.length() - 1;
  
          while(left < right){
              if(s2.charAt(left) != s2.charAt(right)){
                  return false;
              }
              left++;
              right--;
          }
  
          return true;
      }
  
  
      static boolean hasEvenLengthPalindrome(String str){
  
         int n = str.length() - 1;
         String sum = "";
          for(int i=0; i<n; i++){
              for(int j=i+1; j<=n; j++){
                  sum = str.substring(i, j);
                  if(isPalindrome(sum)){
                      if (sum.length() % 2 == 0) {
                          return true;
                      }
  
                  }
              }
          }
  
          return false;
      }
  
      public static void main(String[] args){
  
  //       String str = "acbbd";
          String str = "gfg";
  
  
  
        if(hasEvenLengthPalindrome(str)) {
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
  
  
      }
  }


*/