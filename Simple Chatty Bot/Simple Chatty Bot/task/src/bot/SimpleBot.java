package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("SuperHelper3000", "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, type in your name below.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        /*
        Name of the method
Each method has a name that is used to call it. Generally, it reflects what the method does – prints, finds, calculates, provides you with some information.

The Java compiler requires a method name to be a legal identifier. The rules for legal identifiers are the following:

identifiers are case-sensitive;
an identifier can include Unicode letters, digits, underscore _ or currency characters, such as $;
an identifier can't start with a digit;
identifiers must not be a keyword.
In addition, there is a naming convention that restricts possible method names. It's optional but desired for developers.
By convention, the one-word name should be a verb in lowercase: sum, multiply, or round.

If a method has a multi-word name, the first letter of the second and the following words should be capitalized: getValue, calculateNumberOfOranges, or findLetter.

OK, now we know how the methods are named. Let's talk about how we actually call it!
         */
        System.out.println("Which rule is not true about identifiers?");
        System.out.println("1. An identifier can't include Unicode letters.");
        System.out.println("2. An identifier can't start with a digit.");
        System.out.println("3. An identifier must not be a keyword.");
        System.out.println("4. The naming convention for one word is that is must be a verb.");

        Scanner s = new Scanner(System.in);

        while (true) {
            int ans1 = s.nextInt();
            if (ans1 == 1) {
                break;
            } else {
                System.out.println("Please, try again.");
            }

        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
