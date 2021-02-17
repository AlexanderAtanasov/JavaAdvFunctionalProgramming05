import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;

public class a06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String definer = scanner.nextLine();
        int start = input[0];
        int end = input[1];
        for (int i = start; i <= end; i++) {
            if (definer.equals("odd")) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            } else if (definer.equals("even")) {
                if (i %2 == 0) {
                    System.out.print(i + " ");
                }
            }

        }


    }
}

