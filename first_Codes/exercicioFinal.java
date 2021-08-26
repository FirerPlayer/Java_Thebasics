public class exercicioFinal {
    public static void main(String[] args) {
        numberToWords(0);
    }
    public static void numberToWords(int n){
        if(n < 0){
            System.out.println("Invalid Value");
        }
        int k= reverse(n),m;
        if(k == 0){
            System.out.println("Zero");
        }
        if(getDigitCount(k) == getDigitCount(n)) {
            while (k > 0) {
                m = k % 10;
                switch (m) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                k /= 10;
            }
        }else{
            while (k > 0){
                m= k%10;
                switch (m) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                k/=10;
            }
            int i=1;
            while (i <= getDigitCount(n)-getDigitCount(reverse(n))){
                System.out.println("Zero");
                i++;
            }
        }
    }
    public static int reverse(int k){
        int m=0,aux=k;
        if(k<0){
            k*=-1;
        }
        while (k > 0){
            int lastDig = k%10;
            k/=10;
            m*=10;
            m+=lastDig;
        }
        if(aux < 0){
            return -m;
        }else{
            return m;
        }
    }
    public static int getDigitCount(int n){
        if(n < 0){
            return -1;
        }else if(n == 0){
            return 1;
        }
        int count=0;
        while(n > 0){
            int l= n%10;
            if(l >= 0){
                count++;
            }
            n/=10;
        }
        return count;
    }
}