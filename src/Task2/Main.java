package Task2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        ListMap map = new ListMap();
        System.out.println(map.getOriginMapEntries());
        System.out.println(map.getTransformCollection());


        //Task 2.2
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(8, "str8");
        map1.put(7, "str7");
        map1.put(6, "str6");
        map1.put(4, "str4");
        map1.put(3, "str3");
        map1.put(5, "str5");
        map1.put(2, "str2");
        map1.put(9, "str9");
        map1.put(1, "str1");
        map1.put(10, "str10");
        for (Map.Entry<Integer,String> entry : map1.entrySet()){
            System.out.println(entry.getKey()+ " - " + entry.getValue());
        }

    }
}
