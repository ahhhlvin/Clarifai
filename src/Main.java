import java.util.ArrayList;
import java.util.List;

/**
 * Created by alvin2 on 5/10/16.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Main
{

    public static void main(String[] args)
    {

        // Record Test

        List<Record> records = new ArrayList<Record>();
        RecordParser parser = new RecordParser();

        for (int i = 0; i < 500; i++) {
            records.add(new Record(4000));
        }

        for (int i = 0; i < 200; i++) {
            records.add(new Record(2000));
        }

        for (int i = 0; i < 100; i++) {
            records.add(new Record(10));
        }

        for (int i = 0; i < 100; i++) {
            records.add(new Record(5000));
        }

        for (int i = 0; i < 100; i++) {
            records.add(new Record(700));
        }

        for (int i = 0; i < 30; i++) {
            records.add(new Record(50));
        }

        for (Record r : records) {
            parser.getScore(r);
        }

        parser.parseTop(records);

        for (int j = 0; j < records.size(); j++) {
            System.out.println(j + ": " + records.get(j).getScore());
        }
    }
}
