import java.util.ArrayDeque;
import java.util.Deque;

public class DequeRunner {
    public static void main(String[] args){

        Deque<String> stack = new ArrayDeque<>();
        stack.push("jack");
        stack.push("mario");
        stack.push("reethu");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
        System.out.println();

        stack.add("null");
        stack.offer("coddle");
        stack.addLast("madhu");

        System.out.println(stack);

        while(!stack.isEmpty()){
            System.out.println(stack.poll());
        }

    }
    
}
