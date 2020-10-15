public class CoincidenceEncription
{

  public static void main(String[]args)
  {
    //Text is already encrypted
    String text = "gieorbcxekrtovfdsyyzrishurbgxuovhvifkrqcsqymnpyyvgbwqvdqrxxfglndmzdlvxovxkbpcbeabepqxxtoxgrmfpvbweaisgrieqylsnhcxjkrakxrvplyyuyavwjropvxktyxgkqnuilyyhxhrbwgkrqxiiovtyrakkvfilyyhzrrfieqsaxeyoxlyyqyaaxiiovtyrakvhxeeyyaneanhrciedcberrfieqsaxezkorishmvlxiiovtyrakwnikbyhoiiaozrbkbxrndiyveysinxhuevgish";
    // NON ENCRYPTED TEXT: String text = "werenostrangerstoloveyouknowtherulesandsodoiafullcommitmentswhatimthinkingofyouwouldntgetthisfromanyotherguyijustwannatellyouhowimfeelinggottamakeyouunderstandnevergonnagiveyouupnevergonnaletyoudownnevergonnarunaroundanddesertyounevergonnamakeyoucrynevergonnasaygoodbyenevergonnatellalieandhurtyou";
    System.out.println("Rotation    Index of coincidence");
    for (int i = 1;i<text.length();i++)
    {
      String rotated = rotate(text,i);
      int index = findIndex(text,rotated);
      System.out.println(i+"           "+index);
    }
  }
  
  public static String rotate(String text, int rotations)
  {
    String rotated= "";
    for (int i = 0;i<text.length();i++)
    {
       rotated += text.charAt(rotations);
      if (rotations==text.length()-1)
        rotations = 0;
      else
        rotations++;
    }
    return rotated;
  }
  
  public static int findIndex(String text,String rotated)
  {
    double amount = 0.0;
    for (int i = 0;i<text.length()-1;i++)
    {
      if (text.charAt(i)==rotated.charAt(i))
        amount++;
    }
    double temp = ((double)(amount/text.length())*100);
    int yurr = (int) temp;
    return (yurr);
  }
}