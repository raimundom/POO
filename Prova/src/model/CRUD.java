package model;
/**
 * @author Raimundo Medeiros
 */

import javax.persistence.*;
import org.hibernate.HibernateError;
import java.util.List;

public class CRUD {
	public static void inserir(Pessoa p1) {
		try {
			EntityManager entityManager = DAO.getEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(p1);
			entityManager.getTransaction().commit();
			entityManager.close();
			System.out.println("conectado Salvo!");
		} catch (HibernateError ex) {
			ex.printStackTrace();
		}
	}

	public static void atualizar(int id, String nome, String usuario, String telefone, String email, String contaCorrente, String senha, String tipo) {
		try {

			EntityManager entityManager = DAO.getEntityManager();

			Pessoa emp = entityManager.find(Pessoa.class, new Integer(id));
			entityManager.getTransaction().begin();
			emp.setNome(nome);
			emp.setUsuario(usuario);
			emp.setTelefone(telefone);
			emp.setEmail(email);
			emp.setContaCorrente(contaCorrente);
			emp.setSenha(senha);
			emp.setTipo(tipo);
			entityManager.getTransaction().commit();
			entityManager.close();
			System.out.println("Registro atualizado");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void remover(int id) {

		try {

			EntityManager entityManager = DAO.getEntityManager();
			entityManager.getTransaction().begin();
			Pessoa p = entityManager.find(Pessoa.class, new Integer(id));
			entityManager.remove(p);
			entityManager.getTransaction().commit();
			entityManager.close();
			System.out.println("registro\r\n" + "		  removido!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public List<Pessoa> listarTodasPessoas() {
		EntityManager entityManager = DAO.getEntityManager();
		Query query = entityManager.createQuery("SELECT p FROM Pessoa p");
		@SuppressWarnings("unchecked")
		List<Pessoa> lista = (List<Pessoa>) query.getResultList();

		if (lista.isEmpty()) {
		}
		return lista;

	}
}