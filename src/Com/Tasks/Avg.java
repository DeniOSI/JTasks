package Com.Tasks;

/**
 * Created by Администратор on 27.10.2016.
 */
public class Avg {
    private double[] avg_arr;

    public Avg(double[] avg)
    {
        avg_arr = avg;
    }

    public double AvgS()
    {
        double av=0;
        int count = 1;
        for(int i=0; i< avg_arr.length; i++, count++)
        {
            av += avg_arr[i];

        }
        return av/count ;
    }
}
