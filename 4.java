// TO run thi program plz change its name to test.java 
class test
{
  public static char findMissingLetter(char[] array)
  {
    char character = '\0';
    for (int i=0;i< array.length-1 ;i++){
      
      if ((int)array[i+1]-(int)array[i] == 2){
      int num=(int)array[i]+1;
      character = (char)num;
  
      }
    }
     return character;
   
  }

 	public static void main(String[] args) {
 
  	System.out.println(findMissingLetter(new char[] {'k','m','n','o' }));
  
  }
}