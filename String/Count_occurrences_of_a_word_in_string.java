

// String str = "GeeksforGeeks A  portal portal computer science portal for geeks";
// String word = "portal";
// Occurrences of Word : 3 Times


// string = "GeeksforGeeks A computer science portal for geeks";
// word = "technical";
// Occurrences of Word : 0 Times



public class Count_occurrences_of_a_word_in_string{

      static int countOccurrences(String str, String word) {
  
          String a[] = str.split(" "); // str.split() becoz break a delimited String into substring
          int n = a.length;
  //        System.out.print(n + " "); // 8
  
          int count = 0;
  
          for(int i=0; i<n-1; i++)
             if(word.equals(a[i])){
                 count = count + 1;
             }
             return count;
  
      }
  
      /* Driver program*/
      public static void main(String args[])
      {
          String str = "GeeksforGeeks A  portal portal computer science portal for geeks";
          String word = "technical";
  
  //        countOccurrences(str, word);
          System.out.println("Occurrences of Word : " + countOccurrences(str, word) + " Times");
  
      }
  }
  
  