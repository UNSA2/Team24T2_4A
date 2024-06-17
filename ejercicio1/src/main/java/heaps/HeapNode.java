package heaps;

public class HeapNode<E extends Comparable<E>> implements Comparable<HeapNode<E>> {
    private E data;
    private int priority;

    public HeapNode(E data, int priority){
        this.data = data;
        this.priority = priority;
    }

    public int compareTo(HeapNode<E> other){
        return this.priority - other.priority;
    }

    public E getData() {
        return this.data;
    }

    public int getPriority() {
        return this.priority;
    }

    public String toString(){
        return this.data.toString();
    }

}
