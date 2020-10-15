import java.util.*;
public class decoded
{
   public static void main(String[]args)
   {
   
      String code = "";
      String text = "";
      String encoded = "";
      String decoded = "";
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the codeword: ");
      code = input.nextLine();
      System.out.println("Enter the desired text to decrypt");
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
         
        
         
         Dtemp = (Ttemp - Ctemp + 26)%26;
         decoded = decoded + (char)(Dtemp + 97);
         
      } 
      System.out.println(decoded);
   }
}

