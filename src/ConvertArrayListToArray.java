import java.util.*;


public class ConvertArrayListToArray {

    public static void main(String args[]){
      ArrayList<String> cities= new ArrayList<String>();
      cities.add("Boston");
      cities.add("Dallas");
      cities.add("San jose");
      cities.add("Chicago");

      /*ArrayList to Array Conversion */
      //same for hashset to array

       //obviously works
      String[] citinames;
      citinames= cities.toArray(new String[cities.size()]);

      //even though size of passed array doesn't accomodate the list,returns new array which accomodates the list
      String[] citinames1;
      citinames1= cities.toArray(new String[0]);

      //works when citinames3 is printed
      String[] citinames2=new String[2];
      String[] citinames3=cities.toArray(citinames2);

      //doesn't work,when printing citinames4 gives null null as output
      String[] citinames4=new String[2];
      cities.toArray(citinames4);

      //works,easiest to remember
      String[] citinames5=new String[cities.size()];
      cities.toArray(citinames5);
      /*Displaying Array elements*/
      for(String k: citinames5)
      {
        System.out.println(k);
      }

      Map<Integer,String> map=new HashMap<>();
      Set<Integer> set=new HashSet<>();
    }

}
