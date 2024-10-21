

//Enter the String : geeks
//Enter the Charater : g
//Total Number  of  g is : 5

//Enter the String : geeks
//Enter the Charater : e
//Total Number  of  e is : 17

//Enter the String : geeksforgeeks
//Enter the Charater : k
//Total Number of  k is : 64



import java.util.Scanner;
public class Count_all_substrings_having_character_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        int n = str.length();


        System.out.print("Enter the Charater : ");
        char ch = sc.next().charAt(0); // ch = 'k';



        int count = 0;
        String str1 = "";
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++) {
                str1 = str.substring(i, j);
                int n1 = str1.length();
                for (int k = n1 - 1; k >= 0; k--) {
                    if (str1.charAt(k) == ch) {
                        count = count + 1;
                    }
                }

            }
        }

        System.out.print("Total Number  of  " + ch + " is : " + count);


    }
}











