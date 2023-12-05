package week14.activity31;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queues {
    static Scanner console = new Scanner(System.in);
    Queue<Object> queue = new LinkedList<>();
    public void enQueue(){
        queue.add(console.nextLine());
    }
    public void deQueue(){
        queue.remove();
    }
    public void peekQueue(){
        queue.peek();
        if (queue == null){
            System.out.println("Queue is empty");
        }
    }
    public void emptyQueue(){
        queue.isEmpty();
    }
}
