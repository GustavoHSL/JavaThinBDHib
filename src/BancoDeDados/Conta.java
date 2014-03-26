package BancoDeDados;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Conta {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)//gerado pelo mySQL
	@Column
	protected Integer id;
	@Column
	protected String conta;
	@Column
	protected Float saldo = 0F; //F é por causa da convenção em Java
	
	
	//metodo construtor, setConta somente quando cria
	public Conta(String conta){ 
		this.conta = conta;
	}
	
	public String getConta() {
		return conta;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void depositar(Float valor){
		saldo = saldo + valor;
	}
	
	public abstract boolean sacar(Float valor);
}
