

//output
//String str1 = "abcdef";
//String str2 = "defghia";
//the total matching character is : 4


//String str1 = "aabcddekll12";
//String str2 = "bb22ll@55k";
//the total matching character is : 5



public class Count_the_Number_of_matching_characters_in_a_pair_of_strings{


      static int matchCharacter(String str1, String str2){
  
          int n1 = str1.length();
          int count = 0;
          for(int i=0; i<n1; i++){
              if(str2.indexOf(str1.charAt(i))>= 0){
                  count = count + 1;
              }
          }
          return count;
      }
  
      /* Driver program*/
      public static void main(String args[])
      {
  //        String str1 = "abcdef";
  //        String str2 = "defghia";
  
          String str1 = "aabcddekll12";
          String str2 = "bb22ll@55k";
  
  //        matchCharacter(str1, str2);
          System.out.println("matching character is : " + matchCharacter(str1, str2));
  
      }
  }
  
  