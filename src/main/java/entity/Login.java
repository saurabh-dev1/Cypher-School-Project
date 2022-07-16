package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Login {
    public Boolean login(String name,String Password)
    {
        boolean flag=false;

        EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("orm");
        EntityManager manager =managerFactory.createEntityManager();
        TypedQuery<users> query=manager.createQuery("select u from users u",users.class);
       List<users> list= query.getResultList();
       for(users u:list)
       {
           if(u.getUsername().equals(name))
           {
               if(u.getPassword().equals(Password)) {
                   flag = true;
                   break;
               }

           }
       }
       return flag;




    }
}
