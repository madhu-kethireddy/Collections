import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapRunner {
    public static void main(String[] args){

        Map<String, Boolean> map = new LinkedHashMap<>(5);
        map.put("isON", true);
        map.put("isOFF",false);
        map.put("Needed", true);
        map.put("NotNeeded", false);

        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Boolean> items = it.next();
            System.out.println(items.getKey()+ " : "+items.getValue());
        }
        
    }
}
