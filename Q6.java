import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[5];
        int[] copy = new int[5];

        for (int i = 0; i < original.length; i++) {
            original[i] = sc.nextInt();
            copy[i] = original[i];
        }

        for (int number : copy) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}
