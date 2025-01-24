import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetRunner {

    static public void main(String []a){
        List<Number> lst = List.of(23, 23.9, 12, 11, 21, 9, 21);
        System.out.println(lst+" - List elments");

        ArrayList<Number> arrLst = new ArrayList<>(lst);
        System.out.println(arrLst+" - arrayList elements");
        arrLst.add(23);
        System.out.println(arrLst+" added new element");
        arrLst.addFirst(21.0);
        System.out.println(arrLst+" added new first element");
        arrLst.removeLast();
        System.out.println(arrLst);
        System.out.println(arrLst.lastIndexOf(21));
        System.out.println(arrLst);

        LinkedList<Number> linkedlst = new LinkedList<>(arrLst);
        System.out.println(linkedlst+" added into linkedlist");
        System.out.println(linkedlst.get(3));
        System.out.println(linkedlst.size());

        Set<Number> set = new HashSet<Number>(linkedlst);
        System.out.println(set+" added hashset");
        System.out.println(set.size());

        HashSet<Number> linkHashSet = new LinkedHashSet<>(set);
        System.out.println(linkHashSet+" added linkedHashSet");
        linkHashSet.add(22);
        System.out.println(linkHashSet.size());
        System.out.println(linkHashSet);

        Iterator<Number> it = linkHashSet.iterator();
        while(it.hasNext()){
            Number num = it.next();
            if(!(num instanceof Integer)){
                it.remove();
            }
        }
        System.out.println(linkHashSet);
        TreeSet<Number> treeSet = new TreeSet<Number>(linkHashSet);
        System.out.println(treeSet);
        System.out.println(treeSet.first()+" - "+treeSet.last());



    }
}