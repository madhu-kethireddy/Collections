import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
public class MergeListRunner {
    public static void main(String[] at){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Vector<>();
        list1.add("madhu");
        list1.add("balu");
        list2.add("epam");
        list2.add("soti");
        list2.add("cognizant");
        list3.add("Analyst");
        list3.add("Developer");
        list3.add("Engineer");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        List<List<String>> mergeList = List.of(list1, list2, list3);
        System.out.println(mergeList);
        System.out.println(mergeList.get(1));
        System.out.println(mergeList.get(2).get(2));
        System.out.println(mergeList.isEmpty());
        System.out.println(mergeList);
    }
}
