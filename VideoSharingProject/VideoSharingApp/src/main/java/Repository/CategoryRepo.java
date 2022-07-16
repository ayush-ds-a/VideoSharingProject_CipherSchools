package Repository;

import Entity.Category;
import Entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CategoryRepo {
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("orm");

    public void saveCategory(Category category){
        EntityManager manager = managerFactory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        try {
            transaction.begin();
            manager.persist(category);
            transaction.commit();
        }
        catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
}
