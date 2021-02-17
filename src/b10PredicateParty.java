import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class b10PredicateParty {
    static List<String> partyNames = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        partyNames = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = "";
        //  Predicate<String> action =
        while (!"Party!".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");
            String action = tokens[0];
            String criteria = tokens[1];
            switch (action) {
                case "Double":
                    addOneMore(getPredicate(tokens));
                    break;
                case "Remove":
                    removeOne(getPredicate(tokens));
                    break;
            }
        }

        if (partyNames.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(partyNames);
            System.out.println(String.join(", ",Arrays.toString(partyNames.toArray())) + " are going to the party!");
        }

    }

    private static void removeOne(Predicate<String> predicate) {
        partyNames.removeIf(predicate);
    }

    private static void addOneMore(Predicate<String> predicate) {

        List<String> namesToAdd = new ArrayList<>();
        partyNames.stream().filter(predicate).forEach(namesToAdd::add);
        partyNames.addAll(namesToAdd);

    }

    private static Predicate<String> getPredicate(String[] tokens) {
        Predicate<String> predicate = null;

        if (tokens[1].equals("StartsWith")) {
            predicate = name -> name.startsWith(tokens[2]);
        } else if (tokens[1].equals("EndsWith")) {
            predicate = name -> name.endsWith(tokens[2]);
        } else if (tokens[1].equals("Length")) {
            predicate = name -> name.length() == Integer.parseInt(tokens[2]);
        }

        return predicate;
    }

}
