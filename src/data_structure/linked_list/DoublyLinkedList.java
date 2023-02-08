package data_structure.linked_list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.StringJoiner;
import java.util.function.Consumer;

public class DoublyLinkedList<T> implements Iterable<T> {

    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    //Node Class
    private class Node <T> {
        T data;
        Node<T> prev,next;

        public Node(T data,Node<T> prev, Node<T> next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", prev=" + prev +
                    ", next=" + next +
                    '}';
        }
    }

    // Empty this linked list O(n)
    public void clear(){
        Node<T> start = head;

        // head = null mean no element

        while (start != null){
            Node<T> next = start.next;
            // clear pointer
            start.prev = start.next = null;
            //clear data
            start.data = null;
            //go to next node
            start = next;
        }

        // clear start because pass by reference
        head = tail = start = null;
        size = 0;
    }

    // size of linked list
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    // Add element O(1)
    public void add(T element){
        if(isEmpty()) addFirst(element);
        else addLast(element);
    }

    // add first element in linked list O(1)
    public void addFirst(T element){
        if(isEmpty()){
            head = tail = new Node<>(element,null,null);
        }else{
            //point first node to new node
            head.prev = new Node<>(element,null,head);
            head = head.prev;
        }
        size++;
    }

    //add last element in linked list O(1)
    public void addLast(T element){
        if(isEmpty()){
            head = tail =new Node<>(element,null,null);
        }else {
            tail.next = new Node<>(element,tail,null);
            tail = tail.next;
        }
        size++;
    }

    // Get first element O(1)
    public T peekFirst(){
        if(isEmpty()) throw new RuntimeException("empty list");

        return head.data;
    }

    // Get last element O(1)
    public T peekLast(){
        if (isEmpty()) throw new RuntimeException("empty list");

        return tail.data;
    }

    // Remove first element in linked list O(1)
    public T removeFirst(){
        if(isEmpty()){
            throw new RuntimeException("empty list");
        }

        T data = head.data;
        head = head.next;
        --size;

        //if the list is empty set the tail to null as well
        if(isEmpty()) tail = null;

        // memory clean previous node
        else head.prev = null;

        return data;
    }

    //Remove last element in linked list O(1)
    public T removeLast(){
        if(isEmpty()){
            throw new RuntimeException("empty list");
        }

        T data = tail.data;
        tail = tail.prev;
        --size;

        if(isEmpty()) head = null;

        else tail.next = null;

        return data;
    }

    //Remove with object
    public T remove (Node<T> node){
        if(node.prev == null) removeFirst();
        if(node.next == null) removeLast();

        //change pointer to next adjacent node
        node.next.prev = node.prev;
        node.prev.next = node.next;

        //Temp data
        T data = node.data;

        //mempry clean
        node = node.next = node.prev = null;
        --size;

        return data;
    }

    public void traverse(){
        StringJoiner stringJoiner = new StringJoiner(",");

        Node<T> startNode = head;
        while (startNode != null){
            stringJoiner.add(startNode.data.toString());
            startNode = startNode.next;
        }

        System.out.println(stringJoiner);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
