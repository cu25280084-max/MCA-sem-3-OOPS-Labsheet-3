import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] devesh = new int[5];

        for (int i = 0; i < 5; i++) {
            devesh[i] = sc.nextInt();
        }

        for (int number : devesh) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}
