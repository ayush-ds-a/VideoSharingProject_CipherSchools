package Repository;

import Entity.Users;
import Entity.Video;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VideoRepo{
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("orm");

        public void uploadVideo (Video video){
            EntityManager manager = managerFactory.createEntityManager();
            EntityTransaction transaction = manager.getTransaction();
            try {
                transaction.begin();
                manager.persist(video);
                transaction.commit();
            }
            catch (Exception e){
                e.printStackTrace();
                transaction.rollback();
            }
        }
}
