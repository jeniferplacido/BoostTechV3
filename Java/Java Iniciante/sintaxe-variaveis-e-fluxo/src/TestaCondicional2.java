
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais!");
		
		int idade = 16;
		int qtdePessoas = 3;
		boolean acompanhado = qtdePessoas >=2;
		
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja Bem Vindo!");
		}else {
			System.out.println("Infelizmente você não pode entrar!");
		}
	}

}
