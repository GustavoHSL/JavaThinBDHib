package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BancoDeDados {

	public static void main(String[] args) throws ClassNotFoundException,

	SQLException {
		while(true){
		System.out.println("O que deseja?\n1-Inserir funcionario\n2-Pesquisar" );
		Scanner scanner = new java.util.Scanner(System.in);
		String opcao = scanner.nextLine();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://192.168.1.33:3306/javathin", "javathin",
				"javathin");
		

		
		switch (opcao) {
		case "1":
			System.out.println("Cadastro de Funcionario\nNome: " );
			String nome = scanner.nextLine();
			System.out.println("Valor da Hora: " );
			String valorHora = scanner.nextLine();
			
			String sql = "insert into funcionario (nome,valorHora)" 
					+ "values ( ?,? )";

			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, nome);
			pst.setDouble(2,Double.valueOf(valorHora));
			pst.execute();
			pst.close();
			
			break;
		case "2":
			PreparedStatement select = conn.prepareStatement("select * from funcionario where nome = ( ? )");		
			
			System.out.println("Digite o nome: " );
			String pesquisa = scanner.nextLine();
			select.setString(1,pesquisa);
			ResultSet rs = select.executeQuery();
			
			while(rs.next()){
				System.out.println("ID: " + rs.getInt("id") +
						" - Nome: " + rs.getString("nome"));
			}

			/*while(rs.next()) { //metodo next verifica se tem mais uma linha, e vai até o final
				if(rs.getString("nome").equals(pesquisa)) {
					System.out.println("ID: " + rs.getInt("id") +
				
						" - Nome: " + rs.getString("nome"));
				}
			}*/
			rs.close();
			select.close();
			conn.close();

			break;
		default:
			System.out.println("Tente novamente");
			break;
		}
/*		
		
		PreparedStatement select = conn.prepareStatement("select * from funcionario");
		
		ResultSet rs = select.executeQuery();
		
		while(rs.next()) { //metodo next verifica se tem mais uma linha, e vai até o final
			System.out.println("ID: " + rs.getInt("id") +
					" - Nome: " + rs.getString("nome"));
		}

		rs.close();
		select.close();
		conn.close();
		
		
		 * Statement stmt = conn.createStatement();
		 * 
		 * stmt.exec
		 */
	}
	}
	
}
