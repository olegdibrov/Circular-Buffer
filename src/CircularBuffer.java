import java.util.*;

public class CircularBuffer<T> {
    private final Class<T[]> type;
    private T[] elements;
    private int amount;
    private int head;
    private int tail;
    private boolean full;
    private int size;

    public CircularBuffer(Class<T[]> type) {
        this.type = type;
        this.head = 0;
        this.tail = 0;
        this.amount = 0;
        this.full = false;
        this.size = 7;
        this.elements = (T[]) new Object[size];
    }

    public CircularBuffer(Class<T[]> type, int size) {
        this.type = type;
        if (size <= 0) {
            throw new IllegalArgumentException("Size should be >= 1");
        }
        this.size = size;
        this.elements = (T[]) new Object[size];
    }

    public void put(T t) {
        if (t == null) {
            throw new IllegalArgumentException("Null value can't be added to CircularBuffer");
        }
        if (amount == size) {
            full = true;
            //head = 0;
        }
        if (!isFull()) {
            if (head != size) {
                elements[head] = t;
                head++;
                amount++;
                if (head == size)
                    head = 0;
            }
            if (amount == size) {
                full = true;
            }
        } else throw new RuntimeException("The buffer is full");
    }

    public T get() {
        if (!isEmpty()) {
            if (tail == size - 1) {
                tail = 0;
            }
            T element = elements[tail];
            tail++;
            amount--;
            full = false;
            return element;
        } else throw new RuntimeException("The buffer is empty");
    }

    public boolean isEmpty() {
        return head == tail && !full;
    }

    public void sort(Comparator<? super T> comparator) {
        T[] tailHeadElements = Arrays.copyOfRange(elements, tail, head);
        Arrays.sort(tailHeadElements, comparator);
        head = 0;
        tail = 0;
        amount = 0;
        addAll(Arrays.asList(tailHeadElements));
    }

    public void sort() {
        T[] tailHeadElements = Arrays.copyOfRange(elements, tail, head);
        Arrays.sort(tailHeadElements);
        head = 0;
        tail = 0;
        amount = 0;
        addAll(Arrays.asList(tailHeadElements));
    }

    public void addAll(List<? extends T> toAdd) {
        for (T t : toAdd) {
            put(t);
        }
    }

    public Object[] toObjectArray() {
        if (tail <= head)
            return Arrays.copyOfRange(elements, tail, head);
        else {
            Object[] array1 = Arrays.copyOfRange(elements, tail, size);
            Object[] array2 = Arrays.copyOfRange(elements, 0, head -1);
            Object[] result = Arrays.copyOf(array1, array1.length + array2.length);
            System.arraycopy(array2, 0, result, array1.length, array2.length);
            return result;
        }
    }


    public T[] toArray() {
        Object[] arrayOfElements = toObjectArray();
        return Arrays.copyOf(arrayOfElements, arrayOfElements.length, type);

    }

    public List<T> asList() {
        return Arrays.asList(toArray());
    }

    private boolean isFull() {
        return head == tail && full;
    }
}
