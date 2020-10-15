import java.util.*;
public class Shift
{
public static void main (String [] args)

{

Scanner input = new Scanner(System.in);
System.out.println("Input Text to be encoded");
String text  = input.nextLine();
System.out.println("Input the codeword");
String codeword = input.nextLine();

String result = encode(text, codeword);
String decode = decode(result, codeword);
System.out.println(result);
System.out.println(decode);
}

public static String encode(String t, String c)
{
int counter = 0;
String result = "";
for(int i = 0; i < t.length(); i++)
{

int te = t.charAt(i) + 0;
int ce = c.charAt(counter) + 0;
// System.out.println(te);
// System.out.println(ce);
// System.out.println("");
int x = ((te + ce)%26+65);
//System.out.println(x);
result += (char)x;
if(counter == c.length()-1)
{
counter = 0;
}
else
counter++;
}
return result;

}

public static String decode(String r, String c)
{

int counter = 0;
String result = "";
for(int i = 0; i < r.length(); i++)
{

int re = r.charAt(i) + 0;
int ce = c.charAt(counter) + 0;
// System.out.println(te);
// System.out.println(ce);
// System.out.println("");
int x = (re-ce)%26 +65;
//System.out.println(x);
result += (char)x;
if(counter == c.length()-1)
{
counter = 0;
}
else
counter++;
}
return result;



}
}
 