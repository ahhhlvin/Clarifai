import java.util.Comparator;

/**
 * Created by alvin2 on 5/10/16.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Term implements Comparator<Term>
{
    String term;
    double weight = 0;

    public Term(String term, double weight)
    {
        this.term = term;
        this.weight = weight;
    }

    public Term()
    {
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String getTerm()
    {
        return term;
    }

    public void setTerm(String term)
    {
        this.term = term;
    }

    @Override
    public int compare(Term o1, Term o2)
    {
        double diff= o1.getWeight() - o2.getWeight();
        if(diff < 0) return 1;
        if(diff > 0) return -1;

        return 0;    }
}
