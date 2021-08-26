package grafos;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("1- Criar um grafo não orientado");
            System.out.println("2- Criar um grafo orientado");
            System.out.println("Digite a opção: ");
            Scanner scanner = new Scanner(System.in);
            int op = scanner.nextInt(), l=0;
            switch (op) {
                case 1:
                    System.out.print("Insira o número de vértices: ");
                    int k = scanner.nextInt();
                    scanner.nextLine();
                    int m[][] = new int[k][k], v[] = new int[k];
                    grafos grafo = new grafos(m, v);
                    System.out.println("Grafo criado com " + k + " vértices");
                    System.out.println();
                    while (true) {
                        System.out.println("1 - Adicionar aresta");
                        System.out.println("2 - Exibir matriz");
                        System.out.println("3 - Sair do programa");
                        l = scanner.nextInt();
                        if (l == 3) {
                            break;
                        }
                        switch (l) {
                            case 1:
                                System.out.print("Digite o 1º vértice: ");
                                int v1 = scanner.nextInt();
                                System.out.println();
                                System.out.print("Digite o 2º vértice: ");
                                int v2 = scanner.nextInt();
                                System.out.println();
                                System.out.print("Digite o peso: ");
                                int peso = scanner.nextInt();
                                grafo.addAn(v1, v2, peso);
                                System.out.println("Aresta adicionada");
                                System.out.println("------------------------");
                                break;
                            case 2:
                                grafo.printarMatriz();
                                break;
                            default:
                                System.out.println("Saindo do programa");
                                break;
                        }
                    }
                case 2:
                    if(l==3){
                        System.out.println("Saindo do programa");
                        break;
                    }
                    System.out.print("Insira o número de vértices: ");
                    int a = scanner.nextInt();
                    scanner.nextLine();
                    int b[][] = new int[a][a], f[] = new int[a];
                    grafos grafe = new grafos(b, f);
                    System.out.println("Grafo criado com " + a + " vértices");
                    System.out.println();
                    while (true) {
                        System.out.println("1 - Adicionar aresta");
                        System.out.println("2 - Exibir matriz");
                        System.out.println("3 - Sair do programa");
                        l = scanner.nextInt();
                        if (l == 3) {
                            break;
                        }
                        switch (l) {
                            case 1:
                                System.out.print("Digite o 1º vértice: ");
                                int v1 = scanner.nextInt();
                                System.out.println();
                                System.out.print("Digite o 2º vértice: ");
                                int v2 = scanner.nextInt();
                                System.out.println();
                                System.out.print("Digite o peso: ");
                                int peso = scanner.nextInt();
                                grafe.addAo(v1, v2, peso);
                                System.out.println("Aresta adicionada");
                                System.out.println("------------------------");
                                break;
                            case 2:
                                grafe.printarMatriz();
                                break;
                            default:
                                System.out.println("Saindo do programa");
                                break;
                        }
                    }
                default:
                    System.out.println("Saindo do programa");
                    break;
            }
            scanner.close();
            break;
        }
    }
}
