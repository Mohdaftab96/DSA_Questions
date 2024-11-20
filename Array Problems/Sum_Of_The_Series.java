

      
public class Sum_Of_The_Series{

      static double sumOfSeries(int n){
   
            // Function to return sum of 
            // 1/1 + 1/2 + 1/3 + 1/4 + ..+ 1/n 

            double i, sum = 0.0;
            for(i=1; i<=n; i++){
                  sum = sum + (1/i);
            }
            return sum;
      }


      public static void main(String[] args){


            // int n = 5;   //  Sum of Series : 2.283333333333333
            int n = 10;  // Sum of Series : 2.9289682539682538
            
            System.out.println("Sum of Series : " + sumOfSeries(n));
            
      

      }
      
}





