package com.company;

import java.util.*;

import static javafx.scene.input.KeyCode.V;

public class mapdemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(123,"kaka");
        map.put(456,"lal");
        map.put(789,"tree");
        System.out.println(map.size()+  "  "+map);

        map = new TreeMap<>();
        map.put(123,"kaka");
        map.put(456,"lal");
        map.put(789,"tree");
        System.out.println(map.size()+  "  "+map);
        map.put(987,"kaka");
        System.out.println(map.size()+  "  "+map);
        Set<Integer> keys = map.keySet();
                for (Integer Key : keys){
                    String value = map.get(Key);
                    System.out.println(Key+ " : "+value);
                }
                Collection<String> allvalue = map.values();
                for (String value : allvalue){
                    System.out.println(value);
                }
                Set<Map.Entry<Integer,String>>MapEntery = map.entrySet();
                for (Map.Entry<Integer, String> entery:MapEntery){
                    Integer key = entery.getKey();
                    String value = entery.getValue();
                    System.out.print(key+  "  :  _  " + value+"\n");
                }


                boolean isremove = map.remove(987,"kaka");
        System.out.println(isremove);
        System.out.println(map.size()+  "  "+map);
        map.remove(456);
        System.out.println(map.size()+  "  "+map);

    }
}
