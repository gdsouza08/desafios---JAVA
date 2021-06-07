import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
   
        System.out.println("Escolhha a operação a ser realizada: ");
        System.out.println("[1] para adição");
        System.out.println("[2] para subtração");
        System.out.println("[3] para multiplicação");
        System.out.println("[4] pra divisão");
        System.out.println("[5] para sair ");
        System.out.print("Qual a sua opção? ");
       
        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();

        if (opcao == 5) {
            System.out.println("Saindo do programa...");
            System.exit(0);
        }
        /*else{
            if (opcao != 1 || opcao != 2 || opcao != 3 || opcao != 4) {
                System.out.println("Opção inválida");
                System.out.println("Encerrando programa...");
                System.exit(0);
            }
        }*/

        System.out.print("Digite um valor: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite outro valor: ");
        int n2 = leitor.nextInt();
       
        switch (opcao) {
            case 1:
            int adicao = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + adicao);
            break;
            case 2:
            int subtracao = n1 - n2;
            System.out.println(n1 + " - " + n2 + " = " + subtracao);
            break;
            case 3:
            int multiplicação = n1 * n2;
            System.out.println(n1 + " * " + n2 + " = " + multiplicação);
            break;
            case 4:
            int  divisão = n1 / n2;
            System.out.println(n1 + " / " + n2 + " = " + divisão);
            break;
            default:
            System.out.println("Opção inválida.");
        }
    }
}
