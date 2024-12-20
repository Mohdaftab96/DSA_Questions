



//Input : str = "Too hot to hoot."
//Output : Sentence is palindrome.

//Input : str = "Abc def ghi jklm."
//Output : Sentence is not palindrome.


public class Check_Sentence_Palindrome_Or_After_Removing_Spaces_Dots{

      static boolean checkingSentencePalindrom(String str){
  
  
  
          StringBuilder sb = new StringBuilder();
  
          // Remving Dot(.) from str
          int n = str.length();
          for(int i=0; i<n; i++){
              char str1 = str.charAt(i);
              if(str1 != '.'){
                  sb.append(str1);
              }
          }
  
          String str2 = sb.toString(); // sb.toString() method converting a StringBuilder object to a string representation.
          String str3 = str2.replaceAll(" ", ""); // removing All Spaces
          String str4 = str3.toLowerCase(); // Converting UpperCase character to LowerCase
  
          int left = 0;
          int right = str4.length() - 1;
  
          //Checking Palindrom
          while(left < right){
              if(str4.charAt(left) != str4.charAt(right)){
                  return false;
              }
              left++;
              right--;
          }
  
          return true;
      }
  
      public static void main(String[] args){
  
  
          String str = "Too hot to hoot.";
  
  
          boolean x = checkingSentencePalindrom(str);
  
          if(x == true){
              System.out.print("Given Sentence is palindrome.");
          }else{
              System.out.print("Given Sentence is not palindrome.");
          }
  
  
  
  
      }
  }
  