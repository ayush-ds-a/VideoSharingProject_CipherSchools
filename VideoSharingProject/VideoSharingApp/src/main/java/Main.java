import Entity.Category;
import Entity.Profile;
import Entity.Users;
import Entity.Video;
import Repository.CategoryRepo;
import Repository.UserRepo;
import Repository.VideoRepo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Users users = new Users("Rahul123","qwerty",new Profile("Rahul","Singh",24,"rahul@123.gmail.com","Amritsar"));
        ArrayList<Video> videoArrayList = new ArrayList<>();

        UserRepo userRepo = new UserRepo();

        Video video = new Video("Java", "Learn java with w3Schools","https://www.w3schools.com",new Date(),users);
        videoArrayList.add(video);
        users.setVideos(videoArrayList);
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("Technical"));
        categories.add(new Category("Educational"));
        video.setCategories(categories);
        userRepo.saveUser(users);

        CategoryRepo repo = new CategoryRepo();
        for(Category category: categories){
            repo.saveCategory(category);
        }
        VideoRepo videoRepo = new VideoRepo();
        videoRepo.uploadVideo(video);
    }
}

