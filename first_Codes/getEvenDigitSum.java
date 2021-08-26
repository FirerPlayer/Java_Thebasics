public class getEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(205396));

    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int s= 0;
        while (number > 0){
            int lastDig = number%10;
            number/=10;
            if(lastDig % 2 == 0){
                s+=lastDig;
            }
        }
        return s;
    }
}
