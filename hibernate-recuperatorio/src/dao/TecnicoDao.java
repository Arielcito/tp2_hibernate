package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Tecnico;

public class TecnicoDao {
	private static Session session;
	private Transaction tx;
	private static TecnicoDao instancia = null; // Patrón Singleton

	protected TecnicoDao() {
	}

	public static TecnicoDao getInstance() {
		if (instancia == null)
			instancia = new TecnicoDao();
		return instancia;
	}

	protected void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	protected void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("LOG: ERROR en la capa de acceso a datos", he);
	}

	public Tecnico traer(int idTecnico) {
		Tecnico objeto = null;
		try {
			iniciaOperacion();
			objeto = (Tecnico) session.createQuery("from Tecnico t where t.id=:idTecnico")
						.setParameter("idTecnico", idTecnico).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}

	public List<Tecnico> traer() throws HibernateException {
		List<Tecnico> lista = null;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Tecnico", Tecnico.class).list();
		} finally {
			session.close();
		}
		return lista;
	}
}
