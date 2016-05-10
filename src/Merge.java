import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alvin2 on 5/10/16.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Merge
{
    public static class MapMerge {
        /**
         * Merges two Maps. When the same key exists in both Maps, the MergeStrategy will be used to determine what to
         * set the value in the merged map to.
         */
        public static <K, V> Map<K, V> merge(Map<K, V> m1, Map<K, V> m2, MergeStrategy<V> mergeStrategy) {
            HashMap<K, V> map = new HashMap<K, V>();

            if (m1.size() > m2.size())
            {
                while(! m1.isEmpty())
                {
                    for(K k : m1.keySet())
                    {
                        if (!m2.containsKey(k)) {
                            map.put(k, m2.get(k));
                        } else {
                            map.put(k, mergeStrategy.onConflict(m1.get(k), m2.get(k)));
                        }
                    }
                }
            }


            return map;
        }
    }

    public interface MergeStrategy<V> {
        /**
         * @param v1 The first value that had a clashing key
         * @param v2 The second value that had a clashing key
         * @return The value that will be added to the merged map
         */
        V onConflict(V v1, V v2);
    }

    public class Strategy implements MergeStrategy<List> {

        public Strategy()
        {
        }

        @Override
        public List onConflict(List v1, List v2)
        {

            List<String> newList = new ArrayList<String>(v1);
            newList.addAll(v2);

            return newList;
        }
    }



    public void testMergeMaps() {
        Map<String, List<String>> m1 = new HashMap<>();
        Map<String, List<String>> m2 = new HashMap<>();




        // This MergeStrategy should concatenate the values of the two lists
        // if a list was present in both m1 and m2 under the same key
        MapMerge.merge(m1, m2, strategy); /* define this object to do the 2nd part of this exercise */);



    }
}
