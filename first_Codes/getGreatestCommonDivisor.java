public class getGreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(18,30));

    }
    public static int getGreatestCommonDivisor(int n1, int n2){
        if(n1 <10 || n2 <10){
            return -1;
        }
        int k=0,i=1;
        while (i <= n1 && i <= n2){
            if(n1%i == 0 && n2%i == 0){
                k=i;
            }
            i++;
        }
        return k;
    }
}
