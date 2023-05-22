package homework9;

public class MyArrayList {

        private Object[] array;
        private int size;
        private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
            array = new Object[DEFAULT_CAPACITY];
            size = 0;
        }

        public void add(Object value) {
            ensureCapacity(size + 1);
            array[size++] = value;
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index");
            }
            int numShift = size - index - 1;
            if (numShift > 0) {
                System.arraycopy(array, index + 1, array, index, numShift);
            }
            array[--size] = null;
        }

        public void clear() {
            for (int i = 0; i < size; i++) {
                array[i] = null;
            }
            size = 0;
        }

        public int size() {
            return size;
        }

        public Object get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index");
            }
            return array[index];
        }

        private void ensureCapacity(int minCapacity) {
            int currentCapacity = array.length;
            if (minCapacity > currentCapacity) {
                int newCapacity = currentCapacity + (currentCapacity >> 1);  // Increase capacity by 50%
                if (newCapacity < minCapacity) {
                    newCapacity = minCapacity;
                }
                Object[] newArray = new Object[newCapacity];
                System.arraycopy(array, 0, newArray, 0, size);
                array = newArray;
            }
        }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(

        );
        list.add("Hello, ");
        list.add("World ");
        list.add("I ");
        list.add("love ");
        list.add("Java");

        System.out.print("Array list is: ");
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i));
        }

        list.remove(1);
        System.out.print("\nArray list after removing element at index 1: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        System.out.print("\nThe selected value in array is: " + list.get(2));


        list.clear();
        System.out.print("\nArray list after clearing the list: empty. The value is: " + list.size());
        System.out.println("\nSize after clearing the list : " + list.size());
    }
}





