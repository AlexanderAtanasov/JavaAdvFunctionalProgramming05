import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class b07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        Function<List<Integer>,Integer> result = list -> list.lastIndexOf(list.stream().min(Integer::compareTo).get());
        System.out.println( result.apply(numbers));


    }
}
