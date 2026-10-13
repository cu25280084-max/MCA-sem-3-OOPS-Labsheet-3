import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Upper Triangular Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((i <= j ? matrix[i][j] : 0) + " ");
            }
            System.out.println();
        }

        System.out.println("Lower Triangular Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((i >= j ? matrix[i][j] : 0) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
