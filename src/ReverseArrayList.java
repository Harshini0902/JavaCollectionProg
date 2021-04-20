import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    public static void main(String[] args) {
        int i;
        int size;
        Integer temp;

        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(1);

        size=list.size();

        for(i=0;i<size/2;i++){
            temp=list.get(i);
            list.set(i,list.get(size-i-1));
            list.set(size-i-1,temp);
        }

        System.out.println(list);
    }
}
