package BancoDeDados;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="funcionario")
public class Funcionario {

	@Id
	@Column(name="id")
	
	private Integer id;
	
	@Column(name="name")
	private String nome;
	
	@Column(name="valorHora")
	private Float valorHora;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getValorHora() {
		return valorHora;
	}
	public void setValorHora(Float valorHora) {
		this.valorHora = valorHora;
	}
	
	
}
