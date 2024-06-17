package heaps;
import interfaces.Heap;
import java.util.ArrayList;

public class TDAHeap<T extends Comparable<T>> implements Heap<T> {
    private ArrayList<T> data;

    public TDAHeap(){
        this.data = new ArrayList<T>();
    }

    public void enqueue(T x){
        this.data.add(x);
        T aux;

        for(int i = this.data.size() - 1; i > 0 && this.data.get(i).compareTo(this.data.get(i/2)) > 0; i /= 2){
            aux = this.data.get(i);
            this.data.set(i, this.data.get(i/2));
            this.data.set(i/2, aux);    
        }
    }

    public T dequeue(){
        if(this.data.size() == 0){
            return null;
        }

        T aux = this.data.get(0);
        this.data.set(0, this.data.remove(this.data.size() - 1));
        
        int i = 0;
        while(i * 2 + 1 < this.data.size()){
            int j = 2 * i + 1;
            if(j + 1 < this.data.size() && this.data.get(j+1).compareTo(this.data.get(j)) > 0)
                j++;
            if(this.data.get(i).compareTo(this.data.get(j)) > 0){
                break;
            }
            T temp = this.data.get(i);
            this.data.set(i, this.data.get(j));
            this.data.set(j, temp);
            i = j;
        }
        return aux;
    }

    public T front(){
        return this.data.get(0);
    }

    public T back(){
        return this.data.get(this.data.size()-1);
    }

    public String toString(){
        String str = "Elementos: ";
        for(T elem : this.data){
            str += elem.toString() + ", ";
        }
        return str;
    }
}
