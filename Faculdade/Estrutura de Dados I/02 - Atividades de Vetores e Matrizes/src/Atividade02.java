/*import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serão analisadas:");
        int limite = 0;
        limite = scanner.nextInt();
        
        String[] nome = new String[limite];
        int[] idade = new int[limite];
        double[] altura = new double[limite];
        double[] peso = new double[limite];
        double[] imc = new double[limite];
        int ordem = 1;


        for(int i = 0; i<limite ;i++){
            System.out.println("Nome dá "+ordem+"º pessoa:");
            nome[i] = scanner.next();

            System.out.println("Altura em metros dá "+ordem+"º pessoa:");
            altura[i] = scanner.nextDouble();

            System.out.println("Peso em kilogramas dá "+ordem+"º pessoa:");
            peso[i] = scanner.nextDouble();

            System.out.println("Idade dá "+ordem+"º pessoa:");
            idade[i] = scanner.nextInt();
            ordem++;
            
            imc[i] = peso[i] / (altura[i] * altura[i]);
        }
        scanner.close();
        
        System.out.println("Pessoas com IMC alto(>= 25 e < 30):");

        for(int i = 0; i<limite; i++){
            if(imc[i]>= 25 & imc[i]<30 ){
                System.out.println(nome[i]);
            }
        }

        System.out.println("Pessoas com IMC normal(<25):");

         for(int i = 0; i<limite; i++){
            if(imc[i]< 25){
                System.out.println(nome[i]);
            }   
        }
    }
}
*/
