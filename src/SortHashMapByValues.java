import java.util.*;

public class SortHashMapByValues {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        hm.put("Math",98);
        hm.put(null,88);

        Map<String,Integer> sortedMap=sortByValues(hm);
        for(String str:sortedMap.keySet()){
            System.out.println(str+ ":"+sortedMap.get(str));
        }
        System.out.println(hm.values());//Collection view of values

        HashSet<Integer> set=new HashSet<>();
        System.out.println(set.add(10));//true
        System.out.println(set.add(10));//false
    }
    public static Map<String,Integer> sortByValues(HashMap<String, Integer> hm){
        List<Map.Entry<String,Integer>> list=new ArrayList<>(hm.entrySet());

      // list.sort((Map.Entry<String,Integer> entry1,Map.Entry<String,Integer> entry2) -> entry1.getValue() - entry2.getValue());

       Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
           @Override
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o1.getValue()-o2.getValue();
           }
       });

      // Collections.reverse(list);
       //Very important that you convert the sorted list to a LINKEDHASHMAP and not just HashMap(order gets changed again)

        Map<String,Integer> tempHashMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:list){
           tempHashMap.put(entry.getKey(),entry.getValue());
       }
        return tempHashMap;


    }
}
