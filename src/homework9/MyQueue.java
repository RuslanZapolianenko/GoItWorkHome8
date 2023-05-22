package homework9;

public class MyQueue {
    private Node head;
    private Node tail;
    private int size;

    public MyQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.value;
    }

    public Object poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object value = head.value;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node {
        private Object value;
        private Node next;

        public Node(Object value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add("Element 1");  //додаємо елементи
        queue.add("Element 2");
        queue.add("Element 3");

        System.out.println("Initial queue:");
        System.out.println("size: " + queue.size()); // розмір колекції
        System.out.println("peek: " + queue.peek());  // перший елемент з черги

        System.out.println("\nRemoving first element from queue:");
        System.out.println("poll: " + queue.poll());  //повертаємо перший елемент з черги і видаляємо його з колекції
        System.out.println("size: " + queue.size());
        System.out.println("peek: " + queue.peek());

        System.out.println("\nClearing queue:");
        queue.clear();  // очищаємо колекцію
        System.out.println("size: " + queue.size());
    }
}




