import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        List<String> wordsArrayList = new ArrayList<String>(); //mutable means we change the elements like(add, remove, set position last or first)
        System.out.println(wordsArrayList);
        wordsArrayList.add("madhu");
        wordsArrayList.addFirst("kethireddy");
        System.out.println(wordsArrayList);
        wordsArrayList.set(0,"kavya");
        System.out.println(wordsArrayList);
    }
}
