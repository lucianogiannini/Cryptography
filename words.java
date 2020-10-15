public class words
{
public static void main(String[]args)
{
for(int i=0; i < 26; i++)
for(int j=0; j < 26; j++)
for(int k=0; k < 26; k++)
for(int l=0; l < 26; l++)
for(int m=0; m < 26; m++)
{
if(i != j && l!=m)
System.out.println(((char)(i+65))+""+((char)(j+65))+""+((char)(k+65))+""+((char)(l+65))+""+((char)(m+65)));

}


}
}