import java.util.*;
public class GCD
{//# 6 on lab
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
      return newGCD(b,a%b);
   }
}
