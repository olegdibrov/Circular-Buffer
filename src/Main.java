import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CircularBuffer<Integer> circularBuffer = new CircularBuffer<>(4);
      //  System.out.println(circularBuffer.isEmpty());
        circularBuffer.put(1);
        circularBuffer.put(5);
        circularBuffer.put(6);
        circularBuffer.put(3);
      //  System.out.println(circularBuffer.isEmpty());
//        System.out.println(circularBuffer.get());
//        circularBuffer.put(2);
//        System.out.println(circularBuffer.get());
//        System.out.println(circularBuffer.get());
//        System.out.println(circularBuffer.get());
//        circularBuffer.put(3);
//        circularBuffer.put(4);
//        circularBuffer.put(4);
//        circularBuffer.put(4);

        List<Integer> list = Arrays.asList(5, 6, 3);
 //       circularBuffer.addAll(list);

//        System.out.println(circularBuffer.get());
//        System.out.println(circularBuffer.get());
//        System.out.println(circularBuffer.get());
//        System.out.println(circularBuffer.get());

        System.out.println("______________SORT__________");
      //  circularBuffer.sort();

        System.out.println(circularBuffer.get());
        circularBuffer.put(4);
        circularBuffer.put(4);
        System.out.println(circularBuffer.get());
        System.out.println(circularBuffer.get());
        System.out.println(circularBuffer.get());
        System.out.println(circularBuffer.get());
        System.out.println(circularBuffer.get());

    }
}
