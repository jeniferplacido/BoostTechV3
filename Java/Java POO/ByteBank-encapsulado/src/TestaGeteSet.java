
public class TestaGeteSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24700);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome ("Paulo");
		
		conta.setTitular(paulo);
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("programador");
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());

	}

}
