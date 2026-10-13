import java.util.Scanner;

class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[3][];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Number of subjects for Student " + (i + 1) + ": ");
            int subjects = sc.nextInt();

            marks[i] = new int[subjects];

            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ":");

            for (int mark : marks[i]) {
                System.out.print(mark + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
