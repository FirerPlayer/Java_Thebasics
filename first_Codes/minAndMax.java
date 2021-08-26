import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=1,max=0,min=0;
        while(true) {
            System.out.println("Enter a number #"+i+" :");
            if (scanner.hasNextInt()) {
                int n=scanner.nextInt();
                if(i==1){
                    max=n;
                    min=n;
                }
                if(n>max){
                    max=n;
                }

                if(n<min){
                    min=n;
                }

            } else {
                System.out.println("Invalid number");
                break;
            }
            i++;
            scanner.nextLine();
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);
        scanner.close();
    }
}
