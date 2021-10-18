import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char[][] input = new char[4][4];
        for (int i = 0; i < 4; i++) {
            input[i] = s.next().toCharArray();
        }

        boolean test = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (input[i][j] == input[i][j + 1] &&
                        input[i][j] == input[i + 1][j] &&
                        input[i][j] == input[i + 1][j + 1]) {
                    test = false;
                }

            }
        }
        System.out.println(test ? "YES" : "NO");
    }
}
