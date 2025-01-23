import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueRunner{
    static public void main(String[] args){

        List<Number> list = new LinkedList<>();
        for(int i=1; i<=5; i++){
            list.add(i);
        }
        for(int i=6; i<=9; i++){
            list.add(Float.valueOf(i));
        }
        System.out.println(list);

        Queue<Number> que = (LinkedList<Number>)list;
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.poll());
        que.offer(34);
        System.out.println(que);
        System.out.println(que.element());
        que.remove();
        System.out.println(que);
        que.add(32);
        System.out.println(que);
        System.out.println(que.size());

        
        
    }
}