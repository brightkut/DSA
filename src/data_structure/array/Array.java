package data_structure.array;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.StringJoiner;
import java.util.function.Consumer;

@SuppressWarnings("unchecked")
public class Array <T> implements Iterable<T>{
    private T [] array;
    private int len = 0;
    private int capacity = 0;

    public Array(){this(16);}

    public Array(int capacity) {
        if(capacity < 0) throw new IllegalArgumentException("Illegal Capacity: "+capacity);
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int size() { return len; }

    public boolean isEmpty() { return size() == 0; }

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T element){
        array[index] = element;
    }

    public void clear(){
        for(int i =0 ; i< capacity ; i++){
            array[i] = null;
        }

        this.len = 0;
    }

    public void add(T element){
        int sizeAfterAddElement = len+1;

        if(sizeAfterAddElement>=capacity){
            if(capacity == 0) capacity = 1;
            // double size array
            else capacity *= 2;
            T[] new_array = (T[]) new Object[capacity];
            for(int i=0;i<len;i++){
                new_array[i] =  array[i];
            }
            array = new_array;
        }

        // add element
        array[len++] = element;
    }

    public T removeAt(int index){
        if(index>=len|| index<0) throw new IndexOutOfBoundsException();
        T data = array[index];

        //create new array that size is decreased
        T [] new_array = (T[]) new Object[len-1];

        for(int i=0,j=0; i<len;i++,j++){
            if(index==i) j--;
            else new_array[j] = array[i];
        }

        array = new_array;
        capacity = --len;

        return data;
    }

    public boolean remove (Object object){
        for(int i =0;i<len;i++){
            if(array[i].equals(object)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object object){
        for(int i=0;i<len;i++){
            if(array[i].equals(object)) return i;
        }

        return -1;
    }

    public void traverse(){
        StringJoiner stringJoiner = new StringJoiner(",");
        for(int i =0;i<len;i++){
            stringJoiner.add(array[i].toString());
        }

        System.out.println(stringJoiner);
    }

    public boolean contain(Object object){
        return indexOf(object)>=0;
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
