package week14.activity31;

public class queueMain {
    public static void main(String[] args) {
        queues queue = new queues();
        queue.enQueue();
        System.out.println(queue);
        queue.enQueue();
        System.out.println(queue);
        queue.enQueue();
        System.out.println(queue);
        queue.enQueue();
        System.out.println(queue);
        queue.deQueue();
        System.out.println(queue);
        queue.deQueue();
        System.out.println(queue);
        queue.deQueue();
        System.out.println(queue);
    }
}
