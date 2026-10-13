import java.util.Scanner;

class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int mainSum = 0, secondarySum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            mainSum += matrix[i][i];
            secondarySum += matrix[i][2 - i];
        }

        System.out.println("Main Diagonal Sum = " + mainSum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
        sc.close();
    }
}
