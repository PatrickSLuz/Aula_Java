package br.edu.ctup.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.ctup.DAO.ClienteDAO;
import br.edu.ctup.DAO.DAO;
import br.edu.ctup.bean.Cliente;

public class ClienteDAOImpl extends DAO implements ClienteDAO{

	Cliente cliente = new Cliente();
	
	EntityManager em;
	
	@Override
	public void salvar(Cliente cliente) {
		em = getEntityManager();
		try {
			if(cliente.getCodigo()==null) {
				em.getTransaction().begin(); // Abre a transação com o BD;
				em.persist(cliente); // Persiste um objeto no Banco;
				em.getTransaction().commit(); // Confirma/Comita a execução anterior;
			}else {
				em.getTransaction().begin(); // Abre a transação com o BD;
				em.merge(cliente); // Persiste um objeto no Banco;
				em.getTransaction().commit(); // Confirma/Comita a execução anterior;
			}
		} catch(Exception e) {
			e.getStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

	@Override
	public void excluir(Integer codigo) {
		em = getEntityManager();
		em.getTransaction().begin();
		Cliente cli = em.find(Cliente.class, codigo); // faz uma busca no banco pelo codigo;
		em.remove(cli);
		em.getTransaction().commit();
	}
	
	public Cliente editar(Integer codigo) {
		em = getEntityManager();
		return em.find(Cliente.class, codigo);
	}
	

	@Override
	public List<Cliente> listarTodos() {
		em = getEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("select object(c) from Cliente as c");
		return q.getResultList();
		
	}

	@Override
	public Cliente autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente autenticar(Cliente cliente) {
		em = getEntityManager();
		return em.find(Cliente.class, cliente.getLogin());

	}
}
