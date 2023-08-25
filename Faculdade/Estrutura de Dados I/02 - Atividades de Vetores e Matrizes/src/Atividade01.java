/*import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] valor = new int[50];
        int menor = 100000;
        int maior = 0;
        int soma = 0;
        double media = 0;

        System.out.println("Digite 50 numeros inteiros e positivos:");

        for(int i = 0; i < 3; i++){
            valor[i] = scanner.nextInt();

                if (valor[i]> maior) {
                    maior = valor[i];
                }
                if (valor[i] < menor) {
                    menor = valor[i];
                }
                soma+=valor[i];
        }
        scanner.close();
        media = soma/50;

        System.out.println("O maior valor é: "+ maior);
        System.out.println("O menor valor é: "+ menor);
        System.out.println("A media da soma dos valores é: "+ media);
    }
}

*/