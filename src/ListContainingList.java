import java.util.*;
import java.util.stream.Collectors;

public class ListContainingList {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            row.add(i);
            res.add(row);
            //System.out.println(res);
        }

        System.out.println(res);


        List<List<Integer>> res1 = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            row1.add(i);
            res1.add(new ArrayList<>(row1));
        }
        System.out.println(res1);






        //Since Integer is immutable object,content of list is unchanged if change made in copy
        //makes a shallow copy,both the list refer to the same objects
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        List<Integer> copy=new ArrayList<>(list);
        list.remove(new Integer(3));
        list.add(5);
        copy.add(4);
       // copy.remove(1);
        System.out.println(copy);
        System.out.println(list);

        //proof that they refer to the same objects
        System.out.println(copy.get(0) == list.get(0));
        System.out.println(copy.get(2) == list.get(2));



        //Concurrentmodification exception prevented by using it.remove()
        HashSet<Integer> set=new HashSet<>();
        set.add(3);
        set.add(6);
        set.add(7);
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            Integer num=(Integer)iterator.next();
            if(num== 6){
                iterator.remove();
            }
        }


        //filtering from list
        ArrayList<String> list1= new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("b");
        List<String> filtered=list1.stream().filter(s -> !s.equals("b")).collect(Collectors.toList());
      System.out.println(filtered);

    }




}
