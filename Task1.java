package Medthod2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number :");
        int number = input.nextInt();

        int digit1 = number / 1000;
        number = number % 1000;
        int digit2 = number / 100;
        number = number % 100;
        int digit3 = number / 10;
        number = number % 10;
        int digit4 = number;

        if (digit1 == 1) {
            one(args);
        } else if (digit1 == 2) {
            two(args);
        } else if (digit1 == 3) {
            three(args);
        } else if (digit1 == 4) {
            four(args);
        } else if (digit1 == 5) {
            five(args);
        } else if (digit1 == 6) {
            six(args);
        } else if (digit1 == 7) {
            seven(args);
        } else if (digit1 == 8) {
            eight(args);
        } else if (digit1 == 9) {
            nine(args);
        } else if (digit1 == 0) {
            zero(args);
        }

        if (digit2 == 1) {
            one(args);
        } else if (digit2 == 2) {
            two(args);
        } else if (digit2 == 3) {
            three(args);
        } else if (digit2 == 4) {
            four(args);
        } else if (digit2 == 5) {
            five(args);
        } else if (digit2 == 6) {
            six(args);
        } else if (digit2 == 7) {
            seven(args);
        } else if (digit2 == 8) {
            eight(args);
        } else if (digit2 == 9) {
            nine(args);
        } else if (digit2 == 0) {
            zero(args);
        }
        if (digit3 == 1) {
            one(args);
        } else if (digit3 == 2) {
            two(args);
        } else if (digit3 == 3) {
            three(args);
        } else if (digit3 == 4) {
            four(args);
        } else if (digit3 == 5) {
            five(args);
        } else if (digit3 == 6) {
            six(args);
        } else if (digit3 == 7) {
            seven(args);
        } else if (digit3 == 8) {
            eight(args);
        } else if (digit3 == 9) {
            nine(args);
        } else if (digit3 == 0) {
            zero(args);
        }

        if (digit4 == 1) {
            one(args);
        } else if (digit4 == 2) {
            two(args);
        } else if (digit4 == 3) {
            three(args);
        } else if (digit4 == 4) {
            four(args);
        } else if (digit4 == 5) {
            five(args);
        } else if (digit4 == 6) {
            six(args);
        } else if (digit4 == 7) {
            seven(args);
        } else if (digit4 == 8) {
            eight(args);
        } else if (digit4 == 9) {
            nine(args);
        } else if (digit4 == 0) {
            zero(args);
        }

    }

    public static void one(String[] args) {
        System.out.println("  11");
        System.out.println("1111");
        System.out.println("  11");
        System.out.println("  11");
        System.out.println("  11");
        System.out.println("  11");
        System.out.println();

    }

    public static void two(String[] args) {
        System.out.println("2222222");
        System.out.println("       2");
        System.out.println("       2");
        System.out.println("2222222");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2222222");
        System.out.println();

    }

    public static void three(String[] args) {
        System.out.println("3333333");
        System.out.println("      3");
        System.out.println("      3");
        System.out.println("3333333");
        System.out.println("      3");
        System.out.println("      3");
        System.out.println("3333333");
        System.out.println();
    }

    public static void four(String[] args) {
        System.out.println("4        4\r\n" + //
                "4        4\r\n" + //
                "4        4\r\n" + //
                "444444444\r\n" + //
                "        4\r\n" + //
                "        4\r\n" + //
                "        4\r\n" + //
                "");
        System.out.println();

    }

    public static void five(String[] args) {
        System.out.println("5555555\r\n" + //
                "5\r\n" + //
                "5\r\n" + //
                "555555\r\n" + //
                "      5\r\n" + //
                "      5\r\n" + //
                "555555\r\n" + //
                "");
        System.out.println();

    }

    public static void six(String[] args) {
        System.out.println("  66666\r\n" + //
                " 6\r\n" + //
                " 6\r\n" + //
                " 66666\r\n" + //
                " 6    6\r\n" + //
                " 6    6\r\n" + //
                "  66666\r\n" + //
                "");
        System.out.println();

    }

    public static void seven(String[] args) {
        System.out.println("7777777\r\n" + //
                "      7\r\n" + //
                "      7\r\n" + //
                "     7\r\n" + //
                "     7\r\n" + //
                "     7\r\n" + //
                "     7\r\n" + //
                "");

        System.out.println();

    }

    public static void eight(String[] args) {
        System.out.println("  88888\r\n" + //
                " 8     8\r\n" + //
                " 8     8\r\n" + //
                "  88888\r\n" + //
                " 8     8\r\n" + //
                " 8     8\r\n" + //
                "  88888\r\n" + //
                "");
        System.out.println();

    }

    public static void nine(String[] args) {
        System.out.println("  99999\r\n" + //
                " 9    9\r\n" + //
                " 9    9\r\n" + //
                "  99999\r\n" + //
                "      9\r\n" + //
                "      9\r\n" + //
                "  99999\r\n" + //
                "");
        System.out.println();
    }

    public static void zero(String[] args) {
        System.out.println("    00000\r\n" + //
                "  0     0\r\n" + //
                " 0       0\r\n" + //
                " 0       0\r\n" + //
                " 0       0\r\n" + //
                " 0       0\r\n" + //
                "  0     0\r\n" + //
                "    00000\r\n" + //
                "");

        System.out.println();

    }
}
