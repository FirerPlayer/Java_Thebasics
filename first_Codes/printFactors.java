public class printFactors {
    public static void main(String[] args) {
        printFactors(32);
    }
    public static void printFactors(int n){
        if(n < 1){
            System.out.println("Invalid Value");
        }else{
            int i=1;
            while (i <= n){
                if(n % i == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
