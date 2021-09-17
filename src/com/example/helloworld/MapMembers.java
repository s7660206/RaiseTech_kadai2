package com.example.helloworld;

import java.util.HashMap;
import java.util.Map;

public class MapMembers {

    public static void main(String args[]){
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Steve");
        map.put(2,"Jason");
        map.put(3,"Kate");

        System.out.println(map);
    }
}
