package Com.InerPoint;
import Com.Tasks.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {

        //region StopIfDot
//        StopIfDot sid = new StopIfDot("hello. world");
//        System.out.println("Точка в предложении встречается в позиции - " + sid.ParsString());
        //endregion

        //region WeightMoon
//        WeightOnMoon wom = new WeightOnMoon(110);
//        System.out.println("Вес на земле = " + 110);
//        System.out.println("Вес на луне = " + wom.WeightOnTheMoon());
        //endregion

        //region PlusTen
//        int[] arr = {10, 30, 15, 18};
//        System.out.print("Базовый массив");
//        System.out.println();
//        for (int value: arr
//             ) {
//            System.out.print(value + " | ");
//
//        }
//
//        System.out.println();
//        ElemPlus10 ep = new ElemPlus10(arr);
//        arr = ep.PlusTen();
//        System.out.println("Результатирующий массив");
//        for (int value: arr
//                ) {
//            System.out.print(value + " | ");
//
//        }


        //endregion

        //region Cenzura
//        System.out.println();
//
//        ChangeWord cw = new ChangeWord("всякая кака бяка");
//        System.out.println(cw.Cenz());
        //endregion

        //region Game
        Game gm = new Game();
        char getCh = gm.GenSymbol();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter you symbol");
            char ch = sc.nextLine().charAt(0);
            if(gm.SymbolToNumb(ch) == gm.SymbolToNumb(getCh))
            {
                System.out.println("Right"); return;
            } else if(gm.SymbolToNumb(ch) > gm.SymbolToNumb(getCh))
            {
                System.out.println("You’re too high");
            }
            System.out.println("You’re too low");

        } while (true);
        //endregion
    }
}
