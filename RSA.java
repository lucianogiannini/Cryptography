import java.util.*;
public class RSA
{

   public static void main(String[]args)
   {  Scanner input = new Scanner(System.in);
      System.out.println("Please enter the private key e, them m");
      long exp = input.nextLong();
      long mod = input.nextLong();
      System.out.println("Please enter the number to encode");
      long base = input.nextLong();
      long result = key(exp, mod,base);
      System.out.println("Encoded number "+result);
   }

   public static long key(long e, long m, long w)
   {
      
      if(e == 1)
      {
         return w%m;
      }
      else if(e % 2 ==0)
      {
         return ((long)Math.pow((key(e/2,m,w)),2))%m;
      }
      else 
      {
         return (w*key(e-1,m,w))%m;
      }
   
   } 








}