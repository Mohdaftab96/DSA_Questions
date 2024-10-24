



//Input : Madam Arora teaches malayalam
//Output : 3

//Input : nitin speaks malayalam
//Output : 2




public class Count_palindrome_words_in_a_sentence{


      static boolean isPalindromic(String s){
  
        String str1= s.toLowerCase();
          // checking Palindrome
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
  
  
      static int countPalindromicWords(String str){
  
          
      //     System.out.println(str1 + " ");
          int count = 0;
          String[] arr= str.split( " ");
  
          for(String st: arr){
              if(isPalindromic(st)){
                  count = count + 1;
              }
          }
          return count;
      }
      
  
      public static void main(String[] args){
  
  
          System.out.println("Count palindrome words in a sentence : " + countPalindromicWords("Madam Arora teaches Malayalam")); // output : 3
          System.out.println("Count palindrome words in a sentence : " + countPalindromicWords("Nitin speaks malayalam")); // output : 2
  
  
      }
  
  }
  