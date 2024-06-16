package ejercicio_2;

public class BST<K extends Comparable<K>, V> implements Diccionary<K, V> {
    protected Node<K, V> root;

    public void insert(K key, V value) {
        root = insertRec(root, key, value);
    }

    protected Node<K, V> insertRec(Node<K, V> node, K key, V value) {
        if (node == null) {
            return new Node<>(key, value);
        }
        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(insertRec(node.getLeft(), key, value));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(insertRec(node.getRight(), key, value));
        } else {
            node.setValue(value);
        }
        return node;
    }

    public V search(K key) {
        return searchRec(root, key);
    }

    protected V searchRec(Node<K, V> node, K key) {
        if (node == null || key.equals(node.getKey())) {
            return node != null ? node.getValue() : null;
        }
        if (key.compareTo(node.getKey()) < 0) {
            return searchRec(node.getLeft(), key);
        } else {
            return searchRec(node.getRight(), key);
        }
    }

    public void remove(K key) {
        root = removeRec(root, key);
    }

    protected Node<K, V> removeRec(Node<K, V> node, K key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.getKey()) < 0) {
            node.setLeft(removeRec(node.getLeft(), key));
        } else if (key.compareTo(node.getKey()) > 0) {
            node.setRight(removeRec(node.getRight(), key));
        } else {
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            }
            Node<K, V> temp = minValueNode(node.getRight());
            node.setKey(temp.getKey());
            node.setValue(temp.getValue());
            node.setRight(removeRec(node.getRight(), temp.getKey()));
        }
        return node;
    }

    protected Node<K, V> minValueNode(Node<K, V> node) {
        Node<K, V> current = node;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current;
    }

    public boolean isEmpty() {
        return root == null;
    }
}
