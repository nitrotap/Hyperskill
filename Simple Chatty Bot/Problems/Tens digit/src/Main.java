import java.util.Scanner;

/*   find max of three numbers
int result = a > b ? (a > c ? a : c) : (b > c ? b : c);
  if a > b      if a>c then return a else c   if b>c then return b else c
 */
/*
int x = 15, y = 20;
What is the result of the following statement (x < y) ? (y + x) : (y - x)?
                              if x less than y      return y +  x       else return y-x
                              15 < 20               return 15+20
 */
/*
if (a + b == c) {
    d = c;
} else {
    d = 10;
}
 */


class Main {
    public static void main(String[] args) {

        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = false;

        boolean result = (b1 && b2) ? b1 : ((b2 || b3) ? b2 : b3);
        System.out.println(result);
    }
}






/*
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
    }
}

 */