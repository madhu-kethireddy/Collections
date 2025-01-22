import java.util.ArrayList;
import java.util.List;

public class ListSafetyRunner {
    public static void main(String[] args) {
        List items = List.of("Box", 'R', 2, 0.2f, 5.0);
        System.out.println(items);
        System.out.println(items.get(1) instanceof String);
        System.out.println(items.get(1) instanceof Character);

        List<Integer> values = List.of(121, 393, 56, 900, 21);
        System.out.println(values.get(2));
        System.out.println(values.indexOf(121));

        List<Integer> valuesAl = new ArrayList<>(values);
        System.out.println(valuesAl);
        System.out.println(valuesAl.remove(Integer.valueOf(121)));
        System.out.println(valuesAl);


    }
}
