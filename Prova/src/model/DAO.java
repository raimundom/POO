/**
 * @author Raimundo MEdeiros
 */
package model;

import javax.persistence.*;
public class DAO {
	/**
	 * @see - Classe Dao utilizada para estabelecer a conexao com o Hibernate
	 */
 private static final EntityManagerFactory emFactory;
 static {
  emFactory =Persistence.createEntityManagerFactory("fazendadb");
 }
 
 /**
  * @category Conexao
  * @see Busca a conexao estabelecido pelo Hibernate
  */
 public static EntityManager getEntityManager() {
	 
  return emFactory.createEntityManager();
 }
 
 /**
  * @see fecha a conexao com o Hibernate
  */
 public static void fecharFactory() {
 emFactory.close();
 }
}
