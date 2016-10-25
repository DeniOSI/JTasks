package Com.Tasks;

/**
 * Created by Администратор on 25.10.2016.
 */
public class WeightOnMoon {
    private int baseWeight;
    private double weightMoon;
    public WeightOnMoon(int weight)
    {
        baseWeight = weight;

    }

    public double WeightOnTheMoon()
    {
        final double M = 0.17d;
        return weightMoon = baseWeight * M;

    }

}
