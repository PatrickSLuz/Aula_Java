package br.edu.ctup.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.ctup.DAO.ClienteDAO;
import br.edu.ctup.DAO.DAO;
import br.edu.ctup.bean.Cliente;

public class ClienteDAOImpl extends DAO implements ClienteDAO{

	Cliente cliente = new Cliente();
	
	@Override
	public void salvar(Cliente cliente) {
		EntityManager em = getEntityManager(); // Pegando a conexão com o BD;
		em.getTransaction().begin(); // Abre a transação com o BD;
		em.persist(cliente); // Persiste um objeto no Banco;
		em.getTransaction().commit(); // Confirma/Comita a execução anterior;
	}

	@Override
	public void excluir(Integer codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listarTodos() {
		EntityManager em = getEntityManager(); // Pegando a conexão com o BD;
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
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
