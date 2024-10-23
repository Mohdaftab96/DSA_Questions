


// Enter the String : PramoD123$@gmail.com
// UpperCase is : 2
// LowerCase  is : 12
// DecimalNumber is : 3
// Space  is : 0
// SpecialCharacter is : 3

// Enter the String : RamKishan1507$@Gmail. com
// UpperCase is : 3 (RKG)
// LowerCase  is : 14 (amishanmailcom)
// DecimalNumber is : 4 (1507)
// Space  is : 1
// SpecialCharacter is : 3 ($ @ .)


// UpperCase [65 to 90]
// LowerCase [97 to 122]
// DecimalNumber [48 to 57]




import java.util.Scanner;
public class Write_a_program_to_display_number_of_LOWERCASE_UPPERCASE_SPECIAL_SYMBOLS_SPACES_GitHub {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine(); 
        int n = str.length();

        int LowerCase = 0, UpperCase = 0, DecimalNumber = 0, Space = 0, SpecialCharacter = 0;

        for(int i=0; i<n; i++){

            if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                UpperCase = UpperCase + 1;
            }else if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                LowerCase = LowerCase + 1;
            }else if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                DecimalNumber = DecimalNumber + 1;
            }else if(str.charAt(i) == ' '){
                Space = Space + 1;
            }else{
                SpecialCharacter = SpecialCharacter + 1;
            }

        }


        System.out.println("UpperCase is : " + UpperCase);
        System.out.println("LowerCase  is : " + LowerCase);
        System.out.println("DecimalNumber is : " + DecimalNumber);
        System.out.println("Space  is : " + Space);
        System.out.println("SpecialCharacter is : " + SpecialCharacter);
        

     
    }
}
  
  



