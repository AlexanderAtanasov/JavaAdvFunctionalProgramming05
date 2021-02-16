import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class a03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Predicate<String> startsWithUpper = s -> Character.isUpperCase(s.charAt(0));

        System.out.println(Arrays.stream(input).filter(startsWithUpper).count());
        Arrays.stream(input).filter(startsWithUpper).forEach(System.out::println);

    }
}
