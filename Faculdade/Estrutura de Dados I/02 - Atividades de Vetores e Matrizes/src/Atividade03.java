/*import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[50][3];
        String[] nome = new String[3];

        for(int i = 0; i< 50; i++){
            System.out.println("Qual o nome do "+(i+1)+"º Aluno:");
            nome[i] = scanner.nextLine();

            System.out.println("Qual a nota 1 do aluno "+nome[i]+":");
            matriz[i][0] = Double.parseDouble(scanner.nextLine());

            System.out.println("Qual a nota 2 do aluno "+nome[i]+":");
            matriz[i][1] = Double.parseDouble(scanner.nextLine());

            matriz[i][2] = (matriz[i][0]+matriz[i][1]) / 2;

            if(matriz[i][2] >= 6){
                System.out.println("Aluno "+nome[i]+" com media "+matriz[i][2]+" Aprovado");
            }else{
                System.out.println("Aluno "+nome[i]+" com media "+matriz[i][2]+" Reprovado");
            }
        }
        scanner.close();
    }
}
*/
