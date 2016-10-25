package Com.Tasks;

import java.util.Random;

/**
 * Created by Osipenko on 25.10.2016.
 */
public class Game {

    private char Alfabet[] = new  char[27];

    public Game()
    {
        GenAlfabet();
    }

    private void GenAlfabet() //Заполенения массива
    {
        int i=0;
        for (char ch = 'a'; ch<='z'; ch++, i++)
        {
            Alfabet[i] = ch;

        }

    }

    public char GenSymbol() //Генерацпя символа
    {
        Random rnd = new Random();
       return Alfabet[rnd.nextInt(27)];
    }



}
