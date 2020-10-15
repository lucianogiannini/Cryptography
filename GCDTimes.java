import java.util.*;
public class GCDTimes
{
public static void main(String[]args)
{
int num1 = 676865576;
int num2 = 1221321;
long start = 0;
long end = 0;
GCDAll gcdall = new GCDAll();
GCD gcdrecur = new GCD();
GCDIter gcditer = new GCDIter();
GCDPrimes gcdPrimes = new GCDPrimes();
Random rng = new Random();

 start = System.currentTimeMillis();
GCDAll.GCDall(num1,num2);
 end = System.currentTimeMillis();
long total3 = end - start;
System.out.println("The time for GCD that goes through all numbers is " + total3 + " milliseconds");   

  start = System.currentTimeMillis();
GCD.GCDrec(num1,num2);
 end = System.currentTimeMillis(); 
 total3 = end - start;
System.out.println("The time for GCD Recursive is " + total3 + " milliseconds");  

 start = System.currentTimeMillis();
gcditer.GCDiterative(num1,num2);
 end = System.currentTimeMillis();
 total3 = end - start;
System.out.println("The time for GCD Iterative is " + total3 + " milliseconds");  


 start = System.currentTimeMillis();
GCDPrimes.GCDprimes(num1,num2);
 end = System.currentTimeMillis();
 total3 = end - start;
System.out.println("The time for GCD using prime factors is " + total3 + " milliseconds");  
}

}