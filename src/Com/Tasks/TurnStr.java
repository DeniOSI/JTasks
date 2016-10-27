package Com.Tasks;

/**
 * Created by Администратор on 27.10.2016.
 */
public class TurnStr {
    private String basicString;
    private String[] splitStr;
    private String finStr;
    public TurnStr(String str)
    {
        basicString = str;
        splitStr = basicString.split("");
        finStr = "";

    }
    public void PrintStr()
    {
        System.out.println(TurnS(splitStr.length-1));
    }
    private String TurnS(int end)
    {
        finStr +=splitStr[end];
        if(end >= 1) TurnS(end-1);
        return finStr;
    }
}
