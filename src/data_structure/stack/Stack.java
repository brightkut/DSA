package data_structure.stack;

import java.util.*;
import java.util.function.Consumer;

public class Stack <T> implements Iterable<T>{
    private LinkedList<T> list = new LinkedList<>();

    //Create Empty Stack
    public Stack() {
    }

    //Create Stack with initial element
    public Stack(T element){
        push(element);
    }

    //Return number of elment in the stack
    public int size(){
        return list.size();
    }

    //Check stack is empty
    public boolean isEmpty(){
        return size()==0;
    }

    public void push(T element){
        list.addLast(element);
    }

    public T pop(){
        if(isEmpty()) throw new EmptyStackException();
        return list.removeLast();
    }

    public void traverse(){
        StringJoiner stringJoiner = new StringJoiner(",");
        for (T t : list) {
            stringJoiner.add(t.toString());
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
