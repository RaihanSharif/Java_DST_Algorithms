package data_structures.LinkedList;
public class TestLinekdList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> myLL = new SinglyLinkedList<>();

        myLL.addFirst(12);
        myLL.addLast(22);
        myLL.addFirst(13);

        System.out.println(myLL.isEmpty());
        System.out.println(myLL.first());
        System.out.println(myLL.last());
        System.out.println(myLL.size());

    }
}
