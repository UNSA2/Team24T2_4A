package heaps;
import interfaces.Heap;
import java.util.ArrayList;

//Linea agregada para probar la clase sin que cause conflictos con los placeholders
@SuppressWarnings("unchecked")

public class TDAHeap<T extends Comparable<T>> implements Heap<T> {
    ArrayList<T> data;

    public TDAHeap(){
        this.data = new ArrayList<T>();
    }

    public void enqueue(T x){
        this.data.add(x);
        T aux;
        System.out.println(data.size());

        for(int i = this.data.size() - 1; i > 0 && this.data.get(i).compareTo(this.data.get(i/2)) > 0; i /= 2){
            aux = this.data.get(i);
            this.data.set(i, this.data.get(i/2));
            this.data.set(i/2, aux);    
        }
    }

    public T dequeue(){
        return (T) new Object();
    }

    public T front(){
        return (T) new Object();
    }

    public T back(){
        return (T) new Object();
    }

    public String toString(){
        String str = "Elementos: ";
        for(T elem : this.data){
            str += elem.toString() + ", ";
        }
        return str;
    }
}
