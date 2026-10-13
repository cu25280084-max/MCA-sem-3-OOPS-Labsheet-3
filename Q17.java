import java.util.Scanner;

class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] numbers = new int[2][2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    numbers[i][j][k] = sc.nextInt();
                }
            }
        }

        int maximum = numbers[0][0][0];

        for (int[][] layer : numbers) {
            for (int[] row : layer) {
                for (int number : row) {
                    if (number > maximum) {
                        maximum = number;
                    }
                }
            }
        }

        System.out.println("Maximum = " + maximum);
        sc.close();
    }
}
