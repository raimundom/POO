package model;

/**
 * @author Raimundo Medeiros
 */

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {
	
	/**
	 * @category Modelo
	 * @since versao 1
	 * @see Classe de para criação do objeto pessoa
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String nome;
	@Column
	private String usuario;
	@Column
	private String telefone;
	@Column
	private String email;
	@Column
	private String senha;
	@Column
	private String ContaCorrente;
	@Column
	private String tipo;

	// criação getters e setters

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getContaCorrente() {
		return ContaCorrente;
	}

	public void setContaCorrente(String contaCorrente) {
		ContaCorrente = contaCorrente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		
		return nome;
	}

	public int getId() {
		
		return id;
	}

	public String getUsuario() {
	
		return usuario;
	}

	public String getTelefone() {
		
		return telefone;
	}

	public String getEmail() {
		
		return email;
	}

}
