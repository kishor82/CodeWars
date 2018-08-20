public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    // your code here
    char[] array=str.toCharArray();
    for(int i=0;i<array.length;i++)
    {
    if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
    {
    vowelsCount++;
    }
    }
    
    return vowelsCount;
  }

}