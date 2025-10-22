import java.util.Queue;
import java.util.LinkedList;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        System.out.println(q.remove());
    }
}
