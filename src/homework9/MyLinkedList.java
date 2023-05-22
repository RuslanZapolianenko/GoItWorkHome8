package homework9;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node nodeToRemove = getNodeAtIndex(index);
        Node previousNode = nodeToRemove.previous;
        Node nextNode = nodeToRemove.next;

        if (previousNode == null) {
            head = nextNode;
        } else {
            previousNode.next = nextNode;
            nodeToRemove.previous = null;
        }

        if (nextNode == null) {
            tail = previousNode;
        } else {
            nextNode.previous = previousNode;
            nodeToRemove.next = null;
        }

        nodeToRemove.value = null;
        size--;
    }

    public void clear() {
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.previous = null;
            current.next = null;
            current.value = null;
            current = nextNode;
        }
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node node = getNodeAtIndex(index);
        return node.value;
    }

    private Node getNodeAtIndex(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private class Node {
        private Object value;
        private Node previous;
        private Node next;

        public Node(Object value) {
            this.value = value;
            this.previous = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + ": " + list.get(i));
        }

        list.remove(2);

        //Виводимо список знову
        System.out.println("\nElements after remove are: ");
        for (int i = 0; i < list.size(); i++) {

            System.out.println("Element " + i + ": " + list.get(i));
        }

        //Очищаємо список
        list.clear();

        //Перевіряємо, що список порожній після очищення
        System.out.println("\nList after clearing " + list.size());
    }
}


