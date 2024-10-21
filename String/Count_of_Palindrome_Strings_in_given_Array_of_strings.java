



//String[] str = {"abc", "car", "ada", "racecar", "cool"}
//Count Palindrome String : 2


//String[] str = {"def", "aba"}
//Count Palindrome String : 1

public class Count_of_Palindrome_Strings_in_given_Array_of_strings {
      static boolean isPalindrome(String s){
  
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
  
      static int countPalindrome(String[] arr, int n){
  
  
          int count = 0;
          for(int i=0; i<n; i++){
              if(isPalindrome(arr[i])){
                  count = count + 1;
              }
          }
          return count;
      }
  
  
      public static void main(String[] args){
  
          String[] arr = {"def", "ada"};
          int n = arr.length;
  
  //        countPalindrome(str, n);
  
          System.out.println("Count Palindrome String : " + countPalindrome(arr, n));
  
      }
  }



