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