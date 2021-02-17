import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class b05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);
        Predicate<Integer> predicate = num -> num % n != 0;
        numbers.stream().filter(predicate).forEach(e -> System.out.print(e + " "));
    }
}
