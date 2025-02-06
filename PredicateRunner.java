import java.util.List;
import java.util.function.Predicate;

public class PredicateRunner 
{
    public static void main(String[] ar)
    {


        List<Character> chList = List.of('w','e','a','v','e','t','u','m','k');
        Predicate<Character> predicate = ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ;
        List<Character> ch = chList.stream()
            .filter(predicate.negate())
            .toList();
        System.out.println(ch);
        
        
    }
    
}
