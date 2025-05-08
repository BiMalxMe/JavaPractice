
// for proper structuring can use
//package collection

import java.util.*;
public class JavaCollHashMap {
    public static void main(String[] args) {


    Map<Integer,String> map = new HashMap<Integer,String>();
    map.put(101,"Bimal");
    map.put(102,"Ram");
    map.put(103,"Sita");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
