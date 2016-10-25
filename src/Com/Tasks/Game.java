package Com.Tasks;

import java.util.Random;

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

    public short SymbolToNumb(char ch)
    {
        for(int i=0; i< Alfabet.length; i++)
        {
            if(Alfabet[i]==ch) {return (short)i;}
        }
        return -1;
    }

}
