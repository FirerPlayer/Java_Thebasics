import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k=scanner.nextInt();
        printSquareStar(k);

        scanner.close();

    }
    public static void printSquareStar(int n) {
        if (n < 5) {
            System.out.println("Invalid Value");
        } else {
            int cj = 0, ci = 0;
            for (int i = 1; i <= n; i++) {
                ci++;
                for (int j = 1; j <= n; j++) {
                    cj++;
                    if (i == 1) {
                        System.out.print("*");
                    } else if (i > 1) {
                        if (i == j || ci - i + 1 == j || i == n || j == n || (n + 1 == i + j)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    if (cj == n * i) {
                        System.out.println();
                    }

                }
            }
        }
    }
}

