import java.sql.Date;

import org.hibernate.Session;

import Objetos.Direccion;
import Objetos.Empresa;
import Objetos.Pedido;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		
		
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}

}
