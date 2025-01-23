import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetRunner {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        for(int i=0; i<6; i++){
            col.add((int)(Math.random()*21) + "K");
        }
        System.out.println(col);

        TreeSet<String> treeSet = new TreeSet<String>(col);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        treeSet.add("madhu");
        System.out.println(treeSet);

        Iterator<String> it = treeSet.iterator();
        while(it.hasNext()){
            if(it.next().contains("12K")){
                it.remove();;
            }
        }
        System.out.println(treeSet);

        


    }
}
