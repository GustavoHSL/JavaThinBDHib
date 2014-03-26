package BancoDeDados;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="conta_salario")
public class ContaSalario extends Conta {

	//por causa do Hibernate metodo deve ser criado vazio
	public ContaSalario(){
		super(null);
	}
	
	//metodo construtor, setConta somente quando cria
	public ContaSalario(String conta){ 
		super(conta);
	}
	
	public boolean sacar(Float valor){
		if(valor <= saldo){
		saldo = saldo - valor;
		return true;
		}else{
			return false;
		}
	}}

