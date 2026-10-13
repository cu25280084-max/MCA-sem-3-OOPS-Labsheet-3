import java.util.Scanner;

class Q14 {
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

        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1));

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(numbers[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
