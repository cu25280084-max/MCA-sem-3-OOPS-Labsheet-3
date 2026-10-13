class Q19 {
    public static void main(String[] args) {
        int[][] numbers = {
            {10, 20},
            {30, 40, 50},
            {60, 70, 80, 90}
        };

        for (int[] row : numbers) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
