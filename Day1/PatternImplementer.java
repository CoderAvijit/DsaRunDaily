/*
 * https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
 */

package Day1;

public class PatternImplementer {

    public static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print((5 - j + 1));
            }
            System.out.println();
        }
    }

    public static void pattern7() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9() {
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 1; j < 5; j++) {
            for (int i = 5; i > j; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10() {
        for (int i = 1; i <= 5; i++) {
            int flag = 1;
            if (i % 2 != 0) {
                flag = 1;
            } else {
                flag = 0;
            }
            System.out.print(flag);
            for (int j = 2; j <= i; j++) {
                if (flag == 0) {
                    System.out.print(1);
                    flag = 1;
                } else {
                    System.out.print(0);
                    flag = 0;
                }
            }
            System.out.println();
        }
    }

    public static void pattern11() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern12() {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void pattern13() {
        for (int i = 1; i <= 5; i++) {
            int asciiChar = (int) 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char) asciiChar);
                asciiChar++;
            }
            System.out.println();
        }
    }

    public static void pattern14() {
        for (int i = 5; i >= 1; i--) {
            int asciiChar = (int) 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char) asciiChar);
                asciiChar++;
            }
            System.out.println();
        }
    }

    public static void pattern15() {
        int asciiChar = (int) 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) asciiChar);
            }
            asciiChar++;
            System.out.println();
        }
    }

    public static void pattern16() {
        for (int i = 1; i <= 4; i++) {
            int asciiChar = (char) 'A';
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) asciiChar);
                asciiChar++;
            }
            asciiChar = (char) 'A';
            for (int j = 1; j < i; j++) {
                System.out.print((char) asciiChar);
                asciiChar++;
            }

            System.out.println();
        }
    }

    public static void pattern17() {
        for (int i = 1; i <= 5; i++) {
            int asciiChar = (int) 'E' - i + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) asciiChar + " ");
                asciiChar++;
            }
            System.out.println();
        }
    }

    public static void pattern18() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern19() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern20() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void pattern21(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {

            // inner loop for no. of columns.
            for (int j = 0; j < 2 * n - 1; j++) {

                // Initialising the top, down, left and right indices of a cell.
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;

                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }

            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        // pattern6();
        // pattern7();
        // pattern8();
        // pattern9();
        // pattern10();
        // pattern11();
        // pattern12();
        // pattern13();
        // pattern14();
        // pattern15();
        // pattern16();
        // pattern17();
        // pattern18();
        // pattern19();
        // pattern20();
        pattern21(4);
    }
}