
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 20;
		int qtdePessoas = 3;
		boolean acompanhado;
		
		if(qtdePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja Bem Vindo!");
		}else {
			System.out.println("Infelizmente você não pode entrar!");
			
		}

	}

}
