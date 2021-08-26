public class sum {
    public static void main(String[] args) {
        System.out.println(sumDigits(12505));

    }
    public  static int sumDigits(int n){
        if(n < 10){
            return -1;
        }
        int s= 0;
        while(n > 0){
            int dig= n%10;
            s= s + dig;
            n= n/10;
        }

        return s;
    }
}
