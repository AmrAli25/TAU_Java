package chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        //setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    private static void mapDemo() {
        Map <String, Integer> fruitCal = new HashMap();
        fruitCal.put("apple", 95);
        fruitCal.put("lemon", 20);
        fruitCal.put("banana", 100);
        fruitCal.put("orange", 45);

        for(var entry : fruitCal.entrySet()){
            System.out.println(entry.getValue());
        }
        fruitCal.forEach((k,v) -> System.out.println("Fruit " + k + ", Calories " + v));
    }

    private static void setDemo() {
        Set <String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
        var i = fruit.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        for (String item : fruit){
//            System.out.println(item);
//        }
        fruit.forEach(System.out::println); // lambda expression
    }


}
