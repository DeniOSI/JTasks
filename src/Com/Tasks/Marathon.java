package Com.Tasks;

import java.security.SecureRandom;

/**
 * Created by Osipenko on 27.10.2016.
 */
public class Marathon {
    private String names[];
    private int[] times;

    public Marathon(String[] n, int[] t)
    {
        names = n;
        times = t;
    }

    public void InfoPlaces()
    {
        CalcPlace();
        for(int i= 0; i< 3; i++)
        {
            System.out.println(i+1 + "Место у " + names[i] + " со временем: " + times[i]);
        }
    }

    private void CalcPlace()
    {
        for(int i=0; i< times.length; i++)
        {
            for(int j=0; j<times.length; j++)
            {
                if(times[i]< times[j])
                {
                    int temp;
                    String sTemp;
                    temp = times[i];
                    times[i] = times[j];
                    times[j] = temp;
                    sTemp = names[i];
                    names[i] = names[j];
                    names[j] = sTemp;

                }
            }
        }
    }
}
