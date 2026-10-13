import java.util.Scanner;

class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int[] unique = new int[5];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {
            boolean found = false;

            for (int i = 0; i < count; i++) {
                if (unique[i] == number) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[count] = number;
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }

        sc.close();
    }
}
