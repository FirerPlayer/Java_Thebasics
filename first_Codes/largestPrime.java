public class largestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(12));

    }
    public static int getLargestPrime(int n){
        if(n<=1)
            return -1;
        int p=0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                p=i;
            }
        }
        return p;
    }

    public static boolean isPrime(int n){
        int i=2;
        while (i <= Math.pow(n,0.5)) {
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}

