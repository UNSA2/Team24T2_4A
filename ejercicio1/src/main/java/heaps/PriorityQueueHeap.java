package heaps;

import java.util.ArrayList;

public class PriorityQueueHeap<T extends Comparable<T>> extends TDAHeap<T> {

    //Para este problema, dequeue no varia, pero para enqueue, aunque se puede modificar
    //para que ordene por prioridad al insertar, a la hora de reordenar el heap, no es posible
    //si no se guarda la prioridad de cada elemento
    //Por lo tanto, lo mas apropiado probablemente sea utilizar un Node especifico que guarde el dato y la prioridad

    public PriorityQueueHeap(){
        this.data = new ArrayList<T>();
    }

    public void enqueue(T x){
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
