
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais!");
		
		int idade = 16;
		int qtdePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos.");
			System.out.println("Seja Bem Vindo!");
			
		}else{
			if(qtdePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos,"
						+ " mas est� acompanhado, pode entrar!");
			}else {
			System.out.println("Infelizmente voc� "
					+ "n�o pode entrar!");
		}

	}

}
}
