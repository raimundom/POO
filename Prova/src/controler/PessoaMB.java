package controler;

import java.util.List;

import javax.faces.bean.ManagedBean;

import model.*;

@ManagedBean
public class PessoaMB {
	public PessoaMB() {

	}

	private Pessoa p = new Pessoa();

	public String getId() {
		return String.valueOf(p.getId());
	}

	public void setId(String id) {
		p.setId(Integer.parseInt(id));
	}

	public String getNome() {
		return p.getNome();
	}

	public void setNome(String nome) {
		p.setNome(nome);
	}

	public String getUsuario() {
		return p.getUsuario();
	}

	public void setUsuario(String usuario) {
		p.setUsuario(usuario);
	}

	public String getTelefone() {
		return p.getTelefone();
	}

	public void setTelefone(String telefone) {
		p.setTelefone(telefone);
	}

	public String getEmail() {
		return p.getEmail();
	}

	public void setEmail(String email) {
		p.setEmail(email);
	}

	public String getContaCorrente() {
		return p.getContaCorrente();
	}

	public String getSenha() {
		return p.getSenha();
	}

	public String getTipo() {
		return p.getTipo();
	}

	public void setContaCorrente(String contaCorrente) {
		p.setContaCorrente(contaCorrente);
	}

	public void setSenha(String senha) {
		p.setSenha(senha);
	}

	public void setTipo(String tipo) {
		p.setTipo(tipo);
	}

	// implementar demais getters e setters
	public void salvar() {
		try {
			CRUD.inserir(p);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void excluir(int id) {
		try {
			CRUD.remover(id);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public List<Pessoa> getAllPessoa() {

		CRUD con = new CRUD();
		return con.listarTodasPessoas();
	}

	public void Atualizar(int id, String nome, String usuario, String telefone, String email, String contaCorrente,
			String senha, String tipo) {
		try {
			CRUD.atualizar(id, nome, usuario, telefone, email, contaCorrente, senha, tipo);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}