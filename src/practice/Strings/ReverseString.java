package practice.Strings;

public class ReverseString {
    public static String solve(String s) {
        String[] strings = s.split(" ");
        StringBuilder a = new StringBuilder();

        for (int i = strings.length - 1; i >= 0; i--) {

            if (strings[i] != null && !strings[i].isEmpty()) {
                a.append(strings[i]).append(" ");
            }
        }

        return a.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(solve("the sky is blue"));
        System.out.println(solve("       fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq                 "));
    }
}
