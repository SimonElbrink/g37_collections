package se.lexion.simon;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapExamples {
    public static void main(String[] args) {

        //Key of type Integer
        //Value of type String
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1000,"Simon");
        hashMap.put(2000,"Erik");

        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap.get(1000) = " + hashMap.get(1000));


        for (Map.Entry<Integer, String> e: hashMap.entrySet()) {
            System.out.println("Key: " + e.getKey() + "\t" + "Value: " + e.getValue());
            System.out.println(e.hashCode());
        }

        System.out.println("Prints only keys");
        for (Integer i : hashMap.keySet())
         {
             System.out.println("Key:" + i);
        }


    }
}
