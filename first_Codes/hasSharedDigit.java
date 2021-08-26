public class hasSharedDigit {
    public static void main(String[] args) {
        if(hasSharedDigit(21,43)){
            System.out.println("Has shared digit");
        }else{
            System.out.println("Not");
        }

    }
    public static boolean hasSharedDigit(int n1, int n2){
        if(n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99){
            return false;
        }
        if( (n1%10 == n2%10) || n1/10 == n2/10 || n1%10 == n2/10 || n2%10 == n1/10){
            return true;
        }else{
            return false;
        }
    }
}
