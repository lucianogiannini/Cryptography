import java.util.*;
public class GCDIter
{//# 6 on lab
   public static void main (String [] args)
   
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter two number to find the greatest common divisor");
      int one = input.nextInt();
      int two = input.nextInt();
      int result = 0;
      if(one >= two)
      {
      result = one;
         while(one!=0 && two!=0)
         {
            result = one;
            int a = one;
            int b = two;
            two = a%b;
            one = b;
         }
         result = one;
      }
      else
      {
       result = two;
         while(one!=0 && two!=0)
         {
        
            result = two;
            int a = one;
            int b = two;
            one = b%a;
            two = a;
         }
         result = two;
         }
         System.out.println(result);
      
   }
}


