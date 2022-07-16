package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Video{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int id;
    private String title;
    private String description;
    private String url;
    private Date date;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = " user_id")
    private Users user;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Category> categories = new ArrayList<>();
    public Video(){
    }
    public Video(int id, String title, String description, String url, Date date, Users user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.date = date;
        this.user = user;
    }

    public Video(String title, String description, String url, Date date,Users user) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.date = date;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
