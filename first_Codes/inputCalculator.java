import java.util.Scanner;

public class inputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int i=1,n,sum=0;
        while (true){
            if(scanner.hasNextInt()){
                n=scanner.nextInt();
                sum+=n;
            }else{
                break;
            }
            i++;
            scanner.nextLine();
        }
        double avg= (double) sum/(i-1);
        System.out.println("SUM = "+ sum + " AVG = "+ Math.round(avg));
        scanner.close();
    }
}
