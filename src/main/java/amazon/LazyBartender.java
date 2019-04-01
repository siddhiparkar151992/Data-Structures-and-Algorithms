package main.java.amazon;

import java.util.*;

/**
 * Created by Siddhi Parkar on 18-11-2017.
 */
public class LazyBartender {

    public static void main(String[] args) {

    }

    public void find(Map<String, List<String>> input) {
        Map<String, List<String>> drinks = new HashMap<>();
        Iterator<Map.Entry<String, List<String>>> it = input.entrySet().iterator();
        while (it.hasNext()) {
            String cut = it.next().getKey();
            List<String> drinkList = it.next().getValue();
            for (String d : drinkList) {
                if (drinks.get(d) != null) {
                    List<String> custLIst = drinks.get(d);
                    custLIst.add(cut);
                    drinks.put(d, custLIst);
                } else {
                    List<String> custLIst = new ArrayList<>();
                    custLIst.add(cut);
                    drinks.put(d, custLIst);
                }
            }
        }

        int[] marker = new int[input.size()];
        Iterator<Map.Entry<String, List<String>>> it2 = drinks.entrySet().iterator();
        while (it2.hasNext()) {
            String drink = it2.next().getKey();
            List<String> custList = it2.next().getValue();
            for (String c : custList) {

            }
        }
    }
}
