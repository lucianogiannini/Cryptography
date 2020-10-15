import java.util.*;
public class encrypted
{
   private String code;
   private String text;
   private String encoded;
   private String decoded;
   
   public encrypted()
   {
      code = "";
      text = "";
      encoded = "";
      decoded = "";
   }
   
   public static void main(String[]args)
   {
      encrypted e = new encrypted();
      e.jumble();
   }
   
   public void jumble()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the codeword: ");
      code = input.nextLine();
      System.out.println("Enter the desired text to encrypt");
      text = input.nextLine();
      
      int Cnum = 0, Ctemp = 0, Tnum = 0, Ttemp = 0, Enum = 0, Etemp = 0, Dnum = 0, Dtemp = 0;
      int Clength = 0, Tlength = 0, count = 0;
      
      Clength = code.length();
      Tlength = text.length();
      
      for(int i = 0; i < Tlength; i++)
      {
         Tnum = text.charAt(i) + 0; //gets ASII code 97 --> 122 
         Ttemp = Tnum - 97; //my numbers 0 --> 25
         
         if(count < Clength)
         {
            Cnum = code.charAt(count) + 0; //gets ASII code 97 --> 122
            Ctemp = Cnum - 97; //my numbers 0 --> 25
            count++;
         }
         else
         {
            count = 0;
            Cnum = code.charAt(count) + 0; //gets ASII code 97 --> 122
            Ctemp = Cnum - 97; //my numbers 0 --> 25
            count++;
         }
         
         Etemp = (Ttemp + Ctemp)%26;        
         encoded = encoded + (char)(Etemp + 97);
         
         Dtemp = (Etemp - Ctemp + 26)%26;
         decoded = decoded + (char)(Dtemp + 97);
      } 
      
      System.out.println("encrypted: " + encoded);
      System.out.println("Would you like to decrypt? 1 for yes, 0 for no.");
      int question = input.nextInt();
      if(question == 1)
      {
         System.out.println("dencrypted: " + decoded);  
      }
      else
         System.exit(0);
   }
}