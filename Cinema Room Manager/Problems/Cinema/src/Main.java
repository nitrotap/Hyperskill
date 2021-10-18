import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] cin = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin[i][j] = s.nextInt();
            }
        }
        int k = s.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (cin[i][j] == 0) {
                    for (int a = 0; a < k; a++) {
                        if (j + a < m && cin[i][j + a] == 0) {
                            count++;
                        } else {
                            count = 0;
                            break;
                        }
                    }
                    if (count == k) {
                        System.out.println(i + 1);
                        break;
                    }
                }
                if (count == k) {
                    break;
                }
            }
            if (count == k) {
                break;
            }
        }

        if (count != k) {
            System.out.println("0");
        }
    }
}