import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numRoll = 0;
        int sum = 0;
        boolean isTrue = false;
        boolean isNotOneChar = false;
        String text;
        char input;


        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Number of roll: ");
            text = scanner.nextLine();
            input = text.charAt(0);

            char[] chars = text.toCharArray();
            for (int i = 1; i < text.length(); i++) {
                isNotOneChar = true;
                if (chars[i] != ' ') {
                    System.out.println("Write only one number");
                    break;
                }

            }
            if (isNotOneChar)
                isNotOneChar = false;

            else {
                switch (input) {
                    case '1', '2', '3', '4', '5', '6':
                        isTrue = true;
                        break;
                    case 'q':
                        System.out.println("Stop");
                        break;
                    default:
                        System.out.println("Write number");
                        isTrue = false;

                }
            }
            if (isTrue) {
                numRoll = (int) input - 48;
                sum += numRoll;
                makeRoll(numRoll);
                System.out.printf("You rolled: %d \n", sum);
                isTrue = false;

            }

        }
        while (input != 'q');


        scanner.close();

    }

    public static void makeRoll(int a) {
        System.out.println(" ------- ");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 2; j < 7; j++) {
                if (a != 1) {
                    if (i == 0 && j == 2)
                        printPoint();
                    else if (i == 2 && j == 6)
                        printPoint();
                    else if (a == 6 || a == 4 || a == 5) {
                        if (i == 0 && j == 6)
                            printPoint();
                        else if (i == 2 && j == 2)
                            printPoint();
                        else if ((a == 5)) {
                            if (i == 1 && j == 4) {
                                printPoint();
                            } else printSpace();
                        } else if (a == 6) {
                            if ((i == 0 && j == 4) || (i == 2 && j == 4))
                                printPoint();
                            else printSpace();
                        } else printSpace();
                    } else if ((a == 3)) {
                        if (i == 1 && j == 4) {
                            printPoint();
                        } else printSpace();
                    } else printSpace();
                }
                else if ((i == 1 && j == 4))
                    printPoint();
                else
                    printSpace();


            }
            System.out.println(" |");
        }
        System.out.println(" ------- ");
        System.out.println();
    }

    static void printPoint() {
        System.out.print("●");
    }

    static void printSpace() {
        System.out.print(" ");
    }
}