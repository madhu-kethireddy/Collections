import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityMain {

    public static void main(String[] args){

        Queue<Character> priorQueue = new PriorityQueue<>(Comparator.naturalOrder());
        System.out.println(priorQueue.poll());
        priorQueue.offer('k');
        priorQueue.add('2');
        priorQueue.offer('k');
        priorQueue.add('2');
        priorQueue.offer('k');
        priorQueue.add('2');
        System.out.println(priorQueue);
        System.out.println(priorQueue.size());
        System.out.println(priorQueue.remove());
        System.err.println(priorQueue.remove('k'));
        System.out.println(priorQueue);
    }
}