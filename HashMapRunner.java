import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapRunner {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>(9, 0.65f);
        for(int i=1; i<4; i++){
            map.put(i, i+"ew");
        }
        System.out.println(map);
        map.put(23, "madhu");
        System.out.println(map);
        String str = map.get(5);
        System.out.println(str);
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Integer, String> mt = it.next();
            System.out.print(mt.getKey()+" : ");
            System.out.println(mt.getValue());

        }
        

    } 
}
