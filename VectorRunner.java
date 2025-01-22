import java.util.List;
import java.util.Vector;
public class VectorRunner {
    public static void main(String[] k){
        List<Character> charsVector = new Vector<Character>();
        System.out.println(charsVector);
        System.out.println(charsVector.size());
        charsVector.add('m');
        charsVector.add('k');
        System.out.println(charsVector);
        System.out.println(charsVector.contains('m'));
        System.out.println(charsVector.indexOf('e'));
    }
}
