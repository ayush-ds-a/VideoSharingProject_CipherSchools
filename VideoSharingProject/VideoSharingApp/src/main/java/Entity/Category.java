package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String categoryName;
    @ManyToMany(mappedBy ="categories" ,fetch = FetchType.LAZY)

    private List<Video> videos = new ArrayList<>();

    public Category() {
    }

    public Category(int id, String categoryName, List<Video> videos) {
        this.id = id;
        this.categoryName = categoryName;
        this.videos = videos;
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
