public class sumlastandfirst {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(19));

    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int first, aux= number;
        if(number >= 10) {
            while (true) {
                number /= 10;
                if (number < 10) {
                    first = number;
                    break;
                }
            }
        }else{
            return number*2;
        }
        return first + aux%10;
    }
}
