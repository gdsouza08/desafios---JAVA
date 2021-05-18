Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.



Resolução:

import java.io.IOException;
import java.util.Scanner;

public class ExibindoPares {
    
	
    public static void main(String[] args) throws IOException {
    
    	Scanner sc = new Scanner(System.in);
    	
    	int resposta = sc.nextInt();
    
    		for (int i = 1 ; i <= resposta ; i++) {
    			if (i % 2 == 0  ) System.out.println(i);
    		}
    	sc.close();
    }
}





------------------------------------------------------------------------------------------

Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence.



Resolução:

import java.io.IOException;
import java.util.Scanner;

public class Classe {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int DDD = leitor.nextInt();
        switch (DDD) {
            case 61: 
            System.out.println("Brasilia"); 
            break;
            //continue o desafio
            case 71:
            System.out.println("Salvador");
            break;
            case 11:
            System.out.println("Sao Paulo");
            break;
            case 21:
            System.out.println("Rio de Janeiro");
            break;
            case 32:
            System.out.println("Juiz de Fora");
            break;
            case 19:
            System.out.println("Campinas");
            break;
            case 27:
            System.out.println("Vitoria");
            break;
            case 31:
            System.out.println("Belo Horizonte");
            break;
            default: System.out.println("DDD nao cadastrado");
        }
    
        leitor.close();
    }

}