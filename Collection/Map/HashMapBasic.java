package Collection.Map;

import java.util.*;

public class HashMapBasic {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>();

        m1.put(1, "raj");
        m1.put(2, "karan");
        System.out.println(m1);

        Map<Integer, String> m2 = new HashMap<>();
        m2.put(3, "india");
        System.out.println(m2);
        m1.putAll(m2);
        System.out.println(m1);

        m1.putIfAbsent(4, "karan");
        System.out.println(m1);

        System.out.println(m1.get(1));
        m1.replace(2, "Rahul");
        System.out.println(m1);

        Collection<String> valueSet = m1.values();
        System.out.println(valueSet);

        Set<Map.Entry<Integer, String>> enterSet = m1.entrySet();
        System.out.println(enterSet);

        for(Map.Entry<Integer, String> enter:m1.entrySet() ) {
            System.out.println("key" +" "+ enter.getKey() +" "+ "value" +" " + enter.getValue());
        }
    }

}