import java.util.ArrayList;
public class Kata {
  public static String createPhoneNumber(int[] numbers) {
  
    ArrayList<String> start= new ArrayList<>();
    ArrayList<String> middle= new ArrayList<>();
    ArrayList<String> end= new ArrayList<>();
    for(int i =0 ;i<3;i++){
     start.add(Integer.toString(numbers[i]));
   }
    for(int i= 3 ;i<6;i++){
      middle.add(Integer.toString(numbers[i]));
    }
    for(int i= 6 ;i<10;i++){
      end.add(Integer.toString(numbers[i]));
    }
    String s = String.join("", start);
    String m = String.join("", middle);
    String e = String.join("", end);
    
    return "("+s+") "+m+"-"+e  ;
  }
  
}