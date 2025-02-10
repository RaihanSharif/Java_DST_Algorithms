package data_structures.queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> myQ = new CircularQueue<>();

        myQ.enqueue(12);
        System.out.println("front " + myQ.front());
        System.out.println("rear " + myQ.rear());
        myQ.enqueue(33);
        System.out.println("front2 " + myQ.front());
        System.out.println("rear2 " + myQ.rear());
        System.out.println(myQ.isEmpty());
        myQ.dequeue();
        myQ.dequeue();
        System.out.println(myQ.isEmpty());

    }

}
