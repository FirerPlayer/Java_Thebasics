import java.util.Scanner;

public class matematicaPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da sequência de números ->");
        int k= scanner.nextInt();
        scanner.nextLine();
        if (k<1){
            System.out.println("Tamanho inválido !");
            return;
        }
        System.out.println("Digite uma sequência de "+k+" números !");
        double[] n = new double[k];
        double s=0,sn,q;
        for(int i=0 ; i<k ; i++){
            System.out.print("Digite o "+(i+1)+" número ->");
            n[i]= scanner.nextDouble();
            scanner.nextLine();
        }
        boolean tNaoZero=true,decrescente=false,constante=false;
        if(n[0] == 0 || k <= 1){ //condição de existencia da pg
            tNaoZero=false;
            System.out.println("Não é uma PG");
        }
        if(tNaoZero){
            q = n[1]/n[0]; //razão
            if(q == 1){
                sn = k * n[0];
                constante=true;
            }else if(q > -1 && q < 1){
                sn = (n[0] * (Math.pow(q, k) - 1) / (q - 1));
                decrescente=true;
            } else {
                sn = (n[0] * (Math.pow(q, k) - 1) / (q - 1)); //soma dos termos da PG
            }
            for (int i = 0; i < k; i++) { //soma dos termos da sequencia inserida
                s = n[i] + s;
            }

            if(sn == s){
                System.out.print("É uma PG ");
                if(decrescente){
                    if(q<0){
                        System.out.println("descrescente alternante de razão "+q);
                    }else {
                        System.out.println("decrescente de razão"+q);
                    }
                }else if(constante){
                    System.out.println("constante de razão 1");
                }else if(q < 0){
                    System.out.println("alternante de razão "+q);
                }else{
                    System.out.println("crescente de razão "+q);
                }
            }else{
                System.out.println("Não é uma PG");
            }

        }
        scanner.close();
    }
}
