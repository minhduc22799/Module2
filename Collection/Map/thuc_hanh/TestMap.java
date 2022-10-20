package Map.thuc_hanh;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> hasMap = new HashMap<>();
        hasMap.put(4," sa");
        hasMap.put(2," as");
        hasMap.put(1," sad");

        System.out.println("Display entries in HashMap");
        System.out.println(hasMap+"\n");

        Map<Integer,String> treeMap = new TreeMap<>(hasMap);

        System.out.println("Display entries in ascending order of key ");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.76f,true);
        linkedHashMap.put("a",21);
        linkedHashMap.put("b",22);
        linkedHashMap.put("c",23);
        linkedHashMap.put("d",24);
        System.out.println("\nThe age for "+ "a is "+linkedHashMap.get("a"));


    }
}
