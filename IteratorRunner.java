import java.util.Iterator;
import java.util.List;

public class IteratorRunner {
    public static void main(String[] ats){
        List<String> wordsList = List.of("yellow", "blue", "green", "red");
        System.out.println(wordsList);

        Iterator<String> words = wordsList.iterator();
        while(words.hasNext()){
            System.out.println(words.next());
        }
    }
}
