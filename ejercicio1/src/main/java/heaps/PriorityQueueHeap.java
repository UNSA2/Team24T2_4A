package heaps;

import java.util.ArrayList;

public class PriorityQueueHeap<T extends Comparable<T>> extends TDAHeap<HeapNode<T>> {

    public PriorityQueueHeap(){
        this.setData(new ArrayList<HeapNode<T>>());
    }

    public void enqueue(T x, int priority){
        enqueue(x);
    }

    public T dequeue(){
        return super.dequeue();
    }

    public T front(){
        return super.front();
    }

    public T back(){
        return super.back();
    }

    public String toString(){
        return super.toString();
    }
}
