import java.util.*;

public class GCDPrimes
{//#5 on lab
   static boolean prime[] = new boolean[10000];
   public static void main(String[]args)
   {
   
      for(int i = 0;i<prime.length;i++) 
         prime[i]=true; 
   
    // 0 and 1 are not prime numbers  
      prime[0] = false;  
      prime[1] = false;  
      for (int p = 2; p * p < 10000; p++) {  
      
        // If prime[p] is not changed, then it is a prime  
         if (prime[p] == true) {  
         
            // Update all multiples of p as non-prime  
            for (int i = p * p; i < 10000; i += p)  
               prime[i] = false;  
         }  
      }  
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter two number to find the greatest common divisor");
      int one = input.nextInt();
      int two = input.nextInt();
      int result = 0;
      Stack<Integer> stack1 = new Stack<Integer>();
      Stack<Integer> stack2 = new Stack<Integer>();
      common_prime(one,stack1);
      common_prime(two,stack2); 
      int gcd = CheckPrimes(stack1,stack2);
      System.out.println("The GCD of "+one+ " and " + two + " is " + gcd); 
   }

   static void common_prime(int a, Stack stack)  
   {      
    // Find the prime divisors of the gcd  
      for (int i = 2; i <= (a); i++)
      {  
      
        // If i is prime and a divisor of gcd  
         if (prime[i] && a % i == 0)
         {  
            stack.push(i);
            int c = a/i;
            if(c!=1)
            {
               common_prime(c,stack);
               break;
            }  
         }  
      }
        
   
     
   
   }
   public static int CheckPrimes(Stack stack1, Stack stack2)
   {
      int gcd = 1;
      while(!stack1.empty()&&!stack2.empty())
      {
         int one= 0;
         int two = 0;
         one = (int)stack1.pop();
         two = (int)stack2.pop();
         System.out.println(one + "\t\t"+ two);
         if(one == two)
         {
            gcd = gcd*one;
         }
      }
      return gcd;
   }
}




