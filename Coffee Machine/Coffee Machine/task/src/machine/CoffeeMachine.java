package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        menu(water, milk, beans, cups, money);
    }
    public static void status(int water, int milk, int beans, int cups, int money) {
        System.out.println("");
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println("");
    }
    public static void exit() {System.exit(0);}
    // buy and fill are not working
    public static void menu(int water, int milk, int beans, int cups, int money) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input = s.next();
        if (input.equals("buy")) {
            buy(water, milk, beans, cups, money);
        } else if (input.equals("fill")) {
            fill(water, milk, beans, cups, money);
        } else if (input.equals("take")) {
            take(water, milk, beans, cups, money);
        } else if (input.equals("remaining")) {
            remaining(water, milk, beans, cups, money);
        } else if (input.equals("exit")) {
            exit();
        } else {
            menu(water, milk, beans, cups, money);
        }
        s.close();
    }
    public static void buy(int water, int milk, int beans, int cups, int money) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - return to menu:");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if (!a.equals("back")) {
            int option = Integer.parseInt(a);
            String missing = "";
            switch (option) {
                //espresso
                case 1:
                    if (water >= 250 && beans >= 16 && cups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 250;
                        beans = beans - 16;
                        money = money + 4;
                        cups--;
                    } else {
                        if (water < 250) {
                            missing = "water";
                        } else if (beans < 16) {
                            missing = "beans";
                        } else if (cups < 1) {
                            missing = "cups";
                        }
                        System.out.println("Sorry, not enough " + missing + "!");
                    }
                    break;
                // latte
                case 2:
                    if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 350;
                        milk = milk - 75;
                        beans = beans - 20;
                        money = money + 7;
                        cups--;
                    } else {
                        if (water < 350) {
                            missing = "water";
                        } else if (beans < 20) {
                            missing = "beans";
                        } else if (cups < 1) {
                            missing = "cups";
                        }
                        System.out.println("Sorry, not enough " + missing + "!");
                    }
                    break;
                // cappuccino
                case 3:
                    if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        water = water - 200;
                        milk = milk - 100;
                        beans = beans - 12;
                        money = money + 6;
                        cups--;
                    } else {
                        if (water < 200) {
                            missing = "water";
                        } else if (beans < 12) {
                            missing = "beans";
                        } else if (cups < 1) {
                            missing = "cups";
                        } else if (milk < 100) {
                            missing = "milk";
                        }
                        System.out.println("Sorry, not enough " + missing + "!");
                    }
                    break;
            }
        }
        menu(water, milk, beans, cups, money);
    }
    public static void fill(int water, int milk, int beans, int cups, int money) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int addWater = s.nextInt();
        water = water + addWater;
        System.out.println("Write how many ml of milk do you want to add:");
        int addMilk = s.nextInt();
        milk = milk + addMilk;
        System.out.println("Write how many g of coffee beans do you want to add:");
        int addBeans = s.nextInt();
        beans += addBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addCups = s.nextInt();
        cups += addCups;
        s.nextLine();
        menu(water, milk, beans, cups, money);
    }
    public static void take(int water, int milk, int beans, int cups, int money) {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println("");
        menu(water, milk, beans, cups, money);
    }
    public static void remaining(int water, int milk, int beans, int cups, int money) {
        status(water, milk, beans, cups, money);
        menu(water, milk, beans, cups, money);
    }
}