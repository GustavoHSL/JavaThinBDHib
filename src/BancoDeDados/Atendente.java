package BancoDeDados;

public class Atendente {

	public static void main(String[] args) {
		Conta minhaCC = new Conta("XX14-4");

		Conta c1 = new Conta("B123-1");

		Conta c2 = new ContaCorrente("D942-2");

		
		minhaCC.depositar(50F);//deposita 50 dilmas
		
		System.out.println(minhaCC.getSaldo());
		
		boolean saqueEfetuado = minhaCC.sacar(20F);//saca 20 dilmas
		
		if(saqueEfetuado){
		System.out.println(minhaCC.getSaldo());
		}else{
			System.out.println("Nao foi possivel sacar.");
			System.out.println("Voce so tem " + minhaCC.getSaldo() + " manolo." );
		}
		
		System.out.println("José " + c1.getSaldo());
		

		
	}

}
