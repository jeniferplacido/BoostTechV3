
public class CriarConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("Na primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Na segunda conta tem: " + segundaConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda est? na ag?ncia: " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("? a mesma conta!");
		}else {
			System.out.println("S?o contas diferentes!");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
