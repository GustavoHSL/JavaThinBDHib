package BancoDeDados;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="conta_corrente")
public class ContaCorrente extends Conta {
	
	@Column
	private Float limite;
	
	//por causa do Hibernate metodo deve ser criado vazio
	public ContaCorrente(){
		super(null);
	}
	
	//metodo construtor, setConta somente quando cria
	public ContaCorrente(String conta){ 
		super(conta);
	}

	public boolean sacar(Float valor){
		if(valor <= saldo + limite){
		saldo = saldo - valor;
		return true;
		}else{
			return false;
		}
	}}

