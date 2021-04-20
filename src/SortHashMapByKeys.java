import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKeys {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        // Adding Key and Value pairs to HashMap
        hashmap.put(22,"A");
        hashmap.put(55,"B");
        hashmap.put(33,"Z");
        hashmap.put(44,"M");
        hashmap.put(99,"I");
        hashmap.put(88,"X");

        for(Integer key:hashmap.keySet()){
            System.out.println(key + " "+hashmap.get(key));
        }

        //Sort based on keys
        Map<Integer,String> treeMap=new TreeMap<>(hashmap);
        for(Integer key:treeMap.keySet()){
            System.out.println(key + " "+treeMap.get(key));
        }

        Map map=new HashMap();
        map.put("abc",3);
        map.put("2",2);
        map.put(1,1);
        map.put("3",3);
        System.out.println(map);

        //gives ClassCastException if some keys are string and some are integer,bcos they couldn't be compared for ordering
        // homogenous elements are required for keys
        Map map1=new TreeMap();
        map1.put("abc",3);
        map1.put(2,3);
        map1.put("1",4);
        map1.put("3",5);
        System.out.println(map1);

    }
}
