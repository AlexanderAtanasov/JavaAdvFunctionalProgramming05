import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class b02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> print = s -> {
            System.out.printf("Sir %s", s);
            System.out.println();
        };
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(print);
    }
}
