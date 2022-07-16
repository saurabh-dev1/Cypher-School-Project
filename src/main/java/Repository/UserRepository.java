package Repository;

import entity.users;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserRepository {
    EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("orm");

    public void saveUser(users user)
    {
        EntityManager manager=entityManagerFactory.createEntityManager();
        EntityTransaction  transaction=manager.getTransaction();
        try{
            transaction.begin();
            manager.persist(user);
            transaction.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            transaction.rollback();
        }


    }

}
