
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente jenifer = new Cliente();
		jenifer.nome= "Jenifer Pl?cido";
		jenifer.cpf = "222.333.444-55";
		jenifer.profissao = "Programadora";
		
		Conta contaDaJenifer = new Conta();
		contaDaJenifer.deposita(100);
		
		contaDaJenifer.titular = jenifer;
		System.out.println(contaDaJenifer.titular.nome);
		System.out.println(contaDaJenifer.titular);

	}

}
