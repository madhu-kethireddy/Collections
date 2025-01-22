import java.util.LinkedList;
import java.util.List;

public class LinkedListRunner {
    public static void main(String... a){
        List<String> wordsLinkedList = new LinkedList<String>();
        System.out.println(wordsLinkedList);
        System.out.println(wordsLinkedList.isEmpty());
        wordsLinkedList.add("madhu");
        wordsLinkedList.addLast("marsh");
        System.out.println(wordsLinkedList);
        wordsLinkedList.set(1, "slipa");
        System.out.println(wordsLinkedList);
    }
}
