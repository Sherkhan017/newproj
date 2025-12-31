import java.util.*;

public class Main {
    public static void main(String[] args) {

        Profile n1 = new Profile(17, "@sherkhan", "student");
        Profile n2 = new Profile(20, "@ali", "blogger");

        Post p1 = new ImagePost(10, "Ali", "Nice photo!", "photo.jpg");
        Post p2 = new ImagePost(200, "Sherkhan", "Holiday", "beach.png");


        List<Post> posts = new ArrayList<>();
        posts.add(p1);
        posts.add(p2);

        List<Profile> profiles = new ArrayList<>();
        profiles.add(n1);
        profiles.add(n2);


        System.out.println("Filtered posts (likes > 50):");
        for (Post p : posts) {
            if (p.getLikesCount() > 50) {
                System.out.println(p);
            }
        }


        System.out.println("Searching profile:");
        for (Profile p : profiles) {
            if (p.getUserName().equals("@ali")) {
                p.verifyProfile();
            }
        }


        posts.sort(Comparator.comparingInt(Post::getLikesCount));
        System.out.println("Sorted posts:");
        for (Post p : posts) {
            System.out.println(p);
        }


        p1.showPostinfo();
        p2.showPostinfo();
    }
}
