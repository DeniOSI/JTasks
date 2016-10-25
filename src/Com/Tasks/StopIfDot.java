package Com.Tasks;

/**
 * Created by Администратор on 25.10.2016.
 */
public class StopIfDot {
    private String baseStr;
    public int countSymbol =0;
   public StopIfDot(String Str)
   {
       baseStr = Str;
   }

   public int ParsString()
   {
       for(int i=0; i< baseStr.length(); i++)
       {
           if(baseStr.charAt(i) == '.'){return countSymbol;}
           else {countSymbol++;}
       }
       return -1;
   }
}
