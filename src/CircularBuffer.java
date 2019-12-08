import java.util.NoSuchElementException;

public class CircularBuffer<T> {
    private T[] elements;
    private int amount;
    private int head;
    private int tail;
    private boolean full;
    private int size;

    public CircularBuffer() {
        this.head = 0;
        this.tail = 0;
        this.amount = 0;
        this.full = false;
        this.size = 7;
        this.elements = (T[]) new Object[size];
    }

    public CircularBuffer(int size) {
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
            head = 0;
        }
        if (!isFull()) {
            if (head != size) {
                elements[head] = t;
                head++;
                amount++;
            } else if (!full) {
                head = tail - 1;
                elements[head] = t;
                amount++;
            }
        } else throw new RuntimeException("The buffer is full");
    }

    public T get() {
        if (!isEmpty()) {
            T element = elements[tail];
            tail++;
            full = false;
            return element;
        } else throw new RuntimeException("The buffer is empty");
    }

    private boolean isEmpty() {
        return head == tail && !full;
    }

    private boolean isFull() {
        return head == tail && full;
    }
}
