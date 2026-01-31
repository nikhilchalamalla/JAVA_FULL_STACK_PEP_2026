package collection;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        /* MyListNikhil list = new MyListNikhil();

        for (int i = 1; i <= 32; i++) {
            list.add(i);
        }

        list.printArray(); */

        /* ArrayList<Integer> list = new ArrayList<>();
        list.add(100);

        list.get(1);

        list.remove(100);

        list.set(1, 100); */


        /* HashMap<Integer, String> map = new HashMap<>();
        keys and values
        value -> duplicate -> yes
         keys -> duplicate -> No
        map.put(1, "Nikhil");
        map.put(2, "Thamas");
        map.put(3, "Nithin");
        map.put(4, "Nishanth");
        map.put(5, "Charan Tej");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
        System.out.println(map.get(5));

        for(Integer key:map.keySet()) {
            System.out.println(key + " Keys " + " values are " + map.get(key));
        } */

        //Name Course ActionType -> Enroll Watch
        /* String logs[][] = {
                {"Nikhil", "Java", "Enroll"},
                {"Nithin", "SpringBoot", "Watch"},
                {"Nishanth", "React", "Enroll"},
                {"Nikhil", "Java", "Enroll"},
                {"CharanTej", "Cloud", "Watch"},
                {"Nithin", "SpringBoot", "Watch"},
                {"Thamas", "DevOps", "Enroll"},
                {"Nikhil", "Java", "Enroll"},
                {"Nishanth", "React", "Enroll"},
                {"Thamas", "DevOps", "Enroll"},
                {"Nithin", "SpringBoot", "Watch"},
                {"Nikhil", "Java", "Enroll"},
        }; */
        //Using a map -> study these logs
        //1. How many users -> have taken -> course Java
        //2. find the most Active Users.
        //3, find the time span of these

        /* int javaEnrollCount = 0;

        for(String[] log : logs) {
            if (log[1].equals("Java") && log[2].equals("Enroll")) {
                javaEnrollCount++;
            }
        }

        System.out.println("Java Enroll Count = " + javaEnrollCount);

        HashMap<String, Integer> userActivity = new HashMap<>();
        for(String[] log : logs ) {
            String user = log[0];
            userActivity.put(user, userActivity.getOrDefault(user, 0) + 1);
        };

        String mostActiveUser = "";
        int maxActivity= 0;

        for (String user : userActivity.keySet()) {
            if (userActivity.get(user) > maxActivity) {
                maxActivity = userActivity.get(user);
                mostActiveUser = user;
            }
        }

        System.out.println("Most Active user = " + mostActiveUser);
        System.out.println("Activity Count = " + maxActivity);

        System.out.println(("Time Span(total logs) = " + logs.length)); */

        HashSet<Integer> setofrollnumber = new HashSet<>();

        setofrollnumber.add(1);
        setofrollnumber.add(1);
        setofrollnumber.add(1);
        setofrollnumber.add(1);

        System.out.println(setofrollnumber.size());

    }
}
