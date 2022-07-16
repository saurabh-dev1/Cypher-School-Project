import Repository.CategoryRepositry;
import Repository.UserRepository;
import Repository.VideoRepository;
import entity.*;
import org.hibernate.boot.archive.scan.spi.Scanner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.lang.Object System;
        Scanner sc= new Scanner(System.in);
        Login log = new Login();
        String name= sc.nextLine();
        String password=sc.nextLine();
        boolean f=log.login(name,password);
        if(f)
        {
            System.out.println("login Sucessfully");
        }
        else{
            System.out.println("username or password Incorrect");
        }

            users user = new users("siddhardhmainam", "siddu@24", new Profile("siddhardh", "mainam", "siddhardhmainam@gmail.com", 20, "hyderabad"));
            // ArrayList<Video> videoArrayList= new ArrayList<>();
            UserRepository userRepository = new UserRepository();

        //userRepository.saveUser(user);

        Video video=new Video("java"," learn java ","cipherSchool.com",new Date(),user);
       // videoArrayList.add(video);
     //   user.setVideos(videoArrayList);
        List<Category> cat=new ArrayList<>();
        cat.add(new Category("technical"));
        video.setC(cat);
        CategoryRepositry ct = new CategoryRepositry();
        for(Category c:cat)
        {
            ct.saveCat(c);
        }
        VideoRepository videoRepository= new VideoRepository();
        videoRepository.saveVideo(video);
        Update update=new Update();
        update.updateUser(user);
        Delete delete=new Delete();
        delete.DeleteUser(user);
        update.profile();
        update.updateCategory();




    }
}
