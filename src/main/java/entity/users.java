package entity;

import javax.persistence.*;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

@Entity
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "profile_id")
    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE,fetch = FetchType.EAGER)
   // private ArrayList<Video> videos;
    private Profile profile;

    public users() {
    }

    public users(String username, String password, Profile profile) {
        this.username = username;
        this.password = password;
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
      this.profile = profile;
  }

   // public ArrayList<Video> getVideos() {
      //  return videos;
 //   }

    //public void setVideos(ArrayList<Video> videos) {
     //   this.videos = videos;
   // }

    @Override


    public String toString() {
        return "users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", profile=" + profile +
                '}';
    }

}
