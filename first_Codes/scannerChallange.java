import java.util.Scanner;

public class scannerChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s=0,k;
        for(int i=1;i <= 10;i++) {
            System.out.println("Enter a number #"+i+" :");
            if (scanner.hasNextInt()) {
                k = scanner.nextInt();
                s+=k;
            } else {
                System.out.println("Have entered a invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum: " + s);
        scanner.close();
    }

}
