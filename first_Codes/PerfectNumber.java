public class PerfectNumber {
    public static void main(String[] args) {
        if(isPerfectNumber(28)){
            System.out.println("é perfeito");
        }else {
            System.out.println("não é perfeito");
        }

    }
    public static boolean isPerfectNumber(int n){
        if(n < 1){
            return false;
        }
        int i=1,s=0;
        while (i < n){
            if(n % i == 0){
                s+=i;
            }
            i++;
        }
        if(n == s){
            return true;
        }else{
            return false;
        }
    }
}

