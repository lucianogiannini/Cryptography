import java.util.*;
public class GCDxy
{
   public static void main (String [] args)
   
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter two number to find the greatest common divisor");
      long one = input.nextInt();
      long two = input.nextInt();
      Triple result = new Triple();
      if(one >= two)
      {
         result = ExGCD(one, two);
         System.out.println(result.g+" "+result.x+" "+result.y);
         System.out.println(result.g+" "+(result.x+two)+" "+(result.y-one));
      
      
      }
      else
      {
         result = ExGCD(two,one);
         System.out.println(result.g+" "+result.x+" "+result.y);
         System.out.println(result.g+" "+(result.x+one)+" "+(result.y-two));
      
      }
   
   }

   public static Triple ExGCD(long a,long b)
   {
      if (b == 0)
      {
         Triple temp = new Triple(a,1,0);
         return temp;
      }
      Triple z = ExGCD(b,a%b);
      Triple temp = new Triple(z.g,z.y,-z.y*(a/b)+z.x);
      return temp;
   }
}
