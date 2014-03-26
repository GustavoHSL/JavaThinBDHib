package BancoDeDados;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Funcionario.class);// Funcionario
															// representa tabela
															// no BD
		configuration.addAnnotatedClass(ContaCorrente.class);// ContaCorrente
																// representa
																// uma tabela no
																// BD
		configuration.addAnnotatedClass(ContaSalario.class);// ContaSalario
															// representa uma
															// tabela no BD
		configuration.addAnnotatedClass(ContaPoupanca.class);
		StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();

		standardServiceRegistryBuilder.applySettings(configuration
				.getProperties());

		ServiceRegistry registry = standardServiceRegistryBuilder.build();

		return configuration.buildSessionFactory(registry);
		/*
		 * private static SessionFactory buildSessionFactory(){
		 * 
		 * new Configuration().configure().buildSessionFactory() new
		 * StandardServiceRegistryBuilder().build() );
		 */

	}

	public static Session getSession() {

		return sessionFactory.openSession();
	}
}
