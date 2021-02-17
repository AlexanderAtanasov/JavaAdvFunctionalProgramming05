import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class b03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Function<int[],Integer> minNumber = numbers -> Arrays.stream(numbers).min().getAsInt();
        System.out.println(minNumber.apply(input));
    }
}
