import java.util.Scanner;

class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Row = " + (i + 1)
                            + ", Column = " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}
