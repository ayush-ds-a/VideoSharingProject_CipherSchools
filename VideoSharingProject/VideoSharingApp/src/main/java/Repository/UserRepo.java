package Repository;

import Entity.Profile;
import Entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserRepo {
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("orm");

    public void saveUser(Users users){
        EntityManager manager = managerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try {
            transaction.begin();
            manager.persist(users);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
}
