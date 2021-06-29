
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDaJeni = new Conta();
		contaDaJeni.saldo = 100;
		contaDaJeni.deposita(50);
		System.out.println(contaDaJeni.saldo);
		contaDaJeni.saca(20);
		System.out.println(contaDaJeni.saldo);
		
		boolean conseguiuRetirar = contaDaJeni.saca(20);
		System.out.println(contaDaJeni.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaJeni);
		if (sucessoTransferencia){
			System.out.println("Transferência realizada com sucesso!");
		}else{
			System.out.println("Faltou Dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaJeni.saldo);
		
		contaDaJeni.titular = "Jenifer Plácido";
		System.out.println(contaDaJeni.titular);

	}

}
