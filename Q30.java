import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int zeros = 0, nonZeros = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] == 0) {
                    zeros++;
                } else {
                    nonZeros++;
                }
            }
        }

        if (zeros > nonZeros) {
            System.out.println("Sparse Matrix");
        } else {
            System.out.println("Not a Sparse Matrix");
        }

        sc.close();
    }
}
