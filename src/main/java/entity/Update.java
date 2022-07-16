package entity;

import javax.persistence.*;

public class Update {
    EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("orm");

    public void updateUser(users user)
    {
        EntityManager manager= managerFactory.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        try{
            transaction.begin();
            users u=manager.find(users.class,2);
            u.setUsername("siddhardh");
            manager.merge(u);

            transaction.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            transaction.rollback();

        }

    }
    public void profile()
    {
        EntityManager manager= managerFactory.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        try{
            transaction.begin();
            users us=manager.find(users.class,2);
            us.getProfile().setFirstname("sidd");
            manager.merge(us);

        }
        catch(Exception e)
        {
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public void updateCategory()
    {
        EntityManager manager= managerFactory.createEntityManager();
        EntityTransaction transaction=manager.getTransaction();
        try{
            transaction.begin();
            Category cat=manager.find(Category.class,1);
            cat.setCategory_name("hibernete");
            manager.merge(cat);
            transaction.commit();

        }
        catch (Exception e)
        {
            e.printStackTrace();
            transaction.rollback();
        }
    }
}
