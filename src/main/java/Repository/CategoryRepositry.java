package Repository;

import entity.Category;

import javax.persistence.*;
import java.util.List;

public class CategoryRepositry {
    EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("orm");
    public void saveCat(Category cat)
    {
        EntityManager manager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        try{
            transaction.begin();
            manager.persist(cat);
            transaction.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            transaction.rollback();
        }

    }
}
