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
//        Game gm = new Game();
//        char getCh = gm.GenSymbol();
//        Scanner sc = new Scanner(System.in);
//        do{
//            System.out.println("Enter you symbol");
//            char ch = sc.nextLine().charAt(0);
//            if(gm.SymbolToNumb(ch) == gm.SymbolToNumb(getCh))
//            {
//                System.out.println("Right"); return;
//            } else if(gm.SymbolToNumb(ch) > gm.SymbolToNumb(getCh))
//            {
//                System.out.println("You’re too high");
//            }
//            System.out.println("You’re too low");
//
//        } while (true);
        //endregion

        //region simpleNumber
//        SimpleNubmer sn = new SimpleNubmer(99);
//        sn.PrinSimp();

//        SimpleNubmer SnB = new SimpleNubmer(20, 88);
//        SnB.PrinSimp();
        //endregion

        //region Avg
//        double[] arr = {14.44, 24.2, 44.9, 889.1};
//        Avg av = new Avg(arr);
//        for (double db: arr)
//        {
//            System.out.print(db + "|");
//
//        }
//
//        System.out.println( "Среднее значение = " + av.AvgS());
        //endregion

        //region TurnST
        TurnStr tst = new TurnStr("А роза упала на лапу азора");
        tst.PrintStr();
        //endregion

        //region Places
    //    int times[] = {33, 10, 99, 12, 44};
    //    String[] names = {"Ben", "Tony", "leo", "San", "Chen"};
//        Marathon m1 = new Marathon(names, times);
     //   m1.InfoPlaces();
        //endregion

    }
}
