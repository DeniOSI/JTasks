package Com.Tasks;

/**
 * Created by Администратор on 25.10.2016.
 */
public class ElemPlus10 {
    int baseArr[];
    int resultArr[];

    public  ElemPlus10(int InArr[])
    {
        baseArr = InArr;
        resultArr = new int[baseArr.length];

    }

    public int[] PlusTen()
    {

        for(int i =0; i<baseArr.length; i++)
        {
            resultArr[i]=baseArr[i] + (int)(baseArr[i] * 0.10);
        }
        return  resultArr;
    }
}
