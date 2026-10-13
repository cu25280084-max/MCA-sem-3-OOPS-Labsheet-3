import java.util.Scanner;

class Q18 {
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

        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (numbers[i][j][k] == target) {
                        System.out.println("Position: " + (i + 1) + ", "
                                + (j + 1) + ", " + (k + 1));
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}
