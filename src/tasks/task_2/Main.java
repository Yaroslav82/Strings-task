package tasks.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static String ONION = "onion";

    public static void main(String[] args) {
        print(deleteOnion("orange", "plum", "tomato", "onion", "grape", "onion"));
    }

    /**
     * Deletes all {@code ONION} from {@code array}.
     * <p>
     * Then it returns a List of Strings without {@code ONION}.
     *
     * @param   array   array of {@code String}.
     * @return a {@code List<String>} without elements which value equals {@code ONION}.
     */
    private static List<String> deleteOnion(String... array) {
        List<String> result = new ArrayList<>();

        for (String str : array) {
            if (!ONION.equals(str)) {
                result.add(str);
            }
        }

        return result;
    }

    /**
     * Prints a list of {@code String} into a column, with element numbering.
     *
     * @param   strings   {@code List} of {@code String}.
     */
    private static void print(List<String> strings) {
        int count = 1;

        for (String str : strings) {
            System.out.println(count + ") " + str);
            count++;
        }
    }
}
