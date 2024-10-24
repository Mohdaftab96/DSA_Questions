
//Input : Madam Arora teaches Malayalam
//Output: Malayalam

//Input : Welcome to GeeksforGeeks
//Output : No Palindrome Word




public class Print_Longest_Palindrome_Word_in_a_sentence{


      static boolean isPal(String s){

           
            String str1 = s.toLowerCase();
            
            
            int left = 0;
            int right = str1.length() - 1;
            while(left < right){
                  if(str1.charAt(left) != str1.charAt(right)){
                        return false;
                  }
                  left++;
                  right--;
            }
            return true;
      }


      static String longestPalindrome(String str){

            String arr[] = str.split(" ");
            int n = arr.length;
            // System.out.println(n);


            String maxSubstring = "";
            for(int i=0; i<n; i++){
                  if(isPal(arr[i])){
                        String subStr = arr[i];
                        if(subStr.length() > maxSubstring.length()){
                              maxSubstring = subStr;
                        }
                  }
            }

            return maxSubstring;
      }


      public static void main(String[] args){

            String str = longestPalindrome("Madam AroraarorA teaches Malayalam");
            // String str = longestPalindrome("Welcome to GeeksforGeeks");
            
            if(!str.isEmpty()){
                  System.out.println("Longest Palindrome Word Found : " + str);
            }else{
                  System.out.println("No Palindrome Word ");
            }


      }
      
}
