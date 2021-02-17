import java.util.Arrays;
import java.util.Scanner;

public class readArrays {
    public static int[] readIntArray(Scanner scanner) {

      return   Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {

    }
}
