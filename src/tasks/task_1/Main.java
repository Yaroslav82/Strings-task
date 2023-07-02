package tasks.task_1;

public class Main {

    private final static char WRONG_LETTER = 'b';
    private final static char CORRECT_LETTER = 'o';

    public static void main(String[] args) {
        print(fixStr("brange", "plum", "tomato", "onibn", "grape"));
    }

    /**
     * Changes {@code WRONG_LETTER} to {@code CORRECT_LETTER} in each element of the {@code array}.
     * <p>
     * Then it returns an array of strings with the changed elements.
     *
     * @param   array   array of {@code String}.
     * @return an array of strings in which the incorrect letters of each element are replaced with the correct ones.
     */
    private static String[] fixStr(String... array) {
        int len = array.length;
        String[] result = new String[len];

        for (int i = 0; i < len; i++) {
            result[i] = array[i].replace(WRONG_LETTER, CORRECT_LETTER);
        }

        return result;
    }

    /**
     * Prints an array of {@code String} into a column, with element numbering.
     *
     * @param   array   array of {@code String}.
     */
    private static void print(String... array) {
        int count = 1;

        for (String str : array) {
            System.out.println(count + ") " + str);
            count++;
        }
    }
}
