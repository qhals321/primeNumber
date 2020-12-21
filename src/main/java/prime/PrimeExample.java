package prime;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class PrimeExample {
    public static void main(String[] args) {
        Map<Boolean, List<Integer>> collect = IntStream.rangeClosed(2, 100).boxed()
                .collect(new PrimeCollector());

        collect.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
            System.out.println("-------------");
        });
    }
}
