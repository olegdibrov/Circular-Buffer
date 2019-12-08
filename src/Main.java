public class Main {
    public static void main(String[] args) {

        CircularBuffer<Integer> circularBuffer = new CircularBuffer<>(4);

        circularBuffer.put(1);
        System.out.println(circularBuffer.get());
        circularBuffer.put(2);
        System.out.println(circularBuffer.get());
        circularBuffer.put(3);
        circularBuffer.put(4);
        circularBuffer.put(4);
        circularBuffer.put(4);

    }
}
