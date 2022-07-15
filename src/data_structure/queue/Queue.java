package data_structure.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.StringJoiner;
import java.util.function.Consumer;

public class Queue<T> implements Iterable<T>{
    private LinkedList<T> list = new LinkedList<>();

    public Queue() {
    }

    public Queue(T element){
        offer(element);
    }

    // remove element from the front of queue
    public T poll(){
        if(isEmpty()) throw new RuntimeException("Queue empty");
        return list.removeFirst();
    }

    // add element to queue
    public void offer(T element){
        list.addLast(element);
    }

    public void traverse(){
        StringJoiner stringJoiner = new StringJoiner(",");
        for(T element: list){
            stringJoiner.add(element.toString());
        }

        System.out.println(stringJoiner);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
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
