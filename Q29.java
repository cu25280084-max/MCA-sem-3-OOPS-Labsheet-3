import java.util.Arrays;

class Q29 {
    public static void main(String[] args) {
        int[][] numbers = {
            {30, 10, 20},
            {60, 40},
            {90, 70, 80, 50}
        };

        for (int[] row : numbers) {
            Arrays.sort(row);

            for (int number : row) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }
}
