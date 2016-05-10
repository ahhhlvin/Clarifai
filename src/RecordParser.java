import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by alvin2 on 5/10/16.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class RecordParser
{

     public List<Record> parseTop (List<Record> totalRecords) {
        List<Record> topRecords = new ArrayList<Record>();
        Collections.sort(totalRecords, new Record());

         if (topRecords.size() > 1000)
         {
             for(int i = 0; i < 1000; i++)
             {
                 topRecords.add(totalRecords.get(i));
             }
         }

        return topRecords;
    }


    public float getScore (Record currRec) {
        return currRec.getScore();
    }

}


