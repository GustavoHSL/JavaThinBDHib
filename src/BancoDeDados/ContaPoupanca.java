package BancoDeDados;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="conta_poupanca")
public class ContaPoupanca extends Conta {

	//por causa do Hibernate metodo deve ser criado vazio
	public ContaPoupanca(){
		super(null);
	}
	
	//metodo construtor, setConta somente quando cria
	public ContaPoupanca(String conta){ 
		super(conta);
	}
	@Override
	public Float getSaldo() {
		return saldo+ saldo*5/1000;
	}
	
	
	public boolean sacar(Float valor){
		if(valor <= saldo){
		saldo = saldo - valor;
		return true;
		}else{
			return false;
		}
	}}

