package Com.InerPoint;
import Com.Tasks.*;

/**
 * Created by Администратор on 25.10.2016.
 */
public class Main {
    public static void main(String[] args)
    {

        //region StopIfDot
        StopIfDot sid = new StopIfDot("hello. world");
        System.out.println("Точка в предложении встречается в позиции - " + sid.ParsString());
        //endregion

        //region WeightMoon
        WeightOnMoon wom = new WeightOnMoon(110);
        System.out.println("Вес на земле = " + 110);
        System.out.println("Вес на луне = " + wom.WeightOnTheMoon());
        //endregion


    }
}
