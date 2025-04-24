public class Day2_PatternQuestions {
        public static void main(String[] args) {
        int rows = 5;
        printPyramidPattern(rows);
        printReversePyramidPattern(rows);
        printRightAngleTrianglePattern(rows);
    }

    public static void printPyramidPattern(int rows) {
        System.out.println("Pyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printReversePyramidPattern(int rows) {
        System.out.println("Reverse Pyramid Pattern:");
        for (int i = rows; i >= 1; i--) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printRightAngleTrianglePattern(int rows) {
        System.out.println("Right-Angle Triangle Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}