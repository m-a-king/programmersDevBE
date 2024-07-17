package day02;

public class MyStack<T> {
    private Node<T> top = null;

    class Node<T> {
        private T data;
        private Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T item){
        Node<T> newNode = new Node<>(item);
        newNode.next = top; // 기존 탑 = 직전 삽입 = 현재 삽입의 다음
        top = newNode;
    }

    public T peek() throws Exception {
        if (top == null) {
            throw new Exception("스택이 비었습니다.");
        }
        return top.data;
    }
    public T pop() throws Exception {
        if (top == null) {
            throw new Exception("스택이 비었습니다.");
        }
        T data = top.data;
        top = top.next;
        return data;

    }
    public boolean isEmpty(){

        return top == null;
    }

    public static void main(String[] args) {


    }
}
