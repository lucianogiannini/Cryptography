import java.util.*;
public class GCDAll
{//#4 on lab
   public static void main (String [] args)
   
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter two number to find the greatest common divisor");
      long one = input.nextLong();
      long two = input.nextLong();
      int result = 0;
      if(one >= two)
      {
         result = newGCD(one, two);
      }
      else
      {
         result = newGCD(two,one);
      }
      System.out.println(result);
   }
   
   
   public static int newGCD(long a, long b)
   {
      if(b == 0)
      {
         return (int)a;
      }
      if(b == 1)
      {
         return 1;
      }
      int gcd = 0;
      for(int i = 1; i<= a; i++)
      {
         if(a%i == 0 && b%i ==0)
         {
            gcd = i;
         }
      }
      return gcd;
   }
}
