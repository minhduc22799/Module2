package simple_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(14);

        myLinkedList.add(1,4);
        myLinkedList.add(2,5);
        myLinkedList.add(3,6);
        myLinkedList.printList();

    }
}
