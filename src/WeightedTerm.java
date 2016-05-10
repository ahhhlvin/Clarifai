import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by alvin2 on 5/10/16.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class WeightedTerm
{

    public static void main(String[] args)
    {
        // Search Test

        List<Term> exampleList = weightedTerm("Pizza 5 Brooklyn");

        for (Term t : exampleList) {
            System.out.println(t.getTerm() + " = " + t.getWeight());
        }
    }

    public static List<Term> weightedTerm(String query) {


        List<Term> resultList = new ArrayList<Term>();
        String[] parts = query.split(" ");

        List<String> partsList = new ArrayList<String>();

        partsList.addAll(Arrays.asList(parts));

        if (parts.length % 2 != 0) {
            partsList.add("0");
        }

        for (int i = 0; i < partsList.size(); i += 2) {

           Term newTerm = new Term(partsList.get(i), Double.valueOf(partsList.get(i + 1)));
            resultList.add(newTerm);
        }

        Collections.sort(resultList, new Term());
        return resultList;

    }
}
