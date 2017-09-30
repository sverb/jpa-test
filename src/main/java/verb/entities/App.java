package verb.entities;
import javax.persistence.EntityManager;

import persistency.PersistencyManager;
import verb.entities.graph.Node;


public class App {

	public static void main(String[] args) {

	
		EntityManager em = PersistencyManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		
		Node a = new Node();
		a.setName("A");
		Node b = new Node();
		b.setName("B");
		a.getChildren().add(b);
		
		em.persist(a);
		em.persist(b);
		
		
		
		em.getTransaction().commit();
		
		
		Node found = em.find(Node.class, 1L);
		
		System.out.println(found.getName() + "=>" +found.getChildren().get(0).getName());
		
		em.close();
	}

}
