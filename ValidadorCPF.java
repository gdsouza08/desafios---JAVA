import javax.swing.JOptionPane;

public class ValidadorCPF {

	public static void main (String args []) {
	
		String CPF = JOptionPane.showInputDialog (null, "Entre com o número de CPF", "Entre com o CPF", JOptionPane.PLAIN_MESSAGE);
		
		if (CPF.length() != 11 || CPF.equals("11111111111")  || CPF.equals("22222222222") || CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555") || CPF == "66666666666" || CPF.equals("77777777777") || CPF.equals("88888888888") || CPF.equals("99999999999") || CPF.equals("00000000000")) {
		
			JOptionPane.showMessageDialog (null, "Número de CPF inválido, por favor insira um novo", "CPF inválido", JOptionPane.ERROR_MESSAGE);
		
		}
		
		else {
		
			int numero_01 = Integer.parseInt (CPF.substring(0, 1));  
			int numero_02 = Integer.parseInt (CPF.substring(1, 2));  
			int numero_03 = Integer.parseInt (CPF.substring(2, 3));  
			int numero_04 = Integer.parseInt (CPF.substring(3, 4));  
			int numero_05 = Integer.parseInt (CPF.substring(4, 5));  
			int numero_06 = Integer.parseInt (CPF.substring(5 ,6));  
			int numero_07 = Integer.parseInt (CPF.substring(6, 7));  
			int numero_08 = Integer.parseInt (CPF.substring(7, 8));  
			int numero_09 = Integer.parseInt (CPF.substring(8, 9));  
			int numero_10 = Integer.parseInt (CPF.substring(9, 10));  
			int numero_11 = Integer.parseInt (CPF.substring(10, 11));  
			
			int digito_01_numero_01 = numero_01 * 10;
			int digito_01_numero_02 = numero_02 * 9;
			int digito_01_numero_03 = numero_03 * 8;
			int digito_01_numero_04 = numero_04 * 7;
			int digito_01_numero_05 = numero_05 * 6;
			int digito_01_numero_06 = numero_06 * 5;
			int digito_01_numero_07 = numero_07 * 4;
			int digito_01_numero_08 = numero_08 * 3;
			int digito_01_numero_09 = numero_09 * 2;
			
			int soma_01 = digito_01_numero_01 + digito_01_numero_02 + digito_01_numero_03 + digito_01_numero_04 + digito_01_numero_05 + digito_01_numero_06 + digito_01_numero_07 + digito_01_numero_08 + digito_01_numero_09;
			
			int digito_01 = soma_01 % 11;
			
			if (digito_01 < 2) {
			
				digito_01 = 0;
			
			}
			
			else {
			
				digito_01 = 11 - digito_01;
			
			}
			
			System.out.println (digito_01);
			
			int digito_02_numero_01 = numero_01 * 11;
			int digito_02_numero_02 = numero_02 * 10;
			int digito_02_numero_03 = numero_03 * 9;
			int digito_02_numero_04 = numero_04 * 8;
			int digito_02_numero_05 = numero_05 * 7;
			int digito_02_numero_06 = numero_06 * 6;
			int digito_02_numero_07 = numero_07 * 5;
			int digito_02_numero_08 = numero_08 * 4;
			int digito_02_numero_09 = numero_09 * 3;
			int digito_02_numero_10 = numero_10 * 2;
			
			int soma_02 = digito_02_numero_01 + digito_02_numero_02 + digito_02_numero_03 + digito_02_numero_04 + digito_02_numero_05 + digito_02_numero_06 + digito_02_numero_07 + digito_02_numero_08 + digito_02_numero_09 + digito_02_numero_10;
			
			int digito_02 = soma_02 % 11;
			
			if (digito_02 < 2) {
			
				digito_02 = 0;
			
			}
			
			else {
			
				digito_02 = 11 - digito_02;
				
			}
			
			System.out.println (digito_02);
			
			if (numero_10 != digito_01 || numero_11 != digito_02) {
		
				JOptionPane.showMessageDialog (null, "Número de CPF inválido, por favor insira um novo", "CPF inválido", JOptionPane.ERROR_MESSAGE);	
		
			}

			else {
			
				JOptionPane.showMessageDialog (null, "Número de CPF " + CPF + " foi válidado. Número de CPF correto", "CPF válido", JOptionPane.INFORMATION_MESSAGE);					
			
			}
		}
	}			
}