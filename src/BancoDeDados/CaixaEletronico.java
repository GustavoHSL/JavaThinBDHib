package BancoDeDados;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class CaixaEletronico {

	public static void main(String[] args) {
		

		
		Session sessao = HibernateUtil.getSession();// iniciar sessão
		sessao.beginTransaction();

		Conta minhaCC = 
				(Conta) sessao.createCriteria(ContaCorrente.class)
				.add(Restrictions.eq("conta","123"))
				.uniqueResult();
		
		Conta minhaCS = 
				(Conta) sessao.createCriteria(ContaSalario.class)
				.add(Restrictions.eq("conta","123"))
				.uniqueResult();
		
		Conta minhaCP = 
				(Conta) sessao.createCriteria(ContaPoupanca.class)
				.add(Restrictions.eq("conta","213"))
				.uniqueResult();

		//conta corrente deposito
		System.out.println("Saldo CC: " + minhaCC.getSaldo());
		minhaCC.depositar(200F);
		System.out.println("Novo Saldo depois de depositar CC: " + minhaCC.getSaldo());
		//conta salario deposito
		System.out.println("Saldo CS: " + minhaCS.getSaldo());
		minhaCS.depositar(200F);
		System.out.println("Novo Saldo depois de depositar CS: " + minhaCS.getSaldo());
		//conta poupanca deposito
		System.out.println("Saldo CP: " + minhaCP.getSaldo());
		minhaCS.depositar(200F);
		System.out.println("Novo Saldo depois de depositar CP: " + minhaCP.getSaldo());
		
		
		sessao.update(minhaCC);//atualiza BD
		sessao.update(minhaCS);//atualiza BD
		sessao.update(minhaCP);//atualiza BD
		sessao.getTransaction().commit();//commitar sessao para salvar informacoes no BD
		sessao.close();
	}
}
