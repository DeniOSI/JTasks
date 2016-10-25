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

        //region PlusTen
        int[] arr = {10, 30, 15, 18};
        System.out.print("Базовый массив");
        System.out.println();
        for (int value: arr
             ) {
            System.out.print(value + " | ");

        }

        System.out.println();
        ElemPlus10 ep = new ElemPlus10(arr);
        arr = ep.PlusTen();
        System.out.println("Результатирующий массив");
        for (int value: arr
                ) {
            System.out.print(value + " | ");

        }


        //endregion


    }
}
