package ejercicio_2;
public class Node<T> {
    protected T data;
    protected Node<T> left;
    protected Node<T> right;

        public Node(T data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Node<T> getLeft (){return this.left ;}
        public Node<T> getRight(){return this.right;}
        public    T    getData (){return this.data ;}

        public void setLeft (Node<T> left ){this.left  = left ;}
        public void setRight(Node<T> right){this.right = right;}
        public void setData (     T data  ){this.data  = data ;}
        
        public String toString(){
            return data.toString();
        }
}