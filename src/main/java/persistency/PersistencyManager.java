package persistency;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public enum PersistencyManager {
	INSTANCE;
	
	private EntityManagerFactory emFactory;
	
	private PersistencyManager(){
		emFactory = Persistence.createEntityManagerFactory("jpa-example");
	}
	
	public EntityManager getEntityManager(){
		return emFactory.createEntityManager();
	}
	
	public void close(){
		emFactory.close();
	}
}
