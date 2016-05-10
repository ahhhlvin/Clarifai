import java.util.Comparator;

/**
 * Created by alvin2 on 5/10/16.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Record implements Comparator<Record>
{
    float score;

    public Record() {}

    public Record(float score)
    {
        this.score = score;
    }

    public float getScore()
    {
        return score;
    }

    public void setScore(float score)
    {
        this.score = score;
    }


    @Override
    public int compare(Record o1, Record o2)
    {
        float diff = o1.getScore() - o2.getScore();
        if(diff < 0)
        {
            return 1;
        }
        if(diff > 0)
        {
            return - 1;
        }

        return 0;
    }
}


