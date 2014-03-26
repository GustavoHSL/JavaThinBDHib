package BancoDeDados;

import java.util.List;

import org.hibernate.Session;


public class HibernateTeste {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		List list = session.createCriteria(Funcionario.class).list();
		
		System.out.println("Funcionarios: " + list.size());
	
		Funcionario f = new Funcionario();
		f.setNome("Kuririn");
		f.setValorHora(1F);
		f.setId(list.size()+1);
		session.save(f);
		
		/*Funcionario f = (Funcionario) session.get(Funcionario.class, 1);
		f.setValorHora(15F);
		session.update(f);
		
		Funcionario f = (Funcionario) session.get(Funcionario.class, 1);
		session.delete(f);*/
		
		session.getTransaction().commit();
		session.close();
	}

}
