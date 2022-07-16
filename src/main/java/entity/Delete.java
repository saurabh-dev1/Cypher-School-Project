package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
    EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("orm");
    public void DeleteUser(users user)
    {
        EntityManager manager= managerFactory.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        try{
            transaction.begin();
           users u= manager.find(users.class,2);
           manager.remove(u);
            transaction.commit();
        }
        catch(Exception e)
        {

        }
    }
}
