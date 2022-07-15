package data_structure.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        // add element to queue O(1)
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        //traverse
        queue.traverse();
        //remove front of queue O(1)
        queue.poll();
        //traverse
        queue.traverse();
    }
}
