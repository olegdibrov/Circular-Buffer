import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CircularBuffer<Integer> circularBuffer = new CircularBuffer<>(Integer[].class, 4);
      //  System.out.println(circularBuffer.isEmpty());
        circularBuffer.put(1);
        System.out.println(circularBuffer.get());
        circularBuffer.put(5);
        circularBuffer.put(6);
        circularBuffer.put(3);
        System.out.println("TO ARRAY");


        circularBuffer.put(3);




        //Integer[] array = circularBuffer.toArray();
//        for (Integer integer : array) {
//            System.out.println(integer);
//        }
//        System.out.println("TO ARRAY end");
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

     //   List<Integer> list = Arrays.asList(5, 6, 3);
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
       // System.out.println(circularBuffer.get());
       // Integer[] array = circularBuffer.toArray();
      //  for (Integer integer : array) {
      //      System.out.println(integer);
      //  }
        System.out.println("here");

        List<Integer> list = circularBuffer.asList();
        list.stream().forEach(System.out::println);
//
//        System.out.println(circularBuffer.toObjectArray());
//        System.out.println(circularBuffer.toArray());
//        Integer[] array2 = circularBuffer.toArray();
//        for (Integer integer : array2) {
//            System.out.println(integer);
//        }
    }
}
