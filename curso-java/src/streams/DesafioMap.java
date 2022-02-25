package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> binary = Integer::toBinaryString;
        UnaryOperator<String> invert = str -> new StringBuilder(str).reverse().toString();
        Function<String, Integer> toInt = num -> Integer.parseInt(num, 2);

        nums.stream().map(binary).map(invert).map(toInt).forEach(System.out::println);

    }
}
