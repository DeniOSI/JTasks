package Com.Tasks;

/**
 * Created by Osipenko on 25.10.2016.
 */
public class ChangeWord {
    private String str;
    public String resultString="";
    public ChangeWord(String InStr)
    {
        str = InStr;
    }

    public String Cenz()
    {
        String[] resArr = str.split(" ");
        for (String st:
             resArr ) {
            System.out.println(st);

        }
        for(int i=0; i< resArr.length; i++)
        {
            if(resArr[i].equals("бяка")) {
            resultString = resultString + " цензура ";
            }
            else
            resultString += resArr[i];
        }
        return resultString;
    }
}
