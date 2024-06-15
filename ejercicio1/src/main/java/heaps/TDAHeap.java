package heaps;
import interfaces.Heap;
import java.util.ArrayList;

public class TDAHeap<T extends Comparable<T>> implements Heap<T> {
    ArrayList<T> data;

    public TDAHeap(){
        this.data = new ArrayList<T>();
    }

    public void enqueue(T x){
        this.data.add(x);
        T aux;

        for(int i = this.data.size(); i > 1 && this.data.get(i).compareTo(this.data.get(i/2)) > 0; j /= 2){
            aux = this.data.get(i);
            this.data.set(i, this.data.get(j/2));
            this.data.set(j/2, aux);    
        }
    }

    public T dequeue(){

    }

    public T front(){

    }

    public T back(){

    }

    public String toString(){
        String str = "Elementos: ";
        for(T elem : this.data){
            str += elem.toString();
        }
        return str;
    }
}
