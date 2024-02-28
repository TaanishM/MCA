package adidsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeList {

    public static List<Integer> sortedMerge(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        Collections.sort(mergedList);

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(10, 5, 15);
        List<Integer> list2 = List.of(20, 3, 2);

        List<Integer> mergedList = sortedMerge(list1, list2);
        System.out.println("List 1: " + list1);
        
        System.out.println("List 2: " + list2);
        System.out.println("Merged List: " + mergedList);
    }
}
