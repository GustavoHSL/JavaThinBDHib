package BancoDeDados;

public class Funcionario1 {

		private Integer id;
		private String nome;
		private Float valorHora;
		private Double horasTrabalhadas = 0D;
		
		public void setId (Integer id){
			this.id = id;
		}
		
		public Integer getId(){
			return this.id;
		}
		
		public String setNome(String nome){
			return this.nome = nome;
		}
		
		public String getNome(){
			return this.nome;
		}
		
		public void setValorHora(Float valorHora){
			this.valorHora = valorHora;
		}
		
		
		public String toString(){
			return id + " - " + nome;		
		}
		
}
