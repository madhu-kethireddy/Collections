import java.util.ArrayList;

public class ArrayListGenrics<R extends Number> {

    ArrayList<R> list = new ArrayList<>();

    public void add(R element){
        list.add(element);
    }

    public void remove(R element){
        list.remove(element);
    }

    public String toString(){
        return list.toString();
    }
    
    public R get(int index){
        return list.get(index);
    }
}
