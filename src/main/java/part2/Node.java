package part2;

import java.util.Iterator;

public class Node<T> implements Iterator {
    private T info;
    private Node<T> next;
    private Node<T> previous;

    public Node(T info){
        this.info = info;
    }

    public void add(Node<T> next){
        this.next = next;
        next.previous = this;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Node<T> next() {
        return next;
    }

    public void setNext(Node<T> node){
        this.next = node;
    }

    public void setPrevious(Node<T> node){
        this.previous = node;
    }

    public boolean hasPrevious() {
        return previous != null;
    }

    public Node<T> previous() {
        return previous;
    }

    @Override
    public void remove() {
        previous.next = next;
        next.previous = previous;

    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
