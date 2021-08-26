public class isPolindrome {
    public static void main(String[] args) {
        if(isPalindrome(1110111)){
            System.out.println("É polimdromo");
        }else{
            System.out.println("Não é polindromo");
        }

    }
    public static boolean isPalindrome(int n){
        int reverse=0;
        if(n < 0){
            n= (-1) * n;
        }
        int aux=n;
        while (n > 0){
            int lastDig = n%10;
            n/=10;
            reverse*=10;
            reverse+=lastDig;
        }
        if(reverse == aux){
            return true;
        }else{
            return false;
        }
    }
}
