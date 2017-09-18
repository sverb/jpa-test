import javax.persistence.EntityManager;

import persistency.PersistencyManager;
import verb.entities.Employee;


public class App {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setFirstName("John");
		e1.setSecondName("Doe");
		
		EntityManager em = PersistencyManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();
		
		em.close();
	}

}
