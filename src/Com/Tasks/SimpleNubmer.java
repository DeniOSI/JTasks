package Com.Tasks;

/**
 * Created by Администратор on 27.10.2016.
 */
public class SimpleNubmer {
    private int lowBorder;
    private int haightBorder;

    private boolean SNum(int Num)
    {
        for(int i=2; i< Num/2; i++)
        if((Num % i) ==0) {return false;}
        return true;
    }

    public SimpleNubmer(int hB)
    {
        haightBorder = hB;
        lowBorder = 1;
    }

    public SimpleNubmer( int lowBorder, int hB)
    {
        haightBorder = hB;
        this.lowBorder = lowBorder;
    }

    public void PrinSimp()
    {
        if(haightBorder == 1) {
            System.out.println("число" + 1 + "атом");
        }else if(haightBorder == 2) {System.out.println("число" + 2 + "простое");}
        else
        for(int i = lowBorder; i< haightBorder; i++)
        {
            if(SNum(i))
            {
                System.out.println("число " + i + " простое");
            }
            else
            {
                System.out.println("число " + i + " сотавное");
            }
        }
    }



}
