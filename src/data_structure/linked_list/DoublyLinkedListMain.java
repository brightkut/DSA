package data_structure.linked_list;

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        // add element O(1) check whether it first element or not
        doublyLinkedList.add("A");
        // traverse
        doublyLinkedList.traverse();
        // add first  O(1)
        doublyLinkedList.addFirst("B");
        // traverse
        doublyLinkedList.traverse();
        // add last O(1)
        doublyLinkedList.addLast("C");
        // traverse
        doublyLinkedList.traverse();
        // remove first O(1)
        doublyLinkedList.removeFirst();
        // traverse
        doublyLinkedList.traverse();
        // remove last O(1)
        doublyLinkedList.removeLast();
        // traverse
        doublyLinkedList.traverse();
    }
}
