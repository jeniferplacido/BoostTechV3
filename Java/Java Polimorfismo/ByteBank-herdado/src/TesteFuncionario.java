
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("123456789-00");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getSalario());
		System.out.println(nico.getBonificacao());
	}

}
