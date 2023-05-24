package arrays;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        String[] weekdays = {"Mon", "Wed", "Fri"};
        System.out.println(Arrays.toString(weekdays));
        for(String str : weekdays) {
            System.out.println(str);
        }

        // System.out.println("Hi java");
        // Map<Integer, String> map = new TreeMap<>();
        // map.put(101, "King");
        // map.put(101, "Queen");
        // map.put(103, "Ace");
        // map.put(102, "Jack");
        // map.put(104, "Queen");
        // System.out.println(map);

        // List<String> names = new ArrayList<String>();
        // names.add("Jack");
        // names.add("Jim");
        // names.add("Harry");
        // names.add("jack");
        // names.add("Sam");
        // System.out.println(names);
        // for (int i = 0; i < names.size(); i++) {
        //     if(names.get(i).equalsIgnoreCase("jack")) {
        //         names.remove(i);
        //     }
        // }
        // System.out.println(names);
        // Set<String> set = new HashSet<String>();
        // for (int i = 0; i < names.size(); i++) {
        //     set.add(names.get(i));
        // }
        // System.out.println(set);

    }
}