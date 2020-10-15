import java.util.*;
public class RSAdecode
{

   static String[] list;
   static long[] result;
   static int count;
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the public key");
      long e = input.nextLong();
      int pq = input.nextInt();
      Double factorpq = factors(pq);
      long newP = (factorpq.x-1);
      long newQ = (factorpq.y-1);
      long newN = newP*newQ;
      Triple triple = new Triple();
      GCDxy p = new GCDxy();      
      if(newN > e)
      {
         triple = p.ExGCD(newN,e);
      }
      else
         triple = p.ExGCD(e,newN);
      long newD;
      if(triple.x <   0)
      {
         newD = ((triple.x)+newN)%(newP*newQ);
      }
      else newD = ((triple.y)+newN)%(newP*newQ);
   System.out.println(newD);
      decryption(newD,pq);   
   }//end main 
   
   
   public static void decryption(long num, long pq)
   {
      count  =0;
      Scanner input = new Scanner (System.in);
      result = new long [100];
      RSA decode = new RSA();
      System.out.println("Please enter the message");
      String phrase1 = input.nextLine();
      splitPhrase(phrase1);
      for(int i = 0; i<list.length;i++)
      {
         if(list[i] != null)
         {
            result[i] = decode.key(num,pq,(Long.parseLong(list[i])));
            count++;
         }
      }//end for loop
      for(int i = 0; i<count;i++)
      {
      
         result[i] = (result[i]%65);
      }
      for(int i = 0; i<count;i++)
      {
      System.out.print(result[i] + " ");
     //System.out.print((char)((result[i]));
      }
      System.out.println();
      for(int i = 0; i<count;i++)
      {
    int a = (int)result[i];
     System.out.print((char)(a+65));
     
      }
   }// end decryption
   
   public static void splitPhrase(String phrase)
   {
      list=new String [100];
      list = phrase.split(",");
   }
   
   public static Double factors(long num)
   {
      Double factors = new Double();
      for(long i = 1; i < num; i++)
      {
         if(num%i == 0)
         {
            long factor = num/i;
            factors = new Double(i,factor);
         }
      }//end forloop
      return factors;
   }//end factors

}//end class