package day02;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);

        myQueue.enqueue(1);

        myQueue.enqueue(4);
        myQueue.enqueue(5);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.indexOf(3));
        System.out.println(myQueue.indexOf(4));
        myQueue.enqueue(123);
        myQueue.enqueue(234);
        myQueue.enqueue(345);
        myQueue.enqueue(456);
        myQueue.enqueue(567);
        System.out.println(myQueue.indexOf(123));

        System.out.println(myQueue.indexOf(456));

        myQueue.printQueue();

    }
}
