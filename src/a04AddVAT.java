import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class a04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> withVat = x -> x * 1.2;
        double[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();
        System.out.println("Prices with VAT:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("%.2f", withVat.apply(numbers[i])));
        }
    }
}
