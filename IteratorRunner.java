import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRunner {
    public static void main(String[] ats){
        List<String> wordsList = List.of("yellow", "blue", "green", "red", "cat");
        System.out.println(wordsList);

        List<String> arrList = new ArrayList<>(wordsList);

        Iterator<String> words = wordsList.iterator();
        while(words.hasNext()){
            System.out.println(words.next());
        }

        Iterator<String> iterator = arrList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(arrList);
    }
}
