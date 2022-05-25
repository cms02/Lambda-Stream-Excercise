import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_4_1 {
    public static void main(String[] args) {

//        IntStream intStream = new Random().ints(); //무한스트림
//        IntStream intStream1 = new Random().ints(10, 5, 10);
//        intStream1
//                .limit(10)
//                .forEach(System.out::println);
//
//        //iterate(T seed, UnaryOperator f) 단항 연산자
//        Stream<Integer> intStream2 = Stream.iterate(0, n -> n + 2);
//        intStream2
//                .limit(10)
//                .forEach(System.out::println);
//
//        // generate(Supplier s) : 주기만 하는 것 입력x, 출력 O
//        Stream<Integer> oneStream = Stream.generate(() -> 1);
//        oneStream
//                .limit(10)
//                .forEach(System.out::println);


//        int[] arr = null;
        int[] arr = new int[0];
        System.out.println("arr.length=" + arr.length);

//        Optional<String> opt = null; // OK. 하지만 바람직 X
        Optional<String> opt = Optional.empty();

        System.out.println("opt=" + opt);
//        System.out.println("opt=" + opt.get());
        String str = "";

//        try {
//            str = opt.get(); // 예외 발생
//        } catch (Exception e) {
//            str = "";
//        }

        str = opt.orElse("");
        System.out.println("str=" + str);




    }
}
