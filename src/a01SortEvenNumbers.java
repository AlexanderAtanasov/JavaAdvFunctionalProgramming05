import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class a01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).toArray();

        System.out.println(printArray(numbers));

        Arrays.sort(numbers);

        System.out.println(printArray(numbers));

    }

    private static String printArray(int[] numbers) {
        return Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining(", "));
    }
}
