

// Enter the String : madam
// Count the number of unique characters in a given String is : 3


// Enter the String : geeksforgeeks
// Count the number of unique characters in a given String is : 7

import java.util.Scanner;
import java.util.HashSet;

public class Count_the_number_of_unique_characters_in_a_given_String_Using_HashSet{

      static int countDublicationElements(String str, int n){

            HashSet<Character> s = new HashSet<Character>();

            for(int i=0; i<n; i++){
                  s.add(str.charAt(i));
            }

            return s.size();
      }







      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the String : ");
            String str = sc.next(); // str = "madam"
            int n = str.length();

            // countDublicationElements(str, n);

            System.out.println("Count the number of unique characters in a given String is : " + countDublicationElements(str, n));


      }
      
}
