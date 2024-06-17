package ejercicio_2;
public class AVLTree<E extends Comparable<E>> extends BST<E> {
	class NodeAVL extends Node<E>{
		protected int fb;
		public NodeAVL(E data) {
			super(data);
			this.fb = 0;
		}
		public String toString() {
			return super.toString() + "(" + this.fb + ")";
		}
		
	}
	private boolean fl;//balance
	public AVLTree(){ 
			super();
	}
	
	public void insert(E x){
		this.fl = false;
		this.setHead(insertRecAVL(x, (NodeAVL)this.getHead()));		
	}
		
    private Node<E> insertRecAVL(E x, NodeAVL actual) {
        NodeAVL aux = actual;
        if (actual == null) {
            this.fl = true;
            aux = new NodeAVL(x);
        } else {
            int resC = actual.getData().compareTo(x);
            if (resC == 0) {
                System.out.println("El dato " + x + " ya fue insertado antes...");
            } else if (resC < 0) { 
                aux.setRight(insertRecAVL(x, (NodeAVL)actual.getRight()));
                if (fl) {
                    switch (aux.fb) {
                        case -1: aux.fb = 0; 
                                 this.fl = false; 
                                 break;
                        case 0:  aux.fb = 1; 
                                 this.fl = true; 
                                 break;
                        case 1:  aux = balanceToLeft(aux);
                                 this.fl = false; 
                                 break;
                    }
                }
            } else { 
                aux.setLeft(insertRecAVL(x, (NodeAVL)actual.getLeft()));
                if (fl) {
                    switch (aux.fb) {
                        case 1:  aux.fb = 0; 
                                 this.fl = false; 
                                 break;
                        case 0:  aux.fb = -1; 
                                 this.fl = true; 
                                 break;
                        case -1: aux = balanceToRight(aux);
                                 this.fl = false; 
                                 break;
                    }
                }
            }
        }
        return aux;
    }

	private NodeAVL balanceToLeft(NodeAVL node) {
		NodeAVL son = (NodeAVL)node.getRight();
		switch(son.fb) {
		case 1 : node.fb = 0;
				 son.fb = 0;
				 node = rotateSL(node);
				 break;
		case -1 :
				NodeAVL grandSon = (NodeAVL)son.getLeft(); 
				switch(grandSon.fb) {
				case -1: node.fb = 0; son.fb = 1; break; 
				case 0: node.fb = 0; son.fb = 0; break; 
				case 1: node.fb = 1; son.fb = 0; break;
				}
				grandSon.fb = 0;
				node.setRight(rotateSR(son));
				node = rotateSL(node);
				break;
		}
		return node;
	}
    private NodeAVL balanceToRight(NodeAVL node) {
        NodeAVL son = (NodeAVL)node.getLeft();
        switch (son.fb) {
        case -1: node.fb = 0;
                 son.fb = 0;
                 node = rotateSR(node);
                 break;
        case 1:
            NodeAVL grandSon = (NodeAVL)son.getRight();
            switch (grandSon.fb) {
                case 1:  node.fb = 0; 
                         son.fb = -1; 
                         break; 
                case 0:  node.fb = 0; 
                        son.fb = 0; 
                        break; 
                case -1: node.fb = -1; 
                        son.fb = 0; 
                         break;
            }
            grandSon.fb = 0;
            node.setLeft(rotateSL(son));
            node = rotateSR(node);
            break;
        }
        return node;
    }

	
	private NodeAVL rotateSL(NodeAVL node) {//izquierda
		NodeAVL son = (NodeAVL)node.getRight();
		node.setRight(son.getLeft());
		son.setLeft(node);
		node = son;
		return node;
	}
	
	private NodeAVL rotateSR(NodeAVL node) {//derecha
		NodeAVL son = (NodeAVL)node.getLeft();
		node.setLeft(son.getRight());
		son.setRight(node);
		node = son;
		return node;
	}
	
	public void inOrden(){
		if (this.isEmpty())
			System.out.println("Arbol esta vacio....");
		else
			inOrden((NodeAVL)this.getHead());
		System.out.println();
	}

	protected void inOrden(NodeAVL actual){
		if (actual.getLeft() != null) inOrden((NodeAVL)actual.getLeft());
		System.out.print(actual+", ");
		if (actual.getRight() != null) inOrden((NodeAVL)actual.getRight());
	}	
}
